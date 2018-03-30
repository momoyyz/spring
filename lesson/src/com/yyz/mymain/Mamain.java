package com.yyz.mymain;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yyz.in.ChangBll;

public class Mamain {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ac=new ClassPathXmlApplicationContext("SpringMvc.xml");
		ChangBll b=(ChangBll)ac.getBean("changBll");
		b.to();

	}

}
