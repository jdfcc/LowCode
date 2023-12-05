package com.jdfcc.lowcode.service.impl;

import com.jdfcc.lowcode.entity.BaseTable;
import com.jdfcc.lowcode.entity.TableData;
import com.jdfcc.lowcode.mapper.TableMapper;
import com.jdfcc.lowcode.service.BaseTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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

    @Override
    public void createTable() {
        TableData tableData = new TableData();
        tableData.setTableName("ttt_name");
        tableMapper.createTable(tableData);
    }
}
