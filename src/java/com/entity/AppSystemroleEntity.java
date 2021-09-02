package com.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "app_systemrole", schema = "app", catalog = "")
public class AppSystemroleEntity {
    private int id;
    private String approlename;
    private Integer approletype;
    private String approletoken;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "approlename")
    public String getApprolename() {
        return approlename;
    }

    public void setApprolename(String approlename) {
        this.approlename = approlename;
    }

    @Basic
    @Column(name = "approletype")
    public Integer getApproletype() {
        return approletype;
    }

    public void setApproletype(Integer approletype) {
        this.approletype = approletype;
    }

    @Basic
    @Column(name = "approletoken")
    public String getApproletoken() {
        return approletoken;
    }

    public void setApproletoken(String approletoken) {
        this.approletoken = approletoken;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppSystemroleEntity that = (AppSystemroleEntity) o;
        return id == that.id &&
                Objects.equals(approlename, that.approlename) &&
                Objects.equals(approletype, that.approletype) &&
                Objects.equals(approletoken, that.approletoken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, approlename, approletype, approletoken);
    }
}
