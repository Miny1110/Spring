package com.di.test;

public class TestImpl2 implements Test{

	private String name;
	private int age;
	
	public TestImpl2() {
		this.name = "박은빈";
		this.age = 30;
	}
	
	public TestImpl2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String result() {
		String str = "이름: " + name + ", 나이: " + age;
		return str;
	}

	
	
}
