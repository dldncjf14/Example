package sample1;

public class AopMain {
	public static void main(String[] args) {
		Order myorder = new Order();
		myorder.order();
		
		Board myboard = new Board();
		myboard.board();
	}
}
