package com.hnsic.store.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Goods {
    private Integer goodId;
    private String goodName;
    private String goodAddress;
    private Double goodPrice;
    private Integer typeId;
}
