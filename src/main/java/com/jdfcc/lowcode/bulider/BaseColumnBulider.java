package com.jdfcc.lowcode.bulider;

import com.jdfcc.lowcode.entity.BaseColumn;


/**
 * @author Jdfcc
 * @HomePage <a href="https://github.com/Jdfcc">Jdfcc</a>
 * @Description BaseColumnBulider
 * @DateTime 2023/11/28 9:33
 */

public class BaseColumnBulider {

    private static final BaseColumn instance = new BaseColumn();

    public BaseColumnBulider withName(String columnName) {
        if (columnName != null) {
            instance.setColumnName(columnName);
        }
        return this;
    }

    public BaseColumnBulider withLength(Integer length) {
        if (length == null || length <= 0) {
            length = 1;
            instance.setLength(length);
        }
        instance.setLength(length);
        return this;
    }

    public BaseColumnBulider withType(String type) {
        instance.setType(type);
        return this;
    }

    public BaseColumnBulider withComment(String comment) {
        if (comment == null || comment.equals("")) {
            instance.setComment("no description");
        }
        instance.setComment(comment);
        return this;
    }

    public BaseColumnBulider withDefaultValue(String defaultValue) {
        if (defaultValue == null || defaultValue.equals("")) {
            instance.setDefaultValue("NULL");
        }
        instance.setDefaultValue(defaultValue);
        return this;
    }

    public BaseColumnBulider withIsNull(boolean isNull) {
        instance.setIsNullable(isNull);
        return this;
    }

    public BaseColumnBulider withPrimaryKey(boolean primaryKey) {
        instance.setPrimaryKey(primaryKey);
        return this;
    }

    public BaseColumn build() throws IllegalArgumentException{
        if (instance.getColumnName() == null) {
            throw new IllegalArgumentException("Column name cannot be null");
        } else if (instance.getType() == null) {
            throw new IllegalArgumentException("Column type cannot be null");
        }
        return instance;
    }
}
