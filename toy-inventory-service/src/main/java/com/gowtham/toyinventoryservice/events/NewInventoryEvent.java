package com.gowtham.toyinventoryservice.events;


import com.gowtham.toyinventoryservice.dto.ToyDto;
import lombok.NoArgsConstructor;


@NoArgsConstructor
public class NewInventoryEvent extends ToyEvent {
    public NewInventoryEvent(ToyDto toyDto){
        super(toyDto);
    }
}
