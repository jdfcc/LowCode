package com.jdfcc.lowcode.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author Jdfcc
 * @HomePage <a href="https://github.com/Jdfcc">Jdfcc</a>
 * @Description MyColumn
 * @DateTime 2023/11/27 15:30
 */
@EqualsAndHashCode(callSuper = false)
@Data
public class MyColumn extends BaseColumn implements Serializable {

    /**
     * 此列id
     */
    private static Long columnId;
    /**
     * 关联表id
     */
    private static Long tableId;
    /**
     * 此字段分组
     */
    private static String group;
}
