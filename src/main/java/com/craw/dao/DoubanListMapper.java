package com.craw.dao;

import com.craw.bean.DoubanList;

public interface DoubanListMapper {
    int deleteByPrimaryKey(String doubanid);

    int insert(DoubanList record);

    int insertSelective(DoubanList record);

    DoubanList selectByPrimaryKey(String doubanid);

    int updateByPrimaryKeySelective(DoubanList record);

    int updateByPrimaryKey(DoubanList record);
}