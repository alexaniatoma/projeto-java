package projetoJava.model;

public class Acessorio extends Produto{
	
	private String tipoMaterial;
	

	public Acessorio(int id, String nome, String descricao, float preco, int estoque, String tipoMaterial) {
		super(id, nome, descricao, preco, estoque);
		this.tipoMaterial = tipoMaterial;
	}


	public String getTipoMaterial() {
		return tipoMaterial;
	}



	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}



	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Tipo: " + tipoMaterial);
		
	}
		
}

	


