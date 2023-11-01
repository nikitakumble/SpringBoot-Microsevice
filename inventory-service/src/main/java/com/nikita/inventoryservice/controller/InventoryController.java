package com.nikita.inventoryservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.nikita.inventoryservice.service.InventoryService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {
	
	@Autowired
	InventoryService inverntoryService;
	
	@GetMapping("/{sku-code}")
	@ResponseStatus(HttpStatus.OK)
	public boolean isInStock(@PathVariable("sku-code") String skuCode) {
		return inverntoryService.isInStock(skuCode);		
	}
}
