package com.bharath.boot.batch.config;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.bharath.boot.batch.model.Product;

@Configuration
public class BatchConfig {

	@Autowired
	private StepBuilderFactory stepBuilderFactory;

	@Autowired
	private JobBuilderFactory jobBuilderFactory;
	
	private final int CHUNK_SIZE = 3;

	@Bean
	public Step step() {
		return stepBuilderFactory.get("step1")
								 .<Product, Product>chunk(CHUNK_SIZE)
								 .reader(reader())
								 .processor(processor())
								 .writer(writer())
								 .build();
	}

	@Bean
	public Job job() {
		return jobBuilderFactory.get("job1")
								.incrementer(new RunIdIncrementer())
								.start(step())
								.build();
	}

	@Bean
	public ItemReader<Product> reader() {
		FlatFileItemReader<Product> flatFileItemReader = new FlatFileItemReader<>();
		flatFileItemReader.setResource(new ClassPathResource("products.csv"));
		DefaultLineMapper<Product> defaultLineMapper = new DefaultLineMapper<>();
		DelimitedLineTokenizer delimitedLineTokenizer = new DelimitedLineTokenizer();
		delimitedLineTokenizer.setNames("id", "name", "desciption", "price");
		BeanWrapperFieldSetMapper<Product> beanWrapperFieldSetMapper = new BeanWrapperFieldSetMapper<>();
		beanWrapperFieldSetMapper.setTargetType(Product.class);
		defaultLineMapper.setLineTokenizer(delimitedLineTokenizer);
		defaultLineMapper.setFieldSetMapper(beanWrapperFieldSetMapper);
		flatFileItemReader.setLineMapper(defaultLineMapper);
		return flatFileItemReader;
	}

	@Bean
	public ItemProcessor<Product, Product> processor() {
		return (p -> {
			p.setPrice(p.getPrice() - p.getPrice() * 10 / 100);
			return p;
		});
	}

	@Bean
	public ItemWriter<Product> writer() {
		JdbcBatchItemWriter<Product> jdbcBatchItemWriter = new JdbcBatchItemWriter<>();
		jdbcBatchItemWriter.setDataSource(mysqlDataSource());
		jdbcBatchItemWriter.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>());
		jdbcBatchItemWriter.setSql("INSERT INTO PRODUCT(ID,NAME,DESCRIPTION,PRICE) VALUES (:id,:name,:description,:price)");
		return jdbcBatchItemWriter;
	}

	public DataSource mysqlDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/mydb");
		dataSource.setUsername("root");
		dataSource.setPassword("Welcome@123");
		return dataSource;
	}
}
