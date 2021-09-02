package com.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Objects;

@Data
@Component
@Table(name = "app_addvert", schema = "app", catalog = "")
public class AppAddvertEntity {
    private int id;
    private String addvername;
    private String addverurl;
    private String addverpic;
    private String addvercontext;
    private Long addverreadnum;
    private Long addversharenum;
    private String addverlog;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "addvername")
    public String getAddvername() {
        return addvername;
    }

    public void setAddvername(String addvername) {
        this.addvername = addvername;
    }

    @Basic
    @Column(name = "addverurl")
    public String getAddverurl() {
        return addverurl;
    }

    public void setAddverurl(String addverurl) {
        this.addverurl = addverurl;
    }

    @Basic
    @Column(name = "addverpic")
    public String getAddverpic() {
        return addverpic;
    }

    public void setAddverpic(String addverpic) {
        this.addverpic = addverpic;
    }

    @Basic
    @Column(name = "addvercontext")
    public String getAddvercontext() {
        return addvercontext;
    }

    public void setAddvercontext(String addvercontext) {
        this.addvercontext = addvercontext;
    }

    @Basic
    @Column(name = "addverreadnum")
    public Long getAddverreadnum() {
        return addverreadnum;
    }

    public void setAddverreadnum(Long addverreadnum) {
        this.addverreadnum = addverreadnum;
    }

    @Basic
    @Column(name = "addversharenum")
    public Long getAddversharenum() {
        return addversharenum;
    }

    public void setAddversharenum(Long addversharenum) {
        this.addversharenum = addversharenum;
    }

    @Basic
    @Column(name = "addverlog")
    public String getAddverlog() {
        return addverlog;
    }

    public void setAddverlog(String addverlog) {
        this.addverlog = addverlog;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppAddvertEntity that = (AppAddvertEntity) o;
        return id == that.id &&
                Objects.equals(addvername, that.addvername) &&
                Objects.equals(addverurl, that.addverurl) &&
                Objects.equals(addverpic, that.addverpic) &&
                Objects.equals(addvercontext, that.addvercontext) &&
                Objects.equals(addverreadnum, that.addverreadnum) &&
                Objects.equals(addversharenum, that.addversharenum) &&
                Objects.equals(addverlog, that.addverlog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, addvername, addverurl, addverpic, addvercontext, addverreadnum, addversharenum, addverlog);
    }
}
