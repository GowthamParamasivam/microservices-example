package com.gowtham.toyinventoryservice.events;

import com.gowtham.toyinventoryservice.dto.ToyOrderDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AllocateOrderResult {

    private ToyOrderDto toyOrderDto;
    private Boolean allocationError = false;
    private Boolean pendingInventory = false;
}
