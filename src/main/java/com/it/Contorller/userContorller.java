package com.it.Contorller;

import com.it.Service.userService;
import com.it.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tk.mybatis.spring.annotation.MapperScan;


import java.util.List;

@Controller

public class userContorller {
    @Autowired
    private userService us;
    @RequestMapping("/selectuser.do")
    public String  selectuser(Model model){
        List<User> users=us.selectUser();
        model.addAttribute("users",users);
        return "list";
    }

}
