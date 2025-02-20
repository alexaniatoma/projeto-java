package projetoJava.produto.controller;

import java.util.ArrayList;

import projetoJava.model.Produto;
import projetoJava.produto.repository.IProdutoRepository;

public class ProdutoController implements IProdutoRepository{
	
	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int id = 0;

	@Override
	public void procurarPorID(int id) {
		var produto = buscarNaCollection(id);
		
		if(produto != null)
			produto.exibirDetalhes();
		else
			System.out.println("\n O id " + id + " não foi encontrado!");
	}

	@Override
	public void listarProdutos() {
		for(var produto : listaProdutos) {
			produto.exibirDetalhes();
		}
		
	}

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("O produto id: " + produto.getId() + " foi criado com sucesso!");
		
	}

	@Override
	public void atualizar(Produto produto) {
		var buscaProduto = buscarNaCollection(produto.getId());
		listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);	
		
	}

	@Override
	public void deletar(int id) {
		var produto = buscarNaCollection(id);
		if(produto != null) {
			if(listaProdutos.remove(produto) == true)
				System.out.println("\n O produto id " + id + " foi deletado com sucesso!");
			
		} else {
			System.out.println("\n O produto id " + id + " não foi encontrado!");
		}
		
	}
	
	public int gerarId() {
		return ++ id;
	}
	
	public Produto buscarNaCollection(int id) {
		for(var produto : listaProdutos) {
			if(produto.getId() == id) {
				return produto;
			}
		}
		
		return null;
	}

}
