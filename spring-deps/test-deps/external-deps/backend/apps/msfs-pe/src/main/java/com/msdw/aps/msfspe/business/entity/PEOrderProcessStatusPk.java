package com.msdw.aps.msfspe.business.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class PEOrderProcessStatusPk implements Serializable {
    @Column
    private String entityId;
    @Column
    private String entityType;
}
