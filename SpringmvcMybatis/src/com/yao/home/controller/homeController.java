package com.yao.home.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.cy.ssm.beans.UserBean;
import com.yao.home.dao.ITestDao;

@Controller
public class homeController 
{
	@Autowired
	private ITestDao userDao;
	
	@RequestMapping("/home")
	public ModelAndView login(HttpServletRequest req, UserBean user)
	{
		userDao.getAllUser();
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("page/home/home");
		return mv;
	}
}
