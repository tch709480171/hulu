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


}
