package sample2;

public class Order {

	public void order() {
		String msg = "��ǰ �ֹ�";
		Login.login(msg);
		System.out.println(msg+"�ϱ�");//�ٽɱ��
		System.out.println(msg+"�� DB����");//������
		Logout.logout(msg);
	}
}
