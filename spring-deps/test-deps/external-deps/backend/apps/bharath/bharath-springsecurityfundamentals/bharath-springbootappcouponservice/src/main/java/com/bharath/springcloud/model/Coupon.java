package com.bharath.springcloud.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String code;
    private BigDecimal discount;
    private String expDate;

}
