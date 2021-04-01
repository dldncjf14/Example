package example1;

public class Service {
	
	private OrderDao odao;
	private DeliveryDao ddao;
	
	public Service() {
		System.out.println("���� ������");
	}

	public OrderDao getOdao() {
		return odao;
	}

	public void setOdao(OrderDao odao) {
		this.odao = odao;
	}

	public DeliveryDao getDdao() {
		return ddao;
	}

	public void setDdao(DeliveryDao ddao) {
		this.ddao = ddao;
	}
	
	public void order() {
		odao.insertOrder();
		ddao.insertAddress();
	}
	
	public void remove() {
		odao.removeOrder();
		ddao.removeAddress();
	}
	
}
