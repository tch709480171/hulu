package com.it.util;

public class Scyzm {
    public  static  String yzm(){
        String  yzm="";
        for(int i=1;i<=6;i++){

            yzm+=(int)Math.floor(Math.random()*10);
        }
       return yzm;
    }
}
