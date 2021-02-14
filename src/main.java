
public class main {

	public static void main(String[] args) {
		Board board = new Board();
		board.placeStartingPieces();
		board.printBoard();
		Piece tempPiece = board.board[0][0].removePiece();
		board.printBoard();
		System.out.println(tempPiece.name);
	}
}
