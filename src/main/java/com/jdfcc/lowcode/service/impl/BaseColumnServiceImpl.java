package com.jdfcc.lowcode.service.impl;

import com.jdfcc.lowcode.entity.BaseColumn;
import com.jdfcc.lowcode.factory.BaseColumnFactory;
import com.jdfcc.lowcode.service.BaseColumnService;
import com.jdfcc.lowcode.service.BaseTableService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Jdfcc
 * @HomePage <a href="https://github.com/Jdfcc">Jdfcc</a>
 * @DateTime 2024/7/31 17:39
 */
@Service
public class BaseColumnServiceImpl implements BaseColumnService {

    @Override
    public BaseColumn createColumn(String columnName, String columnType, Integer columnLength, String defaultValue, boolean isPrimary, boolean isNullable, String comment) {
        return BaseColumnFactory.createBaseColumn(columnName, columnLength, columnType, comment, defaultValue, isNullable, isPrimary);
    }

    /**
     * 创建列
     */
    @Override
    public BaseColumn createColumn(BaseColumn column) {
        return BaseColumnFactory.createBaseColumn(
                column.getColumnName(), column.getLength(),
                column.getType(), column.getComment(),
                column.getDefaultValue(), column.getIsNullable(), column.getPrimaryKey());
    }
}
