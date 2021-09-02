package com.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "app_userrole", schema = "app", catalog = "")
public class AppUserroleEntity {
    private int id;
    private String userrolename;
    private String userroletoken;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "userrolename")
    public String getUserrolename() {
        return userrolename;
    }

    public void setUserrolename(String userrolename) {
        this.userrolename = userrolename;
    }

    @Basic
    @Column(name = "userroletoken")
    public String getUserroletoken() {
        return userroletoken;
    }

    public void setUserroletoken(String userroletoken) {
        this.userroletoken = userroletoken;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUserroleEntity that = (AppUserroleEntity) o;
        return id == that.id &&
                Objects.equals(userrolename, that.userrolename) &&
                Objects.equals(userroletoken, that.userroletoken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userrolename, userroletoken);
    }
}
