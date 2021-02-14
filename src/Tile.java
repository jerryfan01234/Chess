import java.util.ArrayList;

public class Tile {
	boolean empty = true;
	Piece piece;
	Position position;
	ArrayList<Object> history = new ArrayList<Object>();
	
	public Tile(Position position) {
		this.position = position;
	}
	
	public void addPiece(Piece piece) {
		this.empty = false;
		this.piece = piece;
	}
	
	public Piece removePiece() {
		this.empty = true;
		Piece tempPiece = this.piece;
		this.piece = null;
		return tempPiece;
	}
	
	public void updateHistory() {
		if (this.empty) {
			this.history.add(null);
		} else {
			this.history.add(new TileHistory(this.piece.name, this.piece.player));
		}
	}
}

class TileHistory{
	String name;
	int player;
	
	public TileHistory(String name, int player) {
		this.name = name;
		this.player = player;
	}
}
