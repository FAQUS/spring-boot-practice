package com.example.common;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author yull
 * @date 2024-07-25 22:50
 */
@Data
public class SuperEntity implements Serializable {

    //@TableLogic
    @TableField(value = "is_delete")
    private Integer idDelete;

    @TableField(value = "create_by")
    private String createBy;

    @TableField(value = "create_time")
    private LocalDateTime createTime;

    @TableField(value = "update_by")
    private String updateBy;

    @TableField(value = "update_time")
    private LocalDateTime updateTime;


}
