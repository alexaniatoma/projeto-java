package projetoJava.produto.repository;

import projetoJava.model.Produto;

public interface IProdutoRepository {
	
	public void procurarPorID(int id);
	public void listarProdutos();
	public void cadastrar(Produto produto);
	public void atualizar(Produto produto);
	public void deletar(int id);

}
