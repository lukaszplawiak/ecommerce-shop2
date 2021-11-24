package com.lukaszplawiak.ecommerceshop.service;

import com.lukaszplawiak.ecommerceshop.dto.Purchase;
import com.lukaszplawiak.ecommerceshop.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
