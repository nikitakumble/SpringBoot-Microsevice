package com.nikita.inventoryservice;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.nikita.inventoryservice.model.Inventory;
import com.nikita.inventoryservice.repository.InventoryRepository;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}	
	/*	
	@Bean
	public CommandLineRunner loadData(InventoryRepository InventoryRepository) {
		return args -> {
			Inventory inventory1 = new Inventory();
			inventory1.setSkuCode("Ipone");
			inventory1.setQuantity(13);
			
			Inventory inventory2 = new Inventory();
			inventory2.setSkuCode("Galaxy Series");
			inventory2.setQuantity(10);
			
			InventoryRepository.save(inventory1);
			InventoryRepository.save(inventory2);
		};
	}
	*/
}
