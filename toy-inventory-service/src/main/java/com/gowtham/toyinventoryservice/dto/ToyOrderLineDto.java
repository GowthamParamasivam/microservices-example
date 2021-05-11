package com.gowtham.toyinventoryservice.dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ToyOrderLineDto extends BaseItem {

    @Builder
    public ToyOrderLineDto(UUID id, Integer version, OffsetDateTime createDate, OffsetDateTime lastModifiedDate, String productCode, String oilName, String oilType, UUID oilId, Integer orderQuantity, BigDecimal price) {
        super(id, version, createDate, lastModifiedDate);
        this.productCode = productCode;
        this.toyName = oilName;
        this.toyType = oilType;
        this.toyId = oilId;
        this.orderQuantity = orderQuantity;
        this.price = price;
    }

    private String productCode;
    private String toyName;
    private String toyType;
    private UUID toyId;
    private Integer orderQuantity = 0;
    private BigDecimal price;
    private Integer quantityAllocated = 0;
}
