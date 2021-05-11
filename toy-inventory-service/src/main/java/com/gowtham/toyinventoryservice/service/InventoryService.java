package com.gowtham.toyinventoryservice.service;
/* *
 * gowthamparamasivam created on 5/10/21 7:04 PM
 */

import com.gowtham.toyinventoryservice.dto.ToyInventoryDto;
import com.gowtham.toyinventoryservice.repository.ToyInventoryRepository;
import com.gowtham.toyinventoryservice.web.mapper.ToyInventoryMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class InventoryService {

    private final ToyInventoryRepository toyInventoryRepository;
    private final ToyInventoryMapper toyInventoryMapper;

    public InventoryService(ToyInventoryRepository toyInventoryRepository, ToyInventoryMapper toyInventoryMapper) {
        this.toyInventoryRepository = toyInventoryRepository;
        this.toyInventoryMapper = toyInventoryMapper;
    }

    public List<ToyInventoryDto> getToy(UUID toyId){
        return toyInventoryRepository.findAllByToyId(toyId)
                .stream()
                .map(toyInventoryMapper::toyInventoryToToyInventoryDto)
                .collect(Collectors.toList());
    }

    public List<ToyInventoryDto> getAllToy(){
        return toyInventoryRepository.findAll()
                .stream()
                .map(toyInventoryMapper::toyInventoryToToyInventoryDto)
                .collect(Collectors.toList());
    }
}
