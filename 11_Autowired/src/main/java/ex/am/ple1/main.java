package ex.am.ple1;

public class main {

	public static void main(String[] args) {
		Shape px = new PointX();
		Shape py = new PointY();
		
		CircleImpl circle = new CircleImpl();
		
		circle.setPointx(px);
		System.out.println(circle.make());
		
		RectangleImpl rec = new RectangleImpl();
		rec.setPointy(py);
		System.out.println(rec.make());
	}

}
