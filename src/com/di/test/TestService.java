package com.di.test;

public class TestService {

	private Test test;
	
	public TestService() {}
	
	/**
	 * Dependency Injection(DI: 의존성 주입)
	 * TestService(Test test)로 데이터가 들어와서 test에 데이터가 들어가는 것
	 * */
	
	/**[오버로딩 생성자로 의존성 주입]*/
	public TestService(Test test) {
		this.test = test;
	}
	
	/**
	 * [메소드로 의존성 주입]
	 * 메소드로 의존성 주입 할때에는 기본생성자가 필수다.
	 * 생성자가 아닌 메소드로 의존석 주입을 할 때에는 무조건 set으로 써주고
	 * set을 제외한 그 뒤에 쓰는 것은
	 * application.xml의 property name에 무조건 소문자로 와야한다.
	 */
	public void setTest(Test test) {
		this.test = test;
	}
	
	public String getValue() {
		return test.result();
	}
}

