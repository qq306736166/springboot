package com.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "app_user", schema = "app", catalog = "")
public class AppUserEntity {
    private int id;
    private String username;
    private String userpass;
    private String token;
    private Integer uuid;
    private String userhead;
    private Integer userphone;
    private String usermail;
    private String userpay;
    private Integer userpaytype;
    private Integer userlever;
    private BigDecimal userbalance;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "userpass")
    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    @Basic
    @Column(name = "token")
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Basic
    @Column(name = "uuid")
    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    @Basic
    @Column(name = "userhead")
    public String getUserhead() {
        return userhead;
    }

    public void setUserhead(String userhead) {
        this.userhead = userhead;
    }

    @Basic
    @Column(name = "userphone")
    public Integer getUserphone() {
        return userphone;
    }

    public void setUserphone(Integer userphone) {
        this.userphone = userphone;
    }

    @Basic
    @Column(name = "usermail")
    public String getUsermail() {
        return usermail;
    }

    public void setUsermail(String usermail) {
        this.usermail = usermail;
    }

    @Basic
    @Column(name = "userpay")
    public String getUserpay() {
        return userpay;
    }

    public void setUserpay(String userpay) {
        this.userpay = userpay;
    }

    @Basic
    @Column(name = "userpaytype")
    public Integer getUserpaytype() {
        return userpaytype;
    }

    public void setUserpaytype(Integer userpaytype) {
        this.userpaytype = userpaytype;
    }

    @Basic
    @Column(name = "userlever")
    public Integer getUserlever() {
        return userlever;
    }

    public void setUserlever(Integer userlever) {
        this.userlever = userlever;
    }

    @Basic
    @Column(name = "userbalance")
    public BigDecimal getUserbalance() {
        return userbalance;
    }

    public void setUserbalance(BigDecimal userbalance) {
        this.userbalance = userbalance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUserEntity that = (AppUserEntity) o;
        return id == that.id &&
                Objects.equals(username, that.username) &&
                Objects.equals(userpass, that.userpass) &&
                Objects.equals(token, that.token) &&
                Objects.equals(uuid, that.uuid) &&
                Objects.equals(userhead, that.userhead) &&
                Objects.equals(userphone, that.userphone) &&
                Objects.equals(usermail, that.usermail) &&
                Objects.equals(userpay, that.userpay) &&
                Objects.equals(userpaytype, that.userpaytype) &&
                Objects.equals(userlever, that.userlever) &&
                Objects.equals(userbalance, that.userbalance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, userpass, token, uuid, userhead, userphone, usermail, userpay, userpaytype, userlever, userbalance);
    }
}
