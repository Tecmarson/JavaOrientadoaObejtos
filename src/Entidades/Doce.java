package Entidades;

public class Doce extends Produto {

	private String marca;
	

	public Doce(int codigo, String nome, int estoque, double valorUnitario, String marca) {
		super(codigo, nome, estoque, valorUnitario);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

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
