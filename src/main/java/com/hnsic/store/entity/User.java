package com.hnsic.store.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("user_table")
public class User {
    @TableId(value = "user_id",type = IdType.AUTO)
    private Integer userId;
    @TableField(value = "user_name")
    private String userName;
    @TableField(value = "user_account")
    private String userAccount;
    private String password;
    private String address;
    private String userTel;
    private Integer sex;
}
