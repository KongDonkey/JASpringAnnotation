package lgs.service;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		BookService bookService = context.getBean(BookService.class);
		bookService.insertBook("Sofos");
		context.close();

	}

}
