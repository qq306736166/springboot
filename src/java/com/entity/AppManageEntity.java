package com.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "app_manage", schema = "app", catalog = "")
public class AppManageEntity {
    private int id;
    private String managename;
    private String managepass;
    private String managehead;
    private String managetoken;
    private Integer manageid;
    private String managekey;
    private String managephone;
    private String manageemail;
    private Integer manageroleid;
    private Integer managelock;
    private String managelog;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "managename")
    public String getManagename() {
        return managename;
    }

    public void setManagename(String managename) {
        this.managename = managename;
    }

    @Basic
    @Column(name = "managepass")
    public String getManagepass() {
        return managepass;
    }

    public void setManagepass(String managepass) {
        this.managepass = managepass;
    }

    @Basic
    @Column(name = "managehead")
    public String getManagehead() {
        return managehead;
    }

    public void setManagehead(String managehead) {
        this.managehead = managehead;
    }

    @Basic
    @Column(name = "managetoken")
    public String getManagetoken() {
        return managetoken;
    }

    public void setManagetoken(String managetoken) {
        this.managetoken = managetoken;
    }

    @Basic
    @Column(name = "manageid")
    public Integer getManageid() {
        return manageid;
    }

    public void setManageid(Integer manageid) {
        this.manageid = manageid;
    }

    @Basic
    @Column(name = "managekey")
    public String getManagekey() {
        return managekey;
    }

    public void setManagekey(String managekey) {
        this.managekey = managekey;
    }

    @Basic
    @Column(name = "managephone")
    public String getManagephone() {
        return managephone;
    }

    public void setManagephone(String managephone) {
        this.managephone = managephone;
    }

    @Basic
    @Column(name = "manageemail")
    public String getManageemail() {
        return manageemail;
    }

    public void setManageemail(String manageemail) {
        this.manageemail = manageemail;
    }

    @Basic
    @Column(name = "manageroleid")
    public Integer getManageroleid() {
        return manageroleid;
    }

    public void setManageroleid(Integer manageroleid) {
        this.manageroleid = manageroleid;
    }

    @Basic
    @Column(name = "managelock")
    public Integer getManagelock() {
        return managelock;
    }

    public void setManagelock(Integer managelock) {
        this.managelock = managelock;
    }

    @Basic
    @Column(name = "managelog")
    public String getManagelog() {
        return managelog;
    }

    public void setManagelog(String managelog) {
        this.managelog = managelog;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppManageEntity that = (AppManageEntity) o;
        return id == that.id &&
                Objects.equals(managename, that.managename) &&
                Objects.equals(managepass, that.managepass) &&
                Objects.equals(managehead, that.managehead) &&
                Objects.equals(managetoken, that.managetoken) &&
                Objects.equals(manageid, that.manageid) &&
                Objects.equals(managekey, that.managekey) &&
                Objects.equals(managephone, that.managephone) &&
                Objects.equals(manageemail, that.manageemail) &&
                Objects.equals(manageroleid, that.manageroleid) &&
                Objects.equals(managelock, that.managelock) &&
                Objects.equals(managelog, that.managelog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, managename, managepass, managehead, managetoken, manageid, managekey, managephone, manageemail, manageroleid, managelock, managelog);
    }
}
