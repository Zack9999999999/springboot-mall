package com.zach.springmall.service;

import com.zach.springmall.dto.CreateOrderRequest;
import com.zach.springmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
