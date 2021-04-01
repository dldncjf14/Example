package example2;

public class OrderDaoImpl implements OrderDao{
	public OrderDaoImpl() {
		System.out.println("orderDao생성자");
	}
	
	public void insertOrder() {
		System.out.println("주문 정보 추가");
	}
	
	public void removeOrder() {
		System.out.println("주문 정보 제거");
	}
}
