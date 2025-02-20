package projetoJava;

import java.util.Scanner;

import projetoJava.util.Cores;

public class Menu {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		
		int perfil;
		
		do {
			System.out.println(Cores.ANSI_BLACK_BACKGROUND_BRIGHT + Cores.TEXT_PURPLE_BOLD +
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
				menuAdministrador(scan);
				break;
				
			case 2:
				menuCliente(scan);
				break;
				
			}			
			
			
		}while(perfil != 3);
	}
		
		private static void menuAdministrador(Scanner scan) {
		
		int opcao;

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
			
			break;
				
		case 2:
			System.out.println("Listar Produto\n\n");
			break;
			
		case 3: 
			System.out.println("Buscar produto por Nome\n\n");
			break;
			
		case 4:
			System.out.println("Atualizar Produtos\n\n");
			break;
		
		case 5: 
			System.out.println("Apagar Produto\n\n");
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
					break;
					
				case 2: 
					System.out.println("Criando Pedido...");
					break;
					
				case 3:
					System.out.println("Listando pedidos...");
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
	
}
