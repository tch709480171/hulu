package com.it.Contorller;

import com.it.util.FaSongYZ;
import com.it.util.Scyzm;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class yzmContorller {

@RequestMapping("/sendSms")
    public static String  SmsFashong(String phoneNumber,int flag){
        String yzm= Scyzm.yzm();
        boolean rst=FaSongYZ.faShong(phoneNumber ,yzm,flag);
        if(rst=true){
            return yzm;
        }else {
            return "";

        }

    }
}
