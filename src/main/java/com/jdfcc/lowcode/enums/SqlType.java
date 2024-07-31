package com.jdfcc.lowcode.enums;


import java.util.Arrays;
import java.util.List;

/**
 * @author Jdfcc
 * @Description 数据库类型枚举
 */
public enum SqlType {
    NUMBER("integer", 24),
    STRING("varchar", 24),
    TIME("timestamp", 0);

    private final String type;
    private final Integer length;

    SqlType(String type, Integer length) {
        this.type = type;
        this.length = length;
    }

    public String getType() {
        return this.type;
    }

    public Integer getLength() {
        return this.length;
    }

    /**
     * 获取所有枚举
     */
    public static List<SqlType> getAllTypes() {
        return Arrays.asList(SqlType.values());
    }
}
