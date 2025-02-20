package projetoJava;

import java.io.IOException;
import java.util.Scanner;

import projetoJava.model.Acessorio;
import projetoJava.model.Vinho;
import projetoJava.produto.controller.ProdutoController;
import projetoJava.util.Cores;

public class Menu {
	
	public static void main(String[] args) {
		
		ProdutoController produtos = new ProdutoController();		
		
		
		Scanner scan = new Scanner(System.in);		
		
		int perfil;
		// Cor menu
		
		do {
			System.out.println(
					          "*********************************************************************");
			System.out.println("                                                                     ");
			System.out.println("                      VINO & Co.                                     ");
			System.out.println("                                                                     ");
			System.out.println("*********************************************************************");		                                                             
			System.out.println("1- Administrador                                                     ");
			System.out.println("2- Cliente                                                           ");
			System.out.println("3- Sair                                                              ");
			System.out.println("                                                                     ");
			System.out.println("*********************************************************************");
			System.out.println("Escolha seu perfil de acesso:                                        ");
			
			perfil = scan.nextInt();
			scan.nextLine();
			
			switch(perfil) {
			case 1:
				menuAdministrador(scan, produtos);
				break;
				
			case 2:
				menuCliente(scan);
				break;
				
			}			
			
			
		}while(perfil != 3);
	}
	
	
		public static void menuAdministrador(Scanner scan, ProdutoController produtos) {
					
		int opcao, estoque, id, tipo, safra;
		String nome, descricao, tipoMaterial;
		double teorAlcoolico;
		float preco;

		while(true) {
			System.out.println(
			                 "*********************************************************************");
			System.out.println("                  Gerenciar Produtos                                 ");
			System.out.println("*********************************************************************");
			System.out.println("                                                                     ");
			System.out.println("                      VINO & Co.                                     ");
			System.out.println("                                                                     ");
			System.out.println("*********************************************************************");
			System.out.println("                                                                     ");
			System.out.println("                1 - Cadastrar Produto                                ");
			System.out.println("                2 - Listar Produto                                   ");
			System.out.println("                3 - Buscar produto por Nome                          ");
			System.out.println("                4 - Atualizar Produtos                               ");
			System.out.println("                5 - Apagar Produto                                   ");
			System.out.println("                6 - Sair                                             ");
			System.out.println("                                                                     ");
			System.out.println("*********************************************************************");
			System.out.println("Entre com a opção desejada:                                          ");
			System.out.println("                                                                     ");
	
		
		opcao = scan.nextInt();
		
		if(opcao == 6) {
			System.out.println("Vino & Co.                                                           ");
			System.out.println("Até o próximo acesso!                                                ");
			sobre();
			scan.close();
			System.exit(0);
		}
		
		switch(opcao) {
		case 1:
			System.out.println("Cadastrar Produto\n\n");					
								
			do {
				System.out.println("Digite o tipo do Produto (1-Vinho ou 2- Acessório: )");
				tipo = scan.nextInt();			
			} while(tipo < 1 || tipo > 2);
			
		switch(tipo) {
		
		case 1 -> {
			System.out.println("Vinhos");
			System.out.println("************************************************");
			System.out.println("Digite o nome do Vinho: ");
			scan.nextLine();
			nome = scan.nextLine();
			
			
			System.out.println("Digite a descrição do Produto: ");
			descricao = scan.nextLine();			
			
			System.out.println("Digite o Preço: ");
			preco = scan.nextFloat();
			
			System.out.println("Digite o estoque do produto: ");
			estoque = scan.nextInt();
								
			System.out.println("Digite a safra do vinho: ");
			safra = scan.nextInt();
			
			System.out.println("Digite o teor alcoolico: ");
			teorAlcoolico = scan.nextDouble();
			
			produtos.cadastrar((new Vinho(produtos.gerarId(), nome, descricao, preco, estoque, safra, teorAlcoolico)));
					
		}
		
		case 2 -> {
			System.out.println("Acessórios");
			System.out.println("************************************************");
			System.out.println("Digite o nome do Produto: ");
			scan.nextLine();
			nome = scan.nextLine();	
		
			
			System.out.println("Digite a descrição do Produto: ");
			descricao = scan.nextLine();
					
			System.out.println("Digite o Preço: ");
			preco = scan.nextFloat();
			
			System.out.println("Digite o estoque do produto: ");
			estoque = scan.nextInt();
								
			System.out.println("Digite o tipo de material: ");
			scan.nextLine();
			tipoMaterial = scan.nextLine();		
			
			
			produtos.cadastrar((new Acessorio(produtos.gerarId(), nome, descricao, preco, estoque, tipoMaterial)));
			
			}
		}
			keyPress();			
			break;
				
		case 2:
			System.out.println("Listar Produto\n\n");
			produtos.listarProdutos();
			keyPress();
			break;
			
		case 3: 
			System.out.println("Buscar produto por Id\n\n");
			System.out.println("Digite o id do produto: ");
			id = scan.nextInt();
			
			produtos.procurarPorID(id);	
			keyPress();
			break;
			
		case 4:					
			System.out.println("Atualizar dados do Produto\n\n");
			System.out.println("Digite o id do Produto: ");
			id = scan.nextInt();
			scan.nextLine();
			
			var buscaId = produtos.buscarNaCollection(id);
			
			if(buscaId != null) {
				
				if(buscaId instanceof Vinho ) {						
			
				System.out.println("Digite o nome do Vinho: ");
				scan.nextLine();
				nome = scan.nextLine();
				
				
				System.out.println("Digite a descrição do Produto: ");
				descricao = scan.nextLine();			
				
				System.out.println("Digite o Preço: ");
				preco = scan.nextFloat();
				scan.nextLine();
				
				System.out.println("Digite o estoque do produto: ");
				estoque = scan.nextInt();
				scan.nextLine();
									
				System.out.println("Digite a safra do vinho: ");
				safra = scan.nextInt();
				scan.nextLine();
				
				System.out.println("Digite o teor alcoolico: ");
				teorAlcoolico = scan.nextDouble();
				scan.nextLine();
				
				produtos.atualizar(new Vinho(id, nome, descricao, preco, estoque, safra, teorAlcoolico));
				
							
				}else if(buscaId instanceof Acessorio) {
					System.out.println("Acessórios");
					System.out.println("Digite o nome do Produto: ");
					nome = scan.nextLine();
										
					System.out.println("Digite a descrição do Produto: ");
					descricao = scan.nextLine();
							
					System.out.println("Digite o Preço: ");
					preco = scan.nextFloat();
					scan.nextLine();
					
					System.out.println("Digite o estoque do produto: ");
					estoque = scan.nextInt();
					scan.nextLine();
										
					System.out.println("Digite o tipo de material: ");
					tipoMaterial = scan.nextLine();	
					scan.nextLine();
					
					produtos.atualizar(new Acessorio(id, nome, descricao, preco, estoque, tipoMaterial));
					
					} else {
						System.out.println("Id não foi encontrado!");			
				
					}
			}
			keyPress();
			break;		
		
		case 5: 
			System.out.println("Apagar Produto\n\n");
			System.out.println("Digite o id do produto: ");
			id = scan.nextInt();
			
			produtos.deletar(id);
			keyPress();
			break;
			
		default:
			System.out.println("\nOpção inválida!\n");
		}
		
	}
		}
			
