package boardgame;

public class Piece {
//pe�a
	protected Position position;
	// POsi��o posi��o
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
