package com.jdfcc.lowcode.mapper;


import com.jdfcc.lowcode.entity.TableData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Jdfcc
 * @HomePage <a href="https://github.com/Jdfcc">Jdfcc</a>
 * @Description 通过此mapper完成业务数据表的创建
 * @DateTime 2023/11/28 10:08
 */
@Mapper
public interface TableMapper {

    void createTable(@Param("table") TableData table);
}
