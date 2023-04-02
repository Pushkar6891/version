package com.msdw.aps.msfspe.business.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Setter
@Getter
@EqualsAndHashCode(of = "rebalanceId", callSuper = false)
@Entity
@Table(name = "CapitalRebalance")
public class CapitalRebalance {
    @Id
    @Column(name = "rebalanceId")
    private String rebelanceId;
}

