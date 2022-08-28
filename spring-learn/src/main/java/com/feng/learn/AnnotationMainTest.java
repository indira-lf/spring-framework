package com.feng.learn;

import com.feng.learn.bean.Person;
import com.feng.learn.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author
 * @time 2022/8/27 17:59
 * @Description- 注解版Spring的用法
 */
public class AnnotationMainTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
//		Person bean = applicationContext.getBean(Person.class);
//		System.out.println(bean);
		String[] definitionNames = applicationContext.getBeanDefinitionNames();
		for (String definitionName : definitionNames) {

			System.out.println(definitionName);
		}
	}
}
