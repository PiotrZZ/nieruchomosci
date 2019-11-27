package pl.pzabek;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pl.pzabek.proxy.ExpensiveObject;
import pl.pzabek.proxy.ExpensiveObjectProxy;

public class CustomerTest {

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		appContext.scan("pl.pzabek");
		appContext.refresh();

		CustomerService customerService = (CustomerService) appContext.getBean("customerService");
		customerService.test();
		

	    ExpensiveObject object = new ExpensiveObjectProxy();
	    object.process();
	    object.process();

		Samochod sam = appContext.getBean(Samochod.class);
		sam.setName("samochod");
		System.out.println(sam.getName());
		appContext.close();
	}
}