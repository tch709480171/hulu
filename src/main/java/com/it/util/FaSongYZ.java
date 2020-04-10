package com.it.util;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

import javax.swing.text.html.FormSubmitEvent;


public class FaSongYZ {
    public static boolean faShong(String phoneNumber,String yzm,int flag) {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAI4FmaWQigHCWxrXgdkTsz", "cRpJRvRGLVXRd5AtocI6odyUmFWM1R");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        //手机号
        request.putQueryParameter("PhoneNumbers", phoneNumber);
        //签名
        request.putQueryParameter("SignName", "云垂商人");
        if(flag==1){
            //注册
            request.putQueryParameter("TemplateCode", "SMS_187561123");

        }else {
            //登陆或模板编码
            request.putQueryParameter("TemplateCode", "SMS_187571041");
        }
          boolean f=false;
        //验证吗
        request.putQueryParameter("TemplateParam", "{\"code\":\""+yzm+"\"}");
        try {
            CommonResponse response = client.getCommonResponse(request);
            if(response.getData().contains("OK")){
                System.out.println(response.getData());
                f=true;
            }
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
        return f;
    }
}
