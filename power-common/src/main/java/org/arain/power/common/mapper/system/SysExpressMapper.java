package org.arain.power.common.mapper.system;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.arain.power.common.pojo.system.SysExpress;
import org.arain.power.common.pojo.system.SysExpressExample;

public interface SysExpressMapper {
    int countByExample(SysExpressExample example);

    int deleteByExample(SysExpressExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysExpress record);

    int insertSelective(SysExpress record);

    List<SysExpress> selectByExample(SysExpressExample example);

    SysExpress selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysExpress record, @Param("example") SysExpressExample example);

    int updateByExample(@Param("record") SysExpress record, @Param("example") SysExpressExample example);

    int updateByPrimaryKeySelective(SysExpress record);

    int updateByPrimaryKey(SysExpress record);
}