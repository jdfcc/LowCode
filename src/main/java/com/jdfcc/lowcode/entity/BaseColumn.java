package com.jdfcc.lowcode.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Jdfcc
 * @HomePage <a href="https://github.com/Jdfcc">Jdfcc</a>
 * @Description 数据库行(字段)实体类
 * @DateTime 2023/11/27 11:56
 */
@Data
public class BaseColumn  {
    /**
     * 列名
     */
    private String columnName;
    /**
     * 是否为主键
     */
    private Boolean primaryKey;
    /**
     * 是否允许为空
     */
    private Boolean isNullable;
    /**
     * 类型
     */
    private String type;
    /**
     * 默认值
     */
    private String defaultValue;
    /**
     * 长度
     */
    private Integer length;
    /**
     * 备注
     */
    private String comment;
    /**
     * 值
     */
    private String value;
}
