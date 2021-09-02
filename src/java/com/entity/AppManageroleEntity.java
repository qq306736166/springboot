package com.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "app_managerole", schema = "app", catalog = "")
public class AppManageroleEntity {
    private int id;
    private String managerolename;
    private String manageroletoken;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "managerolename")
    public String getManagerolename() {
        return managerolename;
    }

    public void setManagerolename(String managerolename) {
        this.managerolename = managerolename;
    }

    @Basic
    @Column(name = "manageroletoken")
    public String getManageroletoken() {
        return manageroletoken;
    }

    public void setManageroletoken(String manageroletoken) {
        this.manageroletoken = manageroletoken;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppManageroleEntity that = (AppManageroleEntity) o;
        return id == that.id &&
                Objects.equals(managerolename, that.managerolename) &&
                Objects.equals(manageroletoken, that.manageroletoken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, managerolename, manageroletoken);
    }
}
