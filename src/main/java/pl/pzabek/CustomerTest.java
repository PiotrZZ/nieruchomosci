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

//	    LoggingAspect log = (LoggingAspect) appContext.getBean(LoggingAspect.class);
//	    System.out.println(log!=null ? "true":"null");
	    
	    Samochod sam2 = (Samochod) appContext.getBean(Samochod.class);
	    sam2.setName("Fiat");
	    System.out.println(sam2.getName());
	    sam2.debug();
	    
	    try
	    {
	    sam2.setPrice(5.000);
	    }
	    catch (Exception e) {
//	    	e.printStackTrace();
		}
	    sam2.debug();
	    sam2.debug();
	    sam2.debug();
	    
//		Samochod sam = appContext.getBean(Samochod.class);
//		sam.setName("samochod");
//		
		
//		System.out.println(sam.getName());
		appContext.close();
	}
}