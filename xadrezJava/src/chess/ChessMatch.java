package chess;

import boardgame.Board;

//partida de xadrez

public class ChessMatch { //somente a class partida de xadrez deve saber a dimensão do tabuleiro 
	
	private Board board;
	
	//construto
	public ChessMatch() {
		board= new Board(8,8); 
	}
	
	// metodo 
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat= new ChessPiece[board.getRows()][board.getColumns()];
		for(int i=0; i< board.getRows(); i++) {
			for(int j=0; i< board.getColumns(); j++) {
				mat[i][j]=(ChessPiece) board.pice(i, j); 
				
			}
		}
		return mat; 
	}
}
