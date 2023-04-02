package com.company;

import com.company.dao.ApplicationDao;
import com.company.model.CollegeStudent;
import com.company.service.ApplicationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class Udemyspringbootunittestingluv2codeApplication {

    public static void main(String[] args) {
        SpringApplication.run(Udemyspringbootunittestingluv2codeApplication.class, args);
    }

    @Bean(name = "collegeStudent")
    @Scope(value = "prototype")
    CollegeStudent getCollegeStudent() {
        return new CollegeStudent();
    }

    @Bean(name = "applicationExample")
    ApplicationService getApplicationService() {
        return new ApplicationService();
    }

    @Bean(name = "applicationDao")
    ApplicationDao getApplicationDao() {
        return new ApplicationDao();
    }

}
