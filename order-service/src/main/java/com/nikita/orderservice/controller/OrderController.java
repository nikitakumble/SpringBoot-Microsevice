package com.nikita.orderservice.controller;

import com.nikita.orderservice.dto.OrderRequest;
import com.nikita.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public String placeOrder(@RequestBody OrderRequest orderRequest){
        orderService.placeOrder(orderRequest);
        return "Order placed successfully";
    }
}
