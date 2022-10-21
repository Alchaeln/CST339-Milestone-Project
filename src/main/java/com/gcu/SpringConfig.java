package com.gcu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.gcu.business.OrdersBusinessServiceInterface;
import com.gcu.business.OrdersBusinessService;

/**
 * SpringConfig configures the Spring Bean to generate a new OrdersBusinessService
 * @author Edu and Chael
 */
@Configuration
public class SpringConfig {
	
	/**
	 * creates a Spring Bean as an instance of the class OrdersBusinessService
	 * @return OrdersBusinessService
	 */
	@Bean(name="ordersBusinessService", initMethod="init", destroyMethod="destroy")
	//@SessionScope
	//@Scope(value="prototype", proxyMode=ScopedProxyMode.TARGET_CLASS)
	public OrdersBusinessServiceInterface getOrdersBusiness() 
	{
		return new OrdersBusinessService();
	}
}
