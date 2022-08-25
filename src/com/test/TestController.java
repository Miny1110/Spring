package com.test;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**컨트롤러의 역할을 하기 위해서 상속을 받아야 한다.
 * AbstractController : 추상클래스 > 메소드 오버라이드 필요 */
public class TestController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY); //시간 나옴
		
		String msg = "";
		
		if(hour>=6 && hour<8) {
			msg = "일어나세요";
		}else if(hour>=8 && hour<13) {
			msg = "늦었습니다";
		}else if(hour>=13 && hour<14) {
			msg = "점심시간입니다";
		}else if(hour>=14 && hour<18) {
			msg = "오후입니다";
		}else {
			msg = "퇴근입니다";
		}
		
		/**모델(데이터)*/
		request.setAttribute("hour", hour);
		request.setAttribute("message", msg);
		
		/** 뷰 지정
		 * /test/view.jsp랑 같다. 
		 * dispatcher-servlet의 viewResolver가 주소 완성해줌*/
		return new ModelAndView("test/view");
	}

}
