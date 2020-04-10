package com.it.bean;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "tuser")
public class User implements Serializable {

    @Id
    private  Integer id;
    private  String loginname;
    private  String password;
    private  String realname;
    private  String sex;
    private  String birthday;
    private  Integer deptno;
    private  String email;
    private  Integer enabled;
    private  Integer createman;
    private  String userpic;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", logingname='" + loginname + '\'' +
                ", password='" + password + '\'' +
                ", realname='" + realname + '\'' +
                ", sex='" + sex + '\'' +
                ", biryhday='" + birthday + '\'' +
                ", deptno=" + deptno +
                ", email='" + email + '\'' +
                ", enbled=" + enabled +
                ", createman=" + createman +
                ", userPic='" + userpic + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String logingname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public Integer getCreateman() {
        return createman;
    }

    public void setCreateman(Integer createman) {
        this.createman = createman;
    }

    public String getUserpic() {
        return userpic;
    }

    public void setUserpic(String userpic) {
        this.userpic = userpic;
    }
}
