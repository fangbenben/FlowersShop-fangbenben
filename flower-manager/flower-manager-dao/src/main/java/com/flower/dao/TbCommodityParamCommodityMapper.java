package com.flower.dao;

import com.flower.pojo.po.TbCommodityParamCommodity;
import com.flower.pojo.po.TbCommodityParamCommodityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCommodityParamCommodityMapper {
    int countByExample(TbCommodityParamCommodityExample example);

    int deleteByExample(TbCommodityParamCommodityExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbCommodityParamCommodity record);

    int insertSelective(TbCommodityParamCommodity record);

    List<TbCommodityParamCommodity> selectByExampleWithBLOBs(TbCommodityParamCommodityExample example);

    List<TbCommodityParamCommodity> selectByExample(TbCommodityParamCommodityExample example);

    TbCommodityParamCommodity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbCommodityParamCommodity record, @Param("example") TbCommodityParamCommodityExample example);

    int updateByExampleWithBLOBs(@Param("record") TbCommodityParamCommodity record, @Param("example") TbCommodityParamCommodityExample example);

    int updateByExample(@Param("record") TbCommodityParamCommodity record, @Param("example") TbCommodityParamCommodityExample example);

    int updateByPrimaryKeySelective(TbCommodityParamCommodity record);

    int updateByPrimaryKeyWithBLOBs(TbCommodityParamCommodity record);

    int updateByPrimaryKey(TbCommodityParamCommodity record);
}