package com.msdw.aps.fsdataobject.data.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Fund")
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "fundKey", callSuper = false)
public class Fund {

    private byte[] fundKey;
    private String fundId;
    private String fundCode;
    private String fundName;
    private String fundLegalName;
    private String shareId;
    private String capitalId;
    private String taxId;
    private String mspaPortfolioId;


}
