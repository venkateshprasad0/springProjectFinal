package com.controller;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.dao.AdminDaoImpl;
import com.dao.CustomerDaoImpl;
import com.dao.JavaConfigurationClass;

@Controller
public class LoginController {

	static ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigurationClass.class);
	static AdminDaoImpl adminDao = context.getBean("adminDao", AdminDaoImpl.class);
	static CustomerDaoImpl customerDao = context.getBean("customerDao", CustomerDaoImpl.class);

	@RequestMapping("/login")
	public String getLoginPage() {
		return "login";
	}

	@PostMapping("/loginValidate")
	public String loginValidate(@RequestParam("username") String username, @RequestParam("password") String password,
			@RequestParam("user_type") String user_type) {

		if ("A".equalsIgnoreCase(user_type)) {
			boolean isValid = adminDao.isValidAdmin(username, password);
			if (isValid) {
				return "adminPage";
			} else {
				return "loginError";
			}
		}
		else if("C".equalsIgnoreCase(user_type)){
			boolean isValid=customerDao.isValidCustomer(username, password);
			if (isValid) {
				return "customerPage";
			} else {
				return "loginError";
			}
			
		}
		return "login";
	}

}
