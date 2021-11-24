package com.lukaszplawiak.ecommerceshop.controller;

import com.lukaszplawiak.ecommerceshop.dto.Purchase;
import com.lukaszplawiak.ecommerceshop.dto.PurchaseResponse;
import com.lukaszplawiak.ecommerceshop.service.CheckoutService;
import org.springframework.web.bind.annotation.*;

//@CrossOrigin("http://localhost:4200") - bo konfiguruje w my app config
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {
        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);
        return purchaseResponse;
    }
}

