package example2;

import org.springframework.stereotype.Component;

@Component("py")
public class PointY implements Shape{
	
	public PointY() {
		System.out.println("PointY");
	}

	@Override
	public String make() {
		// TODO Auto-generated method stub
		return "Y�� �����";
	}

	@Override
	public String delete() {
		// TODO Auto-generated method stub
		return "Y�� �����";
	}
}
