package com.ict.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class StartController implements Controller{
	//오버로딩
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//modelaondview 2번째
		
		//view name
		ModelAndView mv =  new ModelAndView("output");
		
		// 일 처리 = DB가 포함 => 서비스 
		// 일처리 후 데이터 저장
		
		//1. ModelAndView 
		mv.addObject("name","hong");
		
		//2. request
		request.setAttribute("age", 74);
		
		//3. session
		request.getSession().setAttribute("addr", "selul");
		return mv;
		
	}
}
