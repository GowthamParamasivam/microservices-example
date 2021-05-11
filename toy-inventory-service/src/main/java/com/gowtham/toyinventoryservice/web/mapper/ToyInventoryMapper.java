package com.gowtham.toyinventoryservice.web.mapper;
/* *
 * gowthamparamasivam created on 5/10/21 7:17 PM
 */

import com.gowtham.toyinventoryservice.domain.ToyInventory;
import com.gowtham.toyinventoryservice.dto.ToyInventoryDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface ToyInventoryMapper {

    public ToyInventory toyInventoryDtoToToyInventory(ToyInventoryDto toyInventoryDto);

    public ToyInventoryDto toyInventoryToToyInventoryDto(ToyInventory toyInventory);
}
