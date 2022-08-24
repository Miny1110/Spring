package com.di.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ResultMain {

	public static void main(String[] args) {
		
		/**
		 * path 주소로 가서 그 내용을 읽은 것이 res
		 * 그냥 그 내용을 단순히 문자화해서 읽기만 한 텍스트 형태로 생각하면 된다.
		 * 이 읽은 내용을 스프링 언어로 번역해서 컨테이너를 생성하는 과정이 필요
		 */
		String path = "com/di/test/applicationContext.xml";
		Resource res = new ClassPathResource(path);
		
		/**
		 * 스프링의 컨테이너를 생성
		 * BeanFactory: 외부 자원으로부터 설정 정보를 읽어와 빈 객체 생성
		 * xml파일을 읽어서 그 내용을 문자화시켜서 넣어놓고(res)
		 * 문자화된 내용을 객체화해서 생성(factory)
		 */
		BeanFactory factory = new XmlBeanFactory(res);
		
		/**
		 * 스프링 컨테이너에서 bean객체를 호출
		 * 객체생성은 자바(스프링)이 했기 때문에 Object일 것. 그래서 downcast 필요
		 */
		TestService ob = (TestService)factory.getBean("testService");
		
		System.out.println(ob.getValue());
		
/**
		Test ob1 = new TestImpl1();
		Test ob2 = new TestImpl2();
		
		System.out.println(ob1.result());
		System.out.println(ob2.result());
		
위아래 같은 결과 다른 방법	
	
		Test ob;
		ob = new TestImpl1();
		System.out.println(ob.result());
		
		ob = new TestImpl2();
		System.out.println(ob.result());
*/

		

	}

}
