package boardgame;
//package jogo de tabuleiro

public class Position {
//Posição
	private Integer row; //linhas
	private Integer column;// colunas;
	

	public Position(Integer row, Integer column) {
		this.row=row;
		this.column= column;
	}
	
	//metodos
	public Integer getRow() {
		return row;
	}
	public void setRow(Integer row) {
		this.row=row;
	}
	
	public Integer getColumn(){
		return column;
	}
	public void setColumn(Integer column) {
		this.column=column;
	}
	
	@Override
	public String toString() {
		return row+ ", "+ column ; 
	}
	
	

}
