
public class Board {
	Tile board[][] = new Tile[8][8];
	
	public Board() {
		for (int x=0; x < 8; x++) {
			for (int y=0; y < 8; y++) {
				this.board[x][y] = new Tile(new Position(x, y));
			}
		}
	}
	
	public void placeStartingPieces() {
		// Place pawns
		for (int x=0; x < 8; x++) {
			this.board[x][1].addPiece(new Piece("p", 0, new Position(x, 1)));
			this.board[x][6].addPiece(new Piece("p", 1, new Position(x, 6)));
		}	
		
		// Place rooks
		this.board[0][0].addPiece(new Piece("r", 0, new Position(0, 0)));	
		this.board[7][0].addPiece(new Piece("r", 0, new Position(7, 0)));	
		this.board[0][7].addPiece(new Piece("r", 1, new Position(0, 7)));	
		this.board[7][7].addPiece(new Piece("r", 1, new Position(7, 7)));	

		// Place knights.addPiece
		this.board[1][0].addPiece(new Piece("n", 0, new Position(1, 0)));	
		this.board[6][0].addPiece(new Piece("n", 0, new Position(6, 0)));	
		this.board[1][7].addPiece(new Piece("n", 1, new Position(1, 7)));	
		this.board[6][7].addPiece(new Piece("n", 1, new Position(6, 7)));	
		
		// Place bishops.addPiece    
		this.board[2][0].addPiece(new Piece("b", 0, new Position(2, 0)));	
		this.board[5][0].addPiece(new Piece("b", 0, new Position(5, 0)));	
		this.board[2][7].addPiece(new Piece("b", 1, new Position(2, 7)));	
		this.board[5][7].addPiece(new Piece("b", 1, new Position(5, 7)));	

		// Place queens
		this.board[3][0].addPiece(new Piece("q", 0, new Position(3, 0)));	
		this.board[3][7].addPiece(new Piece("q", 1, new Position(3, 7)));	

		// Place kings
		this.board[4][0].addPiece(new Piece("k", 0, new Position(4, 0)));	
		this.board[4][7].addPiece(new Piece("k", 1, new Position(4, 7)));	
	}
	
	public void printBoard() {
		for (int y=7; y >= 0; y--) {
			String boardRow = "";
			for (int x=0; x < 8; x++) {
				if (board[x][y].isEmpty()) {
					boardRow += "e ";
				} else {
					boardRow += board[x][y].piece.name;
					boardRow += Integer.toString(board[x][y].piece.player);
				}
				boardRow += " ";
			}	
			System.out.println(boardRow + "\n");
		}
	}
}

