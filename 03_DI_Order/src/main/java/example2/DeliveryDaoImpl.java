package example2;

public class DeliveryDaoImpl implements DeliveryDao{
	
	public DeliveryDaoImpl() {
		System.out.println("deliveryDaoImpl");
	}
	
	@Override
	public void insertAddress() {
		System.out.println("����� ���� �߰� : "+"insertAddress");
	}

	@Override
	public void removeAddress() {
		System.out.println("����� ���� �߰� : "+"removeAddress");
	}

}
