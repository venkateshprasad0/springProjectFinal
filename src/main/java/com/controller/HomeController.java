package com.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.model.Product;
import com.dao.JavaConfigurationClass;
import com.dao.ProductDAOImpl;

@Controller
@RequestMapping("/app")
public class HomeController {
	
	static ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigurationClass.class);
	static ProductDAOImpl pDAO = context.getBean("pDAO", ProductDAOImpl.class);
	
	@RequestMapping("/home")
	public String getHome() {
		return "home";
	}
	
	@RequestMapping("/addProduct")
	public String addProduct() {
		return "addProduct";
	}
	
	@RequestMapping("/added")
	public String insertProduct(@RequestParam("pid") int pid, 
			@RequestParam("pname") String pname, @RequestParam("pprice") float pprice) {
		Product prod =  new Product();
		prod.setPid(pid);
		prod.setPname(pname);
		prod.setPprice(pprice);
		pDAO.insert(prod);
		return "successMessage";
	}
	
	@RequestMapping("/updateProduct")
	public String updateProduct() {
		return "updateProduct";
	}
	
	@RequestMapping("/updated")
	public String updateDone(@RequestParam("pid") int pid, 
			@RequestParam("pname") String pname, @RequestParam("pprice") float pprice) {
		Product prod =  new Product();
		prod.setPid(pid);
		prod.setPname(pname);
		prod.setPprice(pprice);
		pDAO.updateProduct(prod);
		return "updated";
	}
	
	@RequestMapping("/product")
	public ModelAndView getProduct() {
		List<Product> product = pDAO.getAllProducts();
		ModelAndView mv = new ModelAndView();
		mv.addObject("products",product);
		mv.setViewName("products");
		return mv;
	}
	
	@RequestMapping("/deleted")
	public String deleteDone(@RequestParam("pid") int pid) {
		Product prod =  new Product();
		prod.setPid(pid);
		pDAO.deleteProduct(prod);
		return "deleted";
	}
	
	@RequestMapping("/deleteProduct")
	public String deleteProduct() {
		return "deleteProduct";
	}
	
}


