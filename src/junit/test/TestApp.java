package junit.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.offcn.crm.service.BookService;

public class TestApp {
	@Test
	public void test01(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		BookService bean = ac.getBean(BookService.class);
		bean.buyBook("ISBN-001", "Jerry");
		
	}
	
}
