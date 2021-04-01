package sample3;

public class PointImpl implements Point{
	
	private double xpos;
	private double ypos;
	
	@Override
	public void setXpos(double xpos) {
		this.xpos = xpos;
	}

	@Override
	public void setYpos(double ypos) {
		this.ypos = ypos;
	}

	@Override
	public double getXpos() {
		return xpos;
	}

	@Override
	public double getYpos() {
		return ypos;
	}

}
