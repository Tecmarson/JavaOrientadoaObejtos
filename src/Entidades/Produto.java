package Entidades;

public  abstract class Produto {
	//Atributos
	private int codigo;
	private String nome;
	private int estoque;
	private double valorUnitario;
	//Construtor
	public Produto(int codigo, String nome, int estoque, double valorUnitario) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.estoque = estoque;
		this.valorUnitario = valorUnitario;
	}
	//Encapsulamento
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEstoque() {
		return estoque;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	//metodos
	public void incluirEstoque(int quantidade) {
		estoque = estoque + quantidade;
	}
	
	public void tirarEstoque(int quantidade) {
		
		if(quantidade <= estoque)
		{			
			estoque = estoque + quantidade;			
		} 
		else
		{			
			System.out.println("Não há estoque suficiente!!!");			
		}
	}
	
	
}
