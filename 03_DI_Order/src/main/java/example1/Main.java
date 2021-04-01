package example1;

public class Main {
	public static void main(String[] args) {
		
		OrderDao odao = new OrderDao();
		DeliveryDao ddao = new DeliveryDao();
		Service sv = new Service();
		
		sv.setDdao(ddao);
		sv.setOdao(odao);
		sv.order();
		sv.remove();
	}
}
