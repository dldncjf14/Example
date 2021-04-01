package example3;

import org.springframework.stereotype.Component;

@Component("granduer")
public class Granduer implements Car{
	
	public Granduer() {
		System.out.println("Granduer");
	}
	@Override
	public String drive() {
		// TODO Auto-generated method stub
		return "granduer-drive";
	}

}
