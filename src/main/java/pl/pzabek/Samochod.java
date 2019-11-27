package pl.pzabek;

import org.springframework.stereotype.Component;

@Component
public class Samochod implements ISamochod {

	private String name;

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}
