import java.util.ArrayList;

public class Tile {
	Piece piece;
	Position position;
	ArrayList<Object> history = new ArrayList<Object>();
	
	public Tile(Position position) {
		this.position = position;
	}
	
	public void addPiece(Piece piece) {
		this.piece = piece;
	}
	
	public Piece removePiece() {
		Piece tempPiece = this.piece;
		this.piece = null;
		return tempPiece;
	}
	
	public void updateHistory() {
		if (this.isEmpty()) {
			this.history.add(null);
		} else {
			this.history.add(new TileHistory(this.piece.name, this.piece.player));
		}
	}
	
	public boolean isEmpty() {
		return this.piece == null;
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
