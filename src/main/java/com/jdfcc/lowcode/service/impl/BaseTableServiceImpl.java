package com.jdfcc.lowcode.service.impl;

import com.jdfcc.lowcode.entity.BaseColumn;
import com.jdfcc.lowcode.entity.TableData;
import com.jdfcc.lowcode.mapper.TableMapper;
import com.jdfcc.lowcode.service.BaseColumnService;
import com.jdfcc.lowcode.service.BaseTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Jdfcc
 * @HomePage <a href="https://github.com/Jdfcc">Jdfcc</a>
 * @Description BaseTableServiceImpl
 * @DateTime 2023/11/28 11:24
 */
@Service
public class BaseTableServiceImpl implements BaseTableService {
    @Resource
    private TableMapper tableMapper;
    @Resource
    private BaseColumnService baseColumnService;

    @Override
    public void createTable(String tableName, List<BaseColumn> columns) {
        TableData tableData = new TableData();
        tableData.setTableName(tableName);
        for (BaseColumn column : columns) {
            tableData.addColumn(baseColumnService.createColumn(column));
        }
        tableMapper.createTable(tableData);
    }
}
