package com.zach.springmall.service;

import com.zach.springmall.dto.CreateOrderRequest;
import com.zach.springmall.dto.OrderQueryParams;
import com.zach.springmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
