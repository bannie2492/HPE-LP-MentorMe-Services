package com.livingprogress.mentorme.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;

/**
 * The auditable user entity.
 */
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@MappedSuperclass
public abstract class AuditableUserEntity extends AuditableEntity {
    /**
     * The created by.
     */
    @JoinColumn(name = "created_by", insertable = true, updatable = false)
    private long createdBy;
}

