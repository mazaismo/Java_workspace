
public class MainGame {

	public static void main(String[] args) {

		Board board = new Board();

		board.printBoard();
		boolean canWrite = board.checkPosition(0, 0);
		System.out.println("canWrite: " + canWrite);

		board.setValue(1, 2, "X");
		board.setValue(1, 1, "O");

		board.printBoard();

		canWrite = board.checkPosition(1, 1);
		System.out.println("canWrite [1, 1]" + canWrite);

		Player player = new HumanPlayer();
		int[] movePosition = player.makeMove();
		System.out.println("movePosition: " + movePosition[0] + " " + movePosition[1]);
	}

}
