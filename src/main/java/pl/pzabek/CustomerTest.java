package pl.pzabek;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerTest {

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		appContext.scan("pl.pzabek");
		appContext.refresh();

		CustomerService customerService = (CustomerService) appContext.getBean("customerService");
		customerService.test();
		

		appContext.close();
	}
}