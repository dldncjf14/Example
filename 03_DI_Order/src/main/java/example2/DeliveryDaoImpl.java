package example2;

public class DeliveryDaoImpl implements DeliveryDao{
	
	public DeliveryDaoImpl() {
		System.out.println("deliveryDaoImpl");
	}
	
	@Override
	public void insertAddress() {
		System.out.println("배송지 정보 추가 : "+"insertAddress");
	}

	@Override
	public void removeAddress() {
		System.out.println("배송지 정보 추가 : "+"removeAddress");
	}

}
