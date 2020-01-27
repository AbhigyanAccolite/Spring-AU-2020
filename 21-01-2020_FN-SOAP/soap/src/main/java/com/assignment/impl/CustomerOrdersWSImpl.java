package com.assignment.impl;

import java.math.Integer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.catalina.servlets.DefaultServlet.SortManager.Order;
import org.apache.cxf.feature.Features;

import com.akash.ws.trainings.CreateOrdersRequest;
import com.akash.ws.trainings.CreateOrdersResponse;
import com.akash.ws.trainings.CustomerOrdersPortType;
import com.akash.ws.trainings.DeleteOrdersRequest;
import com.akash.ws.trainings.DeleteOrdersResponse;
import com.akash.ws.trainings.GetOrdersRequest;
import com.akash.ws.trainings.GetOrdersResponse;
import com.akash.ws.trainings.Product;
import com.akash.ws.trainings.UpdateOrdersRequest;
import com.akash.ws.trainings.UpdateOrdersResponse;

@Features(features="org.apache.cxf.feature.LoggingFeature")
public class CustomerOrdersWSImpl implements CustomerOrdersPortType{

	Map<Integer,List<Order>> custOrders=new HashMap<>();
	int currenntId;
	
	public CustomerOrdersWSImpl() {
		init();
	}
	
	public void init() {
		List<Order> listOfOrders=new ArrayList<>();
		Order order = new Order();
		order.setId(Integer.valueOf(1));		
		Product item=new Product();


		product.setId("34");
		product.setDescription("Abhigyan");
		product.setQuantity(Integer.valueOf(1));
		order.getProduct().add(item);
		listOfOrders.add(order);		
		custOrders.put(Integer.valueOf(++currentId), orders);
	}
	
	@Override
	public GetOrdersResponse getOrders(GetOrdersRequest request) {
		Integer id=request.getCustomerId();
		List<Order> list_Of_Orders = customerOrders.get(id);


		GetOrdersResponse responseGetObject =new GetOrdersResponse();
		responseGetObject.getOrder().addAll(list_Of_Orders);
		
		return responseGetObject;
	}

	@Override
	public CreateOrdersResponse createOrders(CreateOrdersRequest request) {
		Integer id =request.getCustomerId();
		Order order=request.getOrder();
		List<Order> list_Of_Orders =customerOrders.get(id);


		list_Of_Orders.add(order);
		CreateOrdersResponse responseCreateObject = new CreateOrdersResponse();
		responseCreateObject.setResult(true);
		
 		return responseCreateObject;
	}

	@Override
	public DeleteOrdersResponse deleteOrders(DeleteOrdersRequest request) {

		//Finding the customerId & orderID.. Putting the order on the list & updating the list in the cutstomer order list
		Integer id = request.getCustomerId();		
		Integer order_Id = request.getOrderId();
		List<Order> list_Of_Orders=customerOrders.get(id);


		orders.remove(orderId);
		custOrders.remove(id);
		custOrders.put(idd, list_Of_Orders);
		DeleteOrdersResponse responseDeleteObject = new DeleteOrdersResponse();
		responseDeleteObject.setResult(true);
		
		return responseDeleteObject;
	}

	@Override
	public UpdateOrdersResponse updateOrders(UpdateOrdersRequest request) {
		//Deleting the order with the id. Inserting the updated orders in the customer order list
		Integer id =request.getCustomerId();
		Integer order_Id = request.getOrderId();
		Order order=request.getOrder();		
		List<Order> orders=customerOrders.get(id);


		orders.remove(order_Id);
		orders.add(order);
		custOrders.remove(id);
		custOrders.put(id, orders);
		UpdateOrdersResponse responseUpdateObject = new UpdateOrdersResponse();
		responseUpdateObject.setResult(true);
		
		return responseUpdateObject;
	}

	
}
