package com.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "app_withdraw", schema = "app", catalog = "")
public class AppWithdrawEntity {
    private int id;
    private String orderno;
    private Double amount;
    private int userid;
    private Integer withdrawtype;
    private String withdrawaccount;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "orderno")
    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    @Basic
    @Column(name = "amount")
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "userid")
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "withdrawtype")
    public Integer getWithdrawtype() {
        return withdrawtype;
    }

    public void setWithdrawtype(Integer withdrawtype) {
        this.withdrawtype = withdrawtype;
    }

    @Basic
    @Column(name = "withdrawaccount")
    public String getWithdrawaccount() {
        return withdrawaccount;
    }

    public void setWithdrawaccount(String withdrawaccount) {
        this.withdrawaccount = withdrawaccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppWithdrawEntity that = (AppWithdrawEntity) o;
        return id == that.id &&
                userid == that.userid &&
                Objects.equals(orderno, that.orderno) &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(withdrawtype, that.withdrawtype) &&
                Objects.equals(withdrawaccount, that.withdrawaccount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderno, amount, userid, withdrawtype, withdrawaccount);
    }
}
