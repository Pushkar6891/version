package com.company.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
@Entity
@Table
public class Product implements Serializable {

    private static final long SerialVersionUID = 10l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String productName;
    private int productQuantity;
    private double productPrice;
}
