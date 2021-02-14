public class Piece {
	String name;
	int player; // 0,1 correspond to players
	Position position;
	
	public Piece(String name, int player, Position position) {
		this.name = name;
		this.player = player;
		this.position = position;
	}

}
