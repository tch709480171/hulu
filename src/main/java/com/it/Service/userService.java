package com.it.Service;

import com.it.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface userService {
    public List<User> selectUser();
}
