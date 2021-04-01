package sample1;

public class Order {

	public void order() {
		String msg = "상품 주문";
		System.out.println(msg+"을 하기 위한 로그인 수행");//공통기능
		System.out.println(msg+"하기");//핵심기능
		System.out.println(msg+"을 DB저장");//공통기능
		System.out.println(msg+"후 로그아웃 수행");//공통기능
	}
}
