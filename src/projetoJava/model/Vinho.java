package projetoJava.model;

public class Vinho extends Produto {
	
	private int safra;
	private double teorAlcoolico;
	
	
		public Vinho(int id, String nome, String descricao, float preco, int estoque, int safra, double teorAlcoolico) {
		super(id, nome, descricao, preco, estoque);
		this.safra = safra;
		this.teorAlcoolico = teorAlcoolico;
	}
		
		
		public int getSafra() {
			return safra;
		}

		public void setSafra(int safra) {
			this.safra = safra;
		}

		public double getTeorAlcoolico() {
			return teorAlcoolico;
		}

		public void setTeorAlcoolico(double teorAlcoolico) {
			this.teorAlcoolico = teorAlcoolico;
		}

		public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Safra: " + safra);
		System.out.println("Teor Alcoólico: " + teorAlcoolico + "%");		
		
	}
	

}
