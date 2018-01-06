package com.flower.dao;

import com.flower.pojo.po.TbCommodityParam;
import com.flower.pojo.po.TbCommodityParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCommodityParamMapper {
    int countByExample(TbCommodityParamExample example);

    int deleteByExample(TbCommodityParamExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbCommodityParam record);

    int insertSelective(TbCommodityParam record);

    List<TbCommodityParam> selectByExampleWithBLOBs(TbCommodityParamExample example);

    List<TbCommodityParam> selectByExample(TbCommodityParamExample example);

    TbCommodityParam selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbCommodityParam record, @Param("example") TbCommodityParamExample example);

    int updateByExampleWithBLOBs(@Param("record") TbCommodityParam record, @Param("example") TbCommodityParamExample example);

    int updateByExample(@Param("record") TbCommodityParam record, @Param("example") TbCommodityParamExample example);

    int updateByPrimaryKeySelective(TbCommodityParam record);

    int updateByPrimaryKeyWithBLOBs(TbCommodityParam record);

    int updateByPrimaryKey(TbCommodityParam record);
}