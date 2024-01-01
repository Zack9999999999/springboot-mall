package com.zach.springmall.dao;

import com.zach.springmall.model.Order;
import com.zach.springmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Order getOrderById(Integer order);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}
