package com.hnsic.store.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {
    private Integer orderId;
    private Integer productId;
    private String productName;
    private String productAddress;
    private Double productPrice;
    private String productType;
    private String userName;
    private String address;
    private Integer goodId;
    private Integer petId;
    private Integer typeId;
    private Integer userId;
}
