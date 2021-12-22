package Entidades;
//Herança
public class Bebida extends Produto {

	private String tipo;

	
	public Bebida(int codigo, String nome, int estoque, double valorUnitario, String tipo) {
		super(codigo, nome, estoque, valorUnitario);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	//Polimorfismo do tipo sobrescrito
	@Override
	public void incluirEstoque(int quantidade) {
		// TODO Auto-generated method stub
		super.incluirEstoque(quantidade);
	}

	@Override
	public void tirarEstoque(int quantidade) {
		// TODO Auto-generated method stub
		super.tirarEstoque(quantidade);
	}
	
	
	
	
}
