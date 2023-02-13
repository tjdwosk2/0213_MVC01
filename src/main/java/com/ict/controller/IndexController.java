package com.ict.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

// 어노테이션이 아니므로 Controller 인터페이스를 상속 받아야한다 
// 어노테이션은 String으로도 리턴이 가능하다 
public class IndexController implements Controller{
		@Override
		public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
			//이중에 뷰가있다 첫번쨰
			ModelAndView mv = new ModelAndView();
			//view name 이름 정해준거 
			mv.setViewName("output");
			
			// 일 처리 = DB가 포함 => 서비스 
			// 일처리 후 데이터 저장
			// 일처리만 틀릴뿐이지만 방법은 같다 
			
			//1. ModelAndView 
			mv.addObject("name","홍길동");
			
			//2. request
			request.setAttribute("age", 17);
			
			//3. session
			request.getSession().setAttribute("addr", "서울");
			return mv;
			
		}

}
