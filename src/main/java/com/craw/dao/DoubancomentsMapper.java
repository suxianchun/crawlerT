package com.craw.dao;

import com.craw.bean.Doubancoments;

public interface DoubancomentsMapper {
    int deleteByPrimaryKey(String iddoubancomentsid);

    int insert(Doubancoments record);

    int insertSelective(Doubancoments record);

    Doubancoments selectByPrimaryKey(String iddoubancomentsid);

    int updateByPrimaryKeySelective(Doubancoments record);

    int updateByPrimaryKey(Doubancoments record);
}