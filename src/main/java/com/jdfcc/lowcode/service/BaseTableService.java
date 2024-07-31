package com.jdfcc.lowcode.service;

import com.jdfcc.lowcode.entity.BaseColumn;

import java.util.List;

/**
 * @author Jdfcc
 * @HomePage <a href="https://github.com/Jdfcc">Jdfcc</a>
 * @Description
 * @DateTime 2023/11/28 11:24
 */
public interface BaseTableService {
    void createTable(String tableName, List<BaseColumn> columns);

}
