package com.hnsic.store.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pets {
    private Integer petId;
    private String petName;
    private Integer petAge;
    private String petAddress;
    private Double petPrice;
    private Integer typeId;
}
