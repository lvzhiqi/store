package com.hnsic.store.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private Integer userId;
    private String userName;
    private String userAccount;
    private String password;
    private String address;
    private String userTel;
    private Integer sex;
    private Integer userType;
}
