package sample;

public class CalcBeanImpl implements CalcBean{
	private int su1;
	private int su2;
	
	public void setSu1(int su1) {
		this.su1 = su1;
	}
	
	public CalcBeanImpl(int su2) {
		this.su2 = su2;
	}
	
	@Override
	public void calcuate() {
		System.out.println("���� : "+(su1+su2));
		System.out.println("���� : "+(su1-su2));
		System.out.println("���� : "+(su1*su2));
		System.out.println("������ : "+(su1/su2));
		
	}
}
