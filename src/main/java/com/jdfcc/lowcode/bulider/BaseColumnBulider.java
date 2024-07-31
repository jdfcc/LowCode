package com.jdfcc.lowcode.bulider;

import com.jdfcc.lowcode.entity.BaseColumn;
import com.jdfcc.lowcode.enums.SqlType;

import java.util.List;


/**
 * @author Jdfcc
 * @HomePage <a href="https://github.com/Jdfcc">Jdfcc</a>
 * @Description BaseColumnBulider
 * @DateTime 2023/11/28 9:33
 */

public class BaseColumnBulider {

    private static final BaseColumn INSTANCE = new BaseColumn();

    public BaseColumnBulider withName(String columnName) {
        if (columnName != null) {
            INSTANCE.setColumnName(columnName);
        }
        return this;
    }

    public BaseColumnBulider withLength(Integer length) {
        if (length == null || length <= 0) {
            length = 1;
            INSTANCE.setLength(length);
        }
        INSTANCE.setLength(length);
        return this;
    }

    public BaseColumnBulider withType(SqlType type) {
        INSTANCE.setType(type.getType());
        return this;
    }

    public BaseColumnBulider withComment(String comment) {
        if (comment == null || comment.isEmpty()) {
            INSTANCE.setComment("no description");
        }
        INSTANCE.setComment(comment);
        return this;
    }

    public BaseColumnBulider withDefaultValue(String defaultValue) {
        if (defaultValue == null || defaultValue.isEmpty()) {
            INSTANCE.setDefaultValue("NULL");
        }
        INSTANCE.setDefaultValue(defaultValue);
        return this;
    }

    public BaseColumnBulider withIsNull(boolean isNull) {
        INSTANCE.setIsNullable(isNull);
        return this;
    }

    public BaseColumnBulider withPrimaryKey(boolean primaryKey) {
        INSTANCE.setPrimaryKey(primaryKey);
        return this;
    }

    public BaseColumn build() throws IllegalArgumentException {
        this.validFields();
        return INSTANCE;
    }

    private void validFields() {
        if (INSTANCE.getColumnName() == null) {
            throw new IllegalArgumentException("Column name cannot be null");
        }
        if (INSTANCE.getType() == null) {
            throw new IllegalArgumentException("Column type cannot be null");
        }
        if (INSTANCE.getLength() == null) {
            List<SqlType> allTypes = SqlType.getAllTypes();
            for (SqlType type : allTypes) {
                if (type.getType().equals(INSTANCE.getType())) {
                    INSTANCE.setLength(type.getLength());
                }
            }
        }
    }
}
