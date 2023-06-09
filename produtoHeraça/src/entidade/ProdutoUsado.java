package entidade;

import java.text.SimpleDateFormat;
import java.util.Date;



public final class ProdutoUsado extends Produto {
	
	private static final SimpleDateFormat formatoData= new SimpleDateFormat("dd/MM/yyyy"); 
	
	private Date fabrišaoData;
	
	// construtores 
	public ProdutoUsado() {
		super();
	}
	public ProdutoUsado(String nome, Double prešo, Date fabrišaoData) {
		super(nome, prešo);
		this.fabrišaoData= fabrišaoData;
	}
	
	// get e set 
	public Date getFabricaoData() {
		return fabrišaoData;
	}
	public void setFabrišaoData(Date fabrišaoData) {
		this.fabrišaoData= fabrišaoData;
	}
	
	// metodos 
	// toString
	@Override
	public String toString() {
		return getNome()+ " (usado) - R$: "+String.format("%.2f", getPrešo())+" "+ formatoData.format(fabrišaoData)+ " ";
	}
	
}
