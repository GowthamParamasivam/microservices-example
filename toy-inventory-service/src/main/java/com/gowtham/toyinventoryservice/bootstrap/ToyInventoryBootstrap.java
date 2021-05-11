package com.gowtham.toyinventoryservice.bootstrap;
/* *
 * gowthamparamasivam created on 5/10/21 6:24 PM
 */

import com.gowtham.toyinventoryservice.domain.ToyInventory;
import com.gowtham.toyinventoryservice.repository.ToyInventoryRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ToyInventoryBootstrap {

    public static final String TOY_1_PRODUCTCODE = "8005235079489";
    public static final String TOY_2_PRODUCTCODE = "4987176014894";
    public static final String TOY_3_PRODUCTCODE = "4987176014893";
    public static final UUID TOY_1_UUID = UUID.fromString("0a818933-087d-47f2-ad83-2f986ed087eb");
    public static final UUID TOY_2_UUID = UUID.fromString("a712d914-61ea-4623-8bd0-32c0f6545bfd");
    public static final UUID TOY_3_UUID = UUID.fromString("026cc3c8-3a0c-4083-a05b-e908048c1b08");


    private final ToyInventoryRepository toyInventoryRepository;

    public ToyInventoryBootstrap(ToyInventoryRepository toyInventoryRepository) {
        this.toyInventoryRepository = toyInventoryRepository;
    }
    @Bean
    private void loadInventoryData() {
        toyInventoryRepository.save(ToyInventory
                .builder()
                .toyId(TOY_1_UUID)
                .productCode(TOY_1_PRODUCTCODE)
                .quantityOnHand(50)
                .build());

        toyInventoryRepository.save(ToyInventory
                .builder()
                .toyId(TOY_2_UUID)
                .productCode(TOY_2_PRODUCTCODE)
                .quantityOnHand(50)
                .build());

        toyInventoryRepository.save(ToyInventory
                .builder()
                .toyId(TOY_3_UUID)
                .productCode(TOY_3_PRODUCTCODE)
                .quantityOnHand(50)
                .build());
    }

}
