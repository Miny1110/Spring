package com.test;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

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
		
		request.setAttribute("hour", hour);
		request.setAttribute("message", msg);
		
		/** /test/view.jsp랑 같다. */
		return new ModelAndView("test/view");
	}

}
