package com.jdfcc.lowcode.util;

import com.jdfcc.lowcode.entity.MyTable;

/**
 * @author Jdfcc
 * @HomePage <a href="https://github.com/Jdfcc">Jdfcc</a>
 * @Description 数据表sql生成器 使用mybatis生成
 * @DateTime 2023/11/27 14:30
 */
public class TableGenerater {
    public String generateTableCreationCode(MyTable table) {
        // TODO Auto-generated method stub
        System.out.println("Generating");
        // TODO Auto-generated method stub
        if (table.getAddAuditField()) {
            System.out.println("Generating table creation code");
        }

        return "sql";
    }
}
