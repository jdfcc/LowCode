package com.jdfcc.lowcode.entity;

import lombok.Data;

import java.io.Serializable;


/**
 * @author Jdfcc
 * @HomePage <a href="https://github.com/Jdfcc">Jdfcc</a>
 * @Description 数据库实体类
 * @DateTime 2023/11/27 11:56
 */

@Data
public class DataBase implements Serializable {

    /**
     * 数据库ID
     */
    private Long Id;
    /**
     * 数据库名
     */
    private static String databaseName;
    /**
     * 数据库编码规则
     */
    private static String databaseEncoding;
    /**
     * 字符集
     */
    private static String characterSet;
}