		public static void menuCliente(Scanner scan) {
			
			int opcao;
			
			do {
				System.out.println("*********************************************************************");
				System.out.println("                                                                     ");
				System.out.println("                      VINO & Co.                                     ");
				System.out.println("                                Bem vindo!                           ");
				System.out.println("*********************************************************************");		   
				System.out.println("1- Ver Catálogo de Produtos                                          ");
				System.out.println("2- Fazer Pedido                                                      ");
				System.out.println("3- Consultar meus pedidos                                            ");
				System.out.println("4- Sair                                                              ");
				System.out.println("*********************************************************************");		   
				System.out.println("Escolha uma opção:                                                   ");
				
				opcao = scan.nextInt();
				
				if(opcao == 4) {
					
					System.out.println("*********************************************************************");    
					System.out.println("VINO & CO Vinhos com praticidade! Saúde!                             ");
					sobre();
					scan.close();
					System.exit(0);
				}
				
				switch(opcao) {
				case 1:
					System.out.println("Exibindo Catálogo: ");
					keyPress();
					break;
					
				case 2: 
					System.out.println("Criando Pedido...");
					keyPress();
					break;
					
				case 3:
					System.out.println("Listando pedidos...");
					keyPress();
					break;
					
				case 4:
					System.out.println("Sair");
					break;
					
					default:
						System.out.println("Opção inválida");
				}				
					
				}while(opcao != 4);				
		
	
		
	}
	public static void sobre() {
		System.out.println("*********************************************************************");
		System.out.println("Projeto Desenvolvido por: Alexania Toma                              ");
		System.out.println("Generation Brasil - generation@generation.org                        ");
		System.out.println("github.com/conteudoGeneration                                        ");
		System.out.println("*********************************************************************");
	}
	
	public static void keyPress() {
		try {
			System.out.println("\nPressione Enter para Continuar...");
			System.in.read();
		}catch(IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}
	
 }
	

	

