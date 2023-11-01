package com.nikita.inventoryservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nikita.inventoryservice.model.Inventory;
import com.nikita.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InventoryService {

	@Autowired
	InventoryRepository inventoryRepository;
	
	@Transactional(readOnly = true)
	public boolean isInStock(String skuCode) {
		Inventory obj = new Inventory();
		
		
		Optional<Inventory> isPresent = inventoryRepository.findBySkuCode(skuCode);
		return isPresent.isPresent();
	}
}
