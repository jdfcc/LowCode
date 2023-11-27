# 开发日志

[TOC]

## 开发注意事项

### 基类表

对于``BaseColumn``、``MyColumn``、``MyTable``、``BaseTable``，不应该对其建立数据表。仅作为建立业务所需表时
承载数据所使用。即不单独对这四个实体类建立与其相对于的数据表，对业务数据的操作都应该直接找到对应的表单进行操作。

### <a id="dbName">数据库表名</a>

数据库表名及相关数据由模板带出，模板与数据库为多对一关系--多个模板可对应一个数据库。

## day1

### 建立基础表单。

明确建立数据表的方式为``使用 MyBatis 生成表``。

```xml

<update id="createTableByList">
    CREATE TABLE ${tableName} (
    ${id} {type}({length}) {isNull} AUTO_INCREMENT,
    <foreach collection="rowList" item="rowName" index="index">
        ${rowName} varchar(255) NOT NULL,
    </foreach>
    PRIMARY KEY ({primaryKey})
</update>
```

对应的接口

```java
void createTableByList(@Param("tableName")String tableName,@Param("rowList") List<String> rowList);
```

### 建立表单后相关CRUD

#### 插入数据：

根据[数据库表名](#dbName)找到已经建立好的数据表，将实体column对象通过mybatis插入已经建立的数据表。参考 ``<foreach>`` 方法

#### 查找数据:

根据[数据库表名](#dbName)找到对应的数据表，将要查找的数据封装成``HashMap``进行操作

```xml

<select id="selectAll" resultType="java.util.HashMap">
    select * from tb_XXX
</select>
```

### 修改数据

根据[数据库表名](#dbName)找到对应的数据库表，对对应字段进行相关操作

### 删除数据

根据[数据库表名](#dbName)找到对应的数据库表，根据id进行删除








