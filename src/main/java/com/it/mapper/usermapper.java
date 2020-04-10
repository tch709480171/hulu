package com.it.mapper;

import com.it.bean.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface usermapper {
    @Select("select * from tuser")
    public List<User> selectUser();
}
