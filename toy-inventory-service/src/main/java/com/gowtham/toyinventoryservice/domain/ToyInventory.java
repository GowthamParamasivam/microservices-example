package com.gowtham.toyinventoryservice.domain;
/* *
 * gowthamparamasivam created on 5/10/21 6:30 PM
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ToyInventory extends BaseEntity{

    @Builder
    public ToyInventory(UUID id, Integer version, Timestamp createdDate, Timestamp lastModifiedDate, UUID toyId, String productCode, Integer quantityOnHand) {
        super(id, version, createdDate, lastModifiedDate);
        this.toyId = toyId;
        this.productCode = productCode;
        this.quantityOnHand = quantityOnHand;
    }

    private UUID toyId;
    private String productCode;
    private Integer quantityOnHand = 0;
}
