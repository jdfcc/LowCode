package com.jdfcc.lowcode.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author Jdfcc
 * @HomePage <a href="https://github.com/Jdfcc">Jdfcc</a>
 * @Description MyTable
 * @DateTime 2023/11/27 14:07
 */
@EqualsAndHashCode(callSuper = false)
@Data
public class MyTable extends BaseTable implements Serializable {
    private Long tableId;

    private Boolean addAuditField;
}
