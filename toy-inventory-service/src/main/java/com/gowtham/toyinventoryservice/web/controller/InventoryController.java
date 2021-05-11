package com.gowtham.toyinventoryservice.web.controller;
/* *
 * gowthamparamasivam created on 5/10/21 6:38 PM
 */

import com.gowtham.toyinventoryservice.dto.ToyInventoryDto;
import com.gowtham.toyinventoryservice.service.InventoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping("/{toyId}")
    public ResponseEntity<List<ToyInventoryDto>> listToyById(@PathVariable("toyId") UUID toyId){
        return ResponseEntity.ok(inventoryService.getToy(toyId));
    }

    @GetMapping("/getall")
    public ResponseEntity<List<ToyInventoryDto>> toysList(){
        return ResponseEntity.ok(inventoryService.getAllToy());
    }
}
