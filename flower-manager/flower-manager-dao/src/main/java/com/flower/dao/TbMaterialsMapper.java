package com.flower.dao;

import com.flower.pojo.po.TbMaterials;
import com.flower.pojo.po.TbMaterialsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbMaterialsMapper {
    int countByExample(TbMaterialsExample example);

    int deleteByExample(TbMaterialsExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbMaterials record);

    int insertSelective(TbMaterials record);

    List<TbMaterials> selectByExample(TbMaterialsExample example);

    TbMaterials selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbMaterials record, @Param("example") TbMaterialsExample example);

    int updateByExample(@Param("record") TbMaterials record, @Param("example") TbMaterialsExample example);

    int updateByPrimaryKeySelective(TbMaterials record);

    int updateByPrimaryKey(TbMaterials record);
}