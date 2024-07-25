package com.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.common.SuperEntity;
import lombok.Data;

/**
 * @author yull
 * @date 2024-07-25 22:50
 */
@Data
@TableName("user")
public class User extends SuperEntity {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String name;
    private Integer age;
    private String email;
}
