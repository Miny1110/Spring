package com.di.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ResultMain {

	public static void main(String[] args) {
		
		String path = "com/di/test/applicationContext.xml";
		
		Resource res = new ClassPathResource(path);
		
		/**
		 * 스프링의 컨테이너를 생성
		 * BeanFactory: 외부 자원으로부터 설정 정볼르 읽어와 빈 객체 생성
		 */
		BeanFactory factory = new XmlBeanFactory(res);
		
		/**스프링 컨테이너에서 bean객체를 호출*/
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
