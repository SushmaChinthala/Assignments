package com.example.RESTAPI.RESTAPIDEMO.Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Controller;

@Controller
public class OrderService 
{
		
	    private static List<OrderDetails> details= new ArrayList<>();
	    private static int OrderCount=0;
	    static {
	    	details.add(new OrderDetails(++OrderCount,"watch",2000.0));
	        details.add(new OrderDetails(++OrderCount,"Earphones",200.0));
	        details.add(new OrderDetails(++OrderCount,"Mobile",20000.0));
	    }
	    public List<OrderDetails> findAll()
	    {
	    	 return details;
	    }
	    public OrderDetails save(OrderDetails newOrder)
	    {
	        newOrder.setOrderId(++OrderCount);
	        details.add(newOrder);
	        return newOrder;
	        }
	    public OrderDetails findOne(int id)
	    {
	        Predicate<? super OrderDetails> predicate = user -> user.getOrderId().equals(id);
	       return details.stream().filter(predicate).findFirst().orElse(null);
	    }
	    public void deleteById(int id) {
	        Predicate<? super OrderDetails> predicate = user -> user.getOrderId().equals(id);
	        details.removeIf(predicate);
	    }
	    public void  updateById(int id, OrderDetails o) {



	       for(int i=0; i<details.size(); i++)
	        {
	            OrderDetails Order=details.get(i);
	            if(Order.getOrderId().equals(id))
	            {
	                details.set(i, o);
	                return;



	           }
	        }
	    }    

 }
