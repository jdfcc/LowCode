package com.jdfcc.lowcode.factory;

import com.jdfcc.lowcode.bulider.BaseColumnBulider;
import com.jdfcc.lowcode.entity.BaseColumn;
import com.jdfcc.lowcode.enums.SqlType;

import java.util.List;

/**
 * @author Jdfcc
 * @HomePage <a href="https://github.com/Jdfcc">Jdfcc</a>
 * @Description BaseColumn工厂
 * @DateTime 2023/11/28 9:25
 */
public class BaseColumnFactory {

    public static BaseColumn createBaseColumn(String columnName, int columnLength, String type,
                                              String comment, String defaultValue, boolean isNullable, boolean isPrimaryKey) {
        BaseColumnBulider baseColumnBulider = new BaseColumnBulider();
        List<SqlType> allTypes = SqlType.getAllTypes();
        SqlType tp = null;
        for (SqlType en : allTypes) {
            if (en.getType().equals(type)) {
                tp = en;
            }
        }
        if (tp == null) {
            throw new IllegalArgumentException("Invalid column type");
        }
        return baseColumnBulider.withName(columnName).withComment(comment).withType(tp)
                .withLength(columnLength).withIsNull(isNullable)
                .withDefaultValue(defaultValue).withPrimaryKey(isPrimaryKey)
                .build();
    }
}
