package com.jdfcc.lowcode.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

/**
 * @author Jdfcc
 * @HomePage <a href="https://github.com/Jdfcc">Jdfcc</a>
 * @Description 通过此mapper对数据进行插入
 * @DateTime 2023/11/27 17:29
 */
@Mapper
public interface InsertMapper {

    void insertOne();

    void insertBatch();
}
