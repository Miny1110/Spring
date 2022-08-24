package com.di.test;

public class TestService {

	private Test test;
	
	/**[기본생성자]*/
	public TestService() {}
	
	/**
	 * Dependency Injection(DI: 의존성 주입)
	 * TestService(Test test)로 데이터가 들어와서 test에 데이터가 들어가는 것
	 * 기본생성자(TestService())로는 보통 하지 않는다.
	 */
	
	/**[오버로딩 생성자로 의존성 주입]*/
	public TestService(Test test) {
		this.test = test;
	}
	
	/**
	 * [메소드로 의존성 주입]
	 * 메소드로 의존성 주입 할때에는 기본생성자가 필수다.
	 * 메소드는 기본생성자로 객체를 생성한 후에 메소드를 호출하는 것이기 때문
	 * 생성자가 아닌 메소드로 의존성 주입을 할 때에는 메소드명 앞부분을 무조건 set으로 써주고,
	 * set을 제외한 그 뒷부분은 application.xml의 property name에 무조건 소문자로 와야한다.
	 */
	public void setTest(Test test) {
		this.test = test;
	}
	
	public String getValue() {
		return test.result();
	}
}

