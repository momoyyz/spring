package com.yyz.mymain;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yyz.in.ChangBll;

public class Mamain {
	@Test
	public void MyTest1() {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"SpringMvc.xml");
		ChangBll b = (ChangBll) ac.getBean("changBll");
		b.to();

	}
	@Test
	public void MyTest2(){
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"SpringMvc.xml");
		ChangBll changBll1 = (ChangBll) ac.getBean("changBll");
		ChangBll changBll2 = (ChangBll) ac.getBean("changBll");
		ChangBll changBll3 = (ChangBll) ac.getBean("changBll");
		System.out.println(changBll1==changBll2);
		System.out.println(changBll3==changBll2);
	}
	@Test
	public void MyTest3(){
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"SpringMvc.xml");
		ChangBll changBll = (ChangBll) ac.getBean("changBllarg");
		changBll.to();
	}

}
