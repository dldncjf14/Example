package example2;

import example1.DeliveryDao;
import example1.OrderDao;

public class ServiceImpl implements Service{
	private OrderDaoImpl odao;
	
	public OrderDaoImpl getOdao() {
		return odao;
	}

	public void setOdao(OrderDaoImpl odao) {
		this.odao = odao;
	}

	public DeliveryDaoImpl getDdao() {
		return ddao;
	}

	public void setDdao(DeliveryDaoImpl ddao2) {
		this.ddao = ddao2;
	}

	private DeliveryDaoImpl ddao;
	
	public ServiceImpl() {
		System.out.println("서비스 생성자");
	}
	
	@Override
	public void order() {
		odao.insertOrder();
		ddao.insertAddress();
	}

	@Override
	public void remove() {
		odao.removeOrder();
		ddao.removeAddress();
	}
	
}
