package com.fogcoding.XMLAop;

import com.fogcoding.XMLAop.pojo.LandLord;
import com.fogcoding.XMLAop.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import org.junit.Test;

/**
 * Created By Andrew Duan
 * Date:2019/8/13
 * e-mail:thinfog@126.com
 */
public class test {

	public static void main1(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		ProductService productService = (ProductService) context.getBean("productService");
		productService.doSomeService();

		LandLord lord = context.getBean("landlord_xml",LandLord.class);
		lord.service();
	}



}
