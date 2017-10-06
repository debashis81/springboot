package com.debashis.greatbrains.springboot;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chapter1")
public class Chapter1 {

	private ClassPathXmlApplicationContext ctx;


	@RequestMapping("/method1")
	public String method1() {
		Date dt = new Date();
		SimpleDateFormat fmt = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String formatDate = fmt.format(dt);
		return "Welcome to Chapter1!! : Current DateTime is :" + formatDate;
	}
	

	@RequestMapping("/cricket")
	public String cricket() {
	 ctx = new ClassPathXmlApplicationContext("question.xml");
	 Question qst = (Question) ctx.getBean("q");
	 return qst.toString();
	}

}
