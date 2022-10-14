package com.xxyw.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;

    // 逻辑删除MP
    @TableLogic
    private Boolean deleted;
}
