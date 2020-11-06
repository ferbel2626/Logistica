/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logistica;

import java.util.Scanner;

/**
 *
 * @author ff2604
 */
public class Logistica {

    private static final String CALCULAR_FROTA_NECESSARIA = "1 - Calcular Frota Necess\u00e1ria";
	private static final String CRIAR_REGIOES = "2 - Criar Regi\u00f5es";
	private static final String CALCULAR_FRETE = "3 - Calcular o Frete do Pedido ";
	private static final String EFETUAR_ENTREGA = "4 - Efetuar entrega ";
	private static final String ESCOLHA_UMA_OPCAO = "Escolha uma op\u00e7\u00e3o: ";
//	private static Mock mock;
	private static Scanner scanner;    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        CalcularFrete calcularFrete = new CalcularFrete();
//		Entrega_jomp entrega = new Entrega_jomp();
		int opcao = 0;
		boolean sair = false;
		scanner = new Scanner(System.in);
//		mock = new Mock();

		System.out.println(ESCOLHA_UMA_OPCAO);
		System.out.println(CALCULAR_FROTA_NECESSARIA);
		System.out.println(CRIAR_REGIOES);
		System.out.println(CALCULAR_FRETE);
		System.out.println(EFETUAR_ENTREGA);
		System.out.println("666 - Sair");

		while (!sair) {
			try {
				opcao = Integer.parseInt(scanner.next());
				switch (opcao) {
				case 1:
//					CalcularFrota();
                                        System.out.println("CalcularFrota()");
					break;
				case 2:
					System.out.println("\nQuantas regi\u00f5es voc\u00ea deseja criar?");
//					opcao = Integer.parseInt(scanner.next());
//					CriarRegioes(opcao);
                                        System.out.println("CriarRegioes(opcao)");
					break;
				case 3:
					System.out.println("\nQuantos pedidos voc\u00ea deseja criar?");
					int nPedido = Integer.parseInt(scanner.next());
					System.out.println("\nQuantos produtos tera cada pedido?");
					int nProduto = Integer.parseInt(scanner.next());
//					calcularFrete.execCalcularFrete(nPedido, nProduto);
                                        System.out.println("calcularFrete");
					break;
				case 4:
//					new OpcoesEntrada();
                                         System.out.println("OpcoesEntrada()");
					break;
				case 666:
					sair = true;
				default:
					break;
				}

				System.out.println("\n" + ESCOLHA_UMA_OPCAO);
				System.out.println(CALCULAR_FROTA_NECESSARIA);
				System.out.println(CRIAR_REGIOES);
				System.out.println(CALCULAR_FRETE);
				System.out.println(EFETUAR_ENTREGA);
				System.out.println("666 - Sair");

			} catch (NumberFormatException nfe) {
				System.out.println("\nOpcao invalida! Tente novamente." + nfe.getMessage());
			}
		}
    }
    
}
