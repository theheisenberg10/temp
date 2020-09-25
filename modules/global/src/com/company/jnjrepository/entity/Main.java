package com.company.jnjrepository.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Table(name = "JNJREPOSITORY_MAIN")
@Entity(name = "jnjrepository_Main")
@NamePattern("%s %s|api,description")
public class Main extends StandardEntity {
    private static final long serialVersionUID = -8547209681023594944L;

    @NotNull
    @Column(name = "API", nullable = false, unique = true)
    private String api;

    @NotNull
    @Lob
    @Column(name = "DESCRIPTION", nullable = false)
    private String description;

    @NotNull
    @Column(name = "OWNER", nullable = false)
    private String owner;

    @NotNull
    @Column(name = "DEPARTMENT", nullable = false, unique = true)
    private String department;

    @NotNull
    @Column(name = "REVISION", nullable = false)
    private BigDecimal revision;

    public BigDecimal getRevision() {
        return revision;
    }

    public void setRevision(BigDecimal revision) {
        this.revision = revision;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }
}