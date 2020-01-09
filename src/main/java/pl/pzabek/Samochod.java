package pl.pzabek;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Component
//@EnableTransactionManagement
//JA JA JA
public class Samochod implements ISamochod {

	private String name;

	private Double price;
	private boolean isPriceSet = false;
	private ArrayList<String>list=new ArrayList<String>();

	@Override
	public void setName(String name) {
		this.name = name;
	}

//	@Transactional(isolation = Isolation.SERIALIZABLE, propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
	@Transactional(isolation = Isolation.SERIALIZABLE,rollbackFor = RuntimeException.class)
	public void setPrice(Double price) throws Exception {

		System.out.println("SET PRICE");
		this.isPriceSet = true;
		this.price = price;
		this.list.add(new String());
		if (true)
		{
			throw new RuntimeException() ;
		}

	}

	@Override
	public String getName() {
		return name;
	}

	public void debug() {
		System.out.println("name = " + name + " price=" + price + " boolean=" + isPriceSet + " "+ list.size());
	}
}
