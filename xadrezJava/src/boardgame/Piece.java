package boardgame;

public class Piece {
//peça
	protected Position position;
	// POsição posição
	private Board board;
	// tabuleiro tabuleiro // uma classe provissoria 
	
	// construtor 

	public Piece(Board board) {
		this.board= board;
		position= null;
	}
	
	//metodos 
	protected Board getBoard() {
		return board;
	}
}
