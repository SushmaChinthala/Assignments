package com.example.RESTAPI.RESTAPIDEMO.Assignments;

public class OrderDetails
{
	 private Integer OrderId;
	    private String OrderName;
	    private Double OrderPrice;
	    public OrderDetails(Integer orderId, String orderName, Double orderPrice) 
	    {
	        super();
	        this.OrderId = orderId;
	        this.OrderName = orderName;
	        this.OrderPrice = orderPrice;
	    }
	    public Integer getOrderId() {
	        return OrderId;
	    }
	    public void setOrderId(Integer orderId) {
	        OrderId = orderId;
	    }
	    public String getOrderName() {
	        return OrderName;
	    }
	    public void setOrderName(String orderName) {
	        OrderName = orderName;
	    }
	    public Double getOrderPrice() {
	        return OrderPrice;
	    }
	    public void setOrderPrice(Double orderPrice) {
	        OrderPrice = orderPrice;
	    }
	    @Override
	    public String toString() {
	        return String.format("id is %d,price is %d,name is %s ",+OrderId,+OrderPrice,OrderName);
	    }



	}

