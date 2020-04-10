package com.it.mapper;

import com.it.bean.User;
import tk.mybatis.mapper.common.Mapper;

//指定mapper接口继承与tk.mybatis.mapper.common.Mapper;范型为要操作的实体类
public interface uMapper extends Mapper<User> {

}
