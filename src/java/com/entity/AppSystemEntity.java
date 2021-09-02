package com.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "app_system", schema = "app", catalog = "")
public class AppSystemEntity {
    private int id;
    private String appname;
    private String appurl;
    private String apppay;
    private Integer applock;
    private Integer appid;
    private String apptoken;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "appname")
    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }

    @Basic
    @Column(name = "appurl")
    public String getAppurl() {
        return appurl;
    }

    public void setAppurl(String appurl) {
        this.appurl = appurl;
    }

    @Basic
    @Column(name = "apppay")
    public String getApppay() {
        return apppay;
    }

    public void setApppay(String apppay) {
        this.apppay = apppay;
    }

    @Basic
    @Column(name = "applock")
    public Integer getApplock() {
        return applock;
    }

    public void setApplock(Integer applock) {
        this.applock = applock;
    }

    @Basic
    @Column(name = "appid")
    public Integer getAppid() {
        return appid;
    }

    public void setAppid(Integer appid) {
        this.appid = appid;
    }

    @Basic
    @Column(name = "apptoken")
    public String getApptoken() {
        return apptoken;
    }

    public void setApptoken(String apptoken) {
        this.apptoken = apptoken;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppSystemEntity that = (AppSystemEntity) o;
        return id == that.id &&
                Objects.equals(appname, that.appname) &&
                Objects.equals(appurl, that.appurl) &&
                Objects.equals(apppay, that.apppay) &&
                Objects.equals(applock, that.applock) &&
                Objects.equals(appid, that.appid) &&
                Objects.equals(apptoken, that.apptoken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, appname, appurl, apppay, applock, appid, apptoken);
    }
}
