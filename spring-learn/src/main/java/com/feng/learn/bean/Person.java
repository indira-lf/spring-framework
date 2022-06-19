package com.feng.learn.bean;


/**
 * @author
 * @time 2022/6/19 14:53
 * @Description- TODO
 */
public class Person {
	Integer age;
	String name;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person{" +
				"age=" + age +
				", name='" + name + '\'' +
				'}';
	}
}
