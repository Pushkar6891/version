package com.company.mockito.order.bo;

import com.company.mockito.order.bo.exception.BOException;
import com.company.mockito.order.dto.Order;

public interface OrderBO {

	boolean placeOrder(Order order) throws BOException;

	boolean cancelOrder(int id) throws BOException;

	boolean deleteOrder(int id) throws BOException;

}
