package projetoJava.model;

public abstract class Produto {
	
	private int id;
	private String nome;
	private String descricao;
	private float preco;
	private int estoque;
	
	public Produto () {
		
	}
	
	public Produto(int id, String nome, String descricao, float preco, int estoque) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.estoque = estoque;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	public void exibirDetalhes() {
		System.out.println("\n\n*************************************************************");
		System.out.println("Descrição do Produto");
		System.out.println("*************************************************************");
		System.out.println("ID : " + id);
		System.out.println("Nome: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Preço: " + preco);
		System.out.println("Estoque: " + estoque);
	}
	
	public void atualizarEstoque(int quantidade) {
		this.estoque += quantidade;
		System.out.println("Novo estoque de " + nome + ": " + this.estoque);
	}

}
