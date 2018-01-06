package com.flower.dao;

import com.flower.pojo.po.TbCommodity;
import com.flower.pojo.po.TbCommodityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCommodityMapper {
    int countByExample(TbCommodityExample example);

    int deleteByExample(TbCommodityExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbCommodity record);

    int insertSelective(TbCommodity record);

    List<TbCommodity> selectByExample(TbCommodityExample example);

    TbCommodity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbCommodity record, @Param("example") TbCommodityExample example);

    int updateByExample(@Param("record") TbCommodity record, @Param("example") TbCommodityExample example);

    int updateByPrimaryKeySelective(TbCommodity record);

    int updateByPrimaryKey(TbCommodity record);
}