package com.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "app_store", schema = "app", catalog = "")
public class AppStoreEntity {
    private int id;
    private String storename;
    private String storepass;
    private String storetoken;
    private Integer storelock;
    private String storephone;
    private String storelog;
    private Integer storeroleid;
    private String storeqrcode;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "storename")
    public String getStorename() {
        return storename;
    }

    public void setStorename(String storename) {
        this.storename = storename;
    }

    @Basic
    @Column(name = "storepass")
    public String getStorepass() {
        return storepass;
    }

    public void setStorepass(String storepass) {
        this.storepass = storepass;
    }

    @Basic
    @Column(name = "storetoken")
    public String getStoretoken() {
        return storetoken;
    }

    public void setStoretoken(String storetoken) {
        this.storetoken = storetoken;
    }

    @Basic
    @Column(name = "storelock")
    public Integer getStorelock() {
        return storelock;
    }

    public void setStorelock(Integer storelock) {
        this.storelock = storelock;
    }

    @Basic
    @Column(name = "storephone")
    public String getStorephone() {
        return storephone;
    }

    public void setStorephone(String storephone) {
        this.storephone = storephone;
    }

    @Basic
    @Column(name = "storelog")
    public String getStorelog() {
        return storelog;
    }

    public void setStorelog(String storelog) {
        this.storelog = storelog;
    }

    @Basic
    @Column(name = "storeroleid")
    public Integer getStoreroleid() {
        return storeroleid;
    }

    public void setStoreroleid(Integer storeroleid) {
        this.storeroleid = storeroleid;
    }

    @Basic
    @Column(name = "storeqrcode")
    public String getStoreqrcode() {
        return storeqrcode;
    }

    public void setStoreqrcode(String storeqrcode) {
        this.storeqrcode = storeqrcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppStoreEntity that = (AppStoreEntity) o;
        return id == that.id &&
                Objects.equals(storename, that.storename) &&
                Objects.equals(storepass, that.storepass) &&
                Objects.equals(storetoken, that.storetoken) &&
                Objects.equals(storelock, that.storelock) &&
                Objects.equals(storephone, that.storephone) &&
                Objects.equals(storelog, that.storelog) &&
                Objects.equals(storeroleid, that.storeroleid) &&
                Objects.equals(storeqrcode, that.storeqrcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, storename, storepass, storetoken, storelock, storephone, storelog, storeroleid, storeqrcode);
    }
}
