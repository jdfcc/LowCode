package com.jdfcc.lowcode.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jdfcc
 * @HomePage <a href="https://github.com/Jdfcc">Jdfcc</a>
 * @Description 数据表数据
 * @DateTime 2023/11/27 17:43
 */
@EqualsAndHashCode(callSuper = false)
@Data
public class TableData extends BaseTable implements Serializable {

    private List<BaseColumn> data = new ArrayList<>();

    public void addColumn(BaseColumn newData) {
        this.data.add(newData);
    }
}
