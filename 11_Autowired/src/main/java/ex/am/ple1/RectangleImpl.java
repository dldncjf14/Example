package ex.am.ple1;

public class RectangleImpl implements Rectangle{

	Shape pointy;
	int x;
	int y;
	int radius;
	
	public Shape getPointy() {
		return pointy;
	}

	public void setPointy(Shape pointy) {
		this.pointy = pointy;
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
		return y;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return y;
	}

	@Override
	public String make() {
		// TODO Auto-generated method stub
		return pointy.make();
	}

}
