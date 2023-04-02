package com.bharath.springcloud.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@AllArgsConstructor
@Builder
@Data
@Entity
@EqualsAndHashCode
@Getter
@NoArgsConstructor
@Setter
@ToString
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	private BigDecimal price;
	@Transient
	private String couponCode;

}
