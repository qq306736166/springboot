package com.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "app_storerole", schema = "app", catalog = "")
public class AppStoreroleEntity {
    private int id;
    private String storerolename;
    private String storeroletoken;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "storerolename")
    public String getStorerolename() {
        return storerolename;
    }

    public void setStorerolename(String storerolename) {
        this.storerolename = storerolename;
    }

    @Basic
    @Column(name = "storeroletoken")
    public String getStoreroletoken() {
        return storeroletoken;
    }

    public void setStoreroletoken(String storeroletoken) {
        this.storeroletoken = storeroletoken;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppStoreroleEntity that = (AppStoreroleEntity) o;
        return id == that.id &&
                Objects.equals(storerolename, that.storerolename) &&
                Objects.equals(storeroletoken, that.storeroletoken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, storerolename, storeroletoken);
    }
}
