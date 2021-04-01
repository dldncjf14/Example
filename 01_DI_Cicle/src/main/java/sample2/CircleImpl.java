package sample2;

public class CircleImpl implements Circle{

	private double radius;
	private Point point;
	
	
	public CircleImpl(double radius, Point point) {
		super();
		this.radius = radius;
		this.point = point;
	}

	@Override
	public void display() {
		System.out.println("원인 중심:"+point.getXpos()+","+point.getYpos());
		System.out.println("원의 면석 : "+getArea());
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2.0);
	}

}
