package com.jdfcc.lowcode.service;

import com.jdfcc.lowcode.entity.BaseColumn;

/**
 * @author Jdfcc
 * @HomePage <a href="https://github.com/Jdfcc">Jdfcc</a>
 * @Description ColumnService
 * @DateTime 2024/7/31 17:35
 */
public interface BaseColumnService {
    /**
     * 创建列
     * @param columnName 列名
     * @param columnType 列类型
     * @param columnLength 列长
     * @param defaultValue 默认值
     * @param isPrimary 是否为主键
     * @param isNullable 是否可为空
     * @param comment 注释
     */
    BaseColumn createColumn(String columnName, String columnType, Integer columnLength,
                            String defaultValue, boolean isPrimary, boolean isNullable, String comment);

    /**
     * 创建列
     */
    BaseColumn createColumn(BaseColumn column);
}
