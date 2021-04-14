package com.craw.dao;

import com.craw.bean.Doubandetail;

public interface DoubandetailMapper {
    int deleteByPrimaryKey(String iddoubandetailid);

    int insert(Doubandetail record);

    int insertSelective(Doubandetail record);

    Doubandetail selectByPrimaryKey(String iddoubandetailid);

    int updateByPrimaryKeySelective(Doubandetail record);

    int updateByPrimaryKey(Doubandetail record);
}