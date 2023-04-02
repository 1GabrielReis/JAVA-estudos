package chess;

import boardgame.Board;
import boardgame.Piece;

//pe�a de xadrez

public class ChessPiece extends Piece {
	private Color color;
	
	//construtor
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	
	// get e set 
	public Color getColor() {
		return color;
	}
	
	

}