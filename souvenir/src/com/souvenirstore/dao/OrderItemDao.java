package com.souvenirstore.dao;

import com.souvenirstore.bean.OrderItem;

import java.util.List;

public interface OrderItemDao {

    int saveOrderItem(OrderItem orderItem);

    List<OrderItem> queryOrderItemsByOrderId(String orderId);
}
