package boardgame;

public class Board {
	// tabuleiro 
	private Integer rows; // linha
	private Integer columns; // coluna
	private Piece[][] pieces; // matriz de peças
	
	// construtor 

	public Board(Integer rows, Integer columns) {
		this.rows=rows;
		this.columns=columns;
		pieces= new Piece[rows][columns];
	}
	
	// get e set
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows=rows;
	}
	
	public Integer getColumns() {
		return columns;
	}
	public void setColumns(Integer columns) {
		this.columns=columns;
	}
	
	
	// metodos
	public Piece pice(int row, int column) {
		return pieces[row][column];
	}
	public Piece pice(Position position) { 
		return pieces[position.getRow()][position.getColumn()];
	}
	
	

}
