package Entidades;

public class Revista extends Produto {

	private String editora;


	public Revista(int codigo, String nome, int estoque, double valorUnitario, String editora) {
		super(codigo, nome, estoque, valorUnitario);
		this.editora = editora;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
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
