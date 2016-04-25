package lgs.service;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
//		BookService bookService = context.getBean(BookService.class);
//		bookService.insertBook("Sofos");
		AuthorService authorService = context.getBean(AuthorService.class);
		authorService.insertAuthor("Arhimed1");
		authorService.insertAuthor("Arhimed2");
		authorService.insertAuthor("Arhimed3");
		authorService.insertAuthor("Arhimed4");
		authorService.insertAuthor("Arhimed5");
		
		
		
		context.close();

	}

}
