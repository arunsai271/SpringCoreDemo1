package com.spring.DemoCore1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
       
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		Student st=(Student)applicationContext.getBean("stu");
		System.out.println(st.toString());
		st.show();
	}

}
