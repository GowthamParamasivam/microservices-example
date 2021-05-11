package com.gowtham.toyinventoryservice.repository;
/* *
 * gowthamparamasivam created on 5/10/21 6:25 PM
 */

import com.gowtham.toyinventoryservice.domain.ToyInventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ToyInventoryRepository extends JpaRepository<ToyInventory, UUID> {

    List<ToyInventory> findAllByToyId(UUID toyId);

    List<ToyInventory> findAllByProductCode(String productCode);

    List<ToyInventory> findAll();
}
