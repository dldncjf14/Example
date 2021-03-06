package example2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("mycircle")
public class CircleImpl implements Circle{
	
	@Autowired
	@Qualifier("px") //implement 된 객체가 2개 이상 일 때 사용
	Shape pointx;
	
	int x;
	int y;
	int radius;
	
	public Shape getPointx() {
		return pointx;
	}

	public void setPointx(Shape pointx) {
		this.pointx = pointx;
	}

	public int getRadius() {
		return radius;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public String make() {
		// TODO Auto-generated method stub
		return pointx.make();
	}

}
