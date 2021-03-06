package com.gowtham.toyinventoryservice.dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ToyOrderDto extends BaseItem{

    @Builder
    public ToyOrderDto(UUID id, Integer version, OffsetDateTime createDate, OffsetDateTime lastModifiedDate, UUID customerId, String customerRef, List<ToyOrderLineDto> oilOrderLines, OrderStatusEnum orderStatusEnum, String orderStatusCallbackUrl) {
        super(id, version, createDate, lastModifiedDate);
        this.customerId = customerId;
        this.customerRef = customerRef;
        this.oilOrderLines = oilOrderLines;
        this.orderStatusEnum = orderStatusEnum;
        this.orderStatusCallbackUrl = orderStatusCallbackUrl;
    }

    private UUID customerId;
    private String customerRef;
    private List<ToyOrderLineDto> oilOrderLines;
    private OrderStatusEnum orderStatusEnum;
    private String orderStatusCallbackUrl;
}
