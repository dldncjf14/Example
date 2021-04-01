package sample2;

public class Board {
	
	public void board() {
		String msg = "게시물 등록";
		Login.login(msg);
		System.out.println(msg+"하기");//핵심기능
		Logout.logout(msg);
	}
}
