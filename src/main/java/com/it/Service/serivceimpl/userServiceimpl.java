package com.it.Service.serivceimpl;

import com.it.Service.userService;
import com.it.bean.User;
import com.it.mapper.uMapper;
import com.it.mapper.usermapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class userServiceimpl implements userService {
    @Autowired
      private uMapper um;
    @Cacheable("selectUser")
    public List<User> selectUser(){
        System.out.println("想你了呢");
        return um.selectAll();
    }
}
