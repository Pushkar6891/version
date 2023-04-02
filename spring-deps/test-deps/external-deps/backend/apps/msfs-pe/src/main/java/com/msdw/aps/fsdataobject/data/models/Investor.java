package com.msdw.aps.fsdataobject.data.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Investor")
@Getter
@Setter
@EqualsAndHashCode(of = "investorKey", callSuper = false)
@ToString
public class Investor {
    @Id
    private byte[] investorKey;
    private String investorId;
    private String investorCode;
    private String investorName;
    private String investorLegalName;
    private String shareId;
    private String capitalId;
    
}
