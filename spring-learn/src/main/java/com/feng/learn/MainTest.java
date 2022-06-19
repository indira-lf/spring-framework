package com.feng.learn;

import com.feng.learn.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author
 * @time 2022/6/19 14:50
 * @Description- TODO
 */
public class MainTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		Person bean = context.getBean(Person.class);
		System.out.println(bean.toString());
	}
}
