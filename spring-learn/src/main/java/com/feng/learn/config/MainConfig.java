package com.feng.learn.config;

import com.feng.learn.bean.Cat;
import com.feng.learn.bean.Person;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author
 * @time 2022/8/27 18:01
 * @Description- TODO
 */
@Import({Person.class, MainConfig.MyImportRegistrar.class})
@Configuration
public class MainConfig {

//	@Bean
//	public Person person() {
//		Person person = new Person();
//		person.setAge(10);
//		person.setName("张三");
//		return person;
//	}

	/**
	 * BeanDefinitionRegistry Bean定义信息注册中心
	 */
	static class MyImportRegistrar implements ImportBeanDefinitionRegistrar {
		@Override
		public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata,
											BeanDefinitionRegistry registry) {

			//BeanDefinition
			RootBeanDefinition catDefinition = new RootBeanDefinition();
			catDefinition.setBeanClass(Cat.class);

			registry.registerBeanDefinition("tomCat",catDefinition);
		}
	}
}
