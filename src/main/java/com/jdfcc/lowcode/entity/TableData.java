package com.jdfcc.lowcode.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author Jdfcc
 * @HomePage <a href="https://github.com/Jdfcc">Jdfcc</a>
 * @Description 数据表数据
 * @DateTime 2023/11/27 17:43
 */
@Data
public class TableData implements Serializable {
    private static List<MyColumn> data;
}
