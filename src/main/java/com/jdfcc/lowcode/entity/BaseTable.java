package com.jdfcc.lowcode.entity;

import lombok.Data;

/**
 * @author Jdfcc
 * @HomePage <a href="https://github.com/Jdfcc">Jdfcc</a>
 * @Description 数据库表实体类
 * @DateTime 2023/11/27 11:55
 */
@Data
public class BaseTable {
    private String tableName;
    private String charSet = "utf8";
    private String Engine = "InnoDB";
}
