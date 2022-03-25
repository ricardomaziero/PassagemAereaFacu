package passagensAereas;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			String resposta1;
			int resposta2;
			String nome;
			int idade;
			double carteira;

			
			inicio:
			while (true) {

				System.out.println("BEM VINDO\n\n----->PROMOÇÕES DE PASSAGENS<-----\n\nDeseja comprar passagem?"
						+ "\n s = sim, n = não ");
				resposta1 = scan.next();

				if (resposta1.toUpperCase().equals("S")) {
					System.out.println("\nDigite o seu nome");
					nome = scan.next();

					System.out.println("\nDigite sua idade");
					idade = scan.nextInt();

					System.out.println("\nDigite o valor em carteira");
					carteira = scan.nextDouble();

					Cliente c1 = new Cliente(nome, idade, carteira);

					System.out.println("\nNome: " + c1.getNome() + 
							"\nIdade: " + c1.getIdade() + " anos" +
							"\nCarteira: " + c1.getCarteira());
					
					if (c1.getIdade() < 18) {
						System.out.println("\nIdade não permitida para compra de passagem\n");
						continue inicio;
					}
					
					System.out.println("\n\nSelecione o destino\n\n1- São Paulo\n2- Rio de Jaineiro\n"
							+ "3- Florianópolis\n4- Finalizar");
					resposta2 = scan.nextInt();
					
					if (resposta2 == 1) {
						Passagem p1 = new Passagem();
						p1.passagemSP();
						
						if (c1.getCarteira() < p1.Valor) {
							System.out.println("\nValor em carteira insuficiente!!!");
							continue inicio;
						}
						else {
							double valorFinal;
							valorFinal = c1.getCarteira() - p1.Valor;
							c1.setCarteira(valorFinal);
							System.out.println("\n\nCompra efetuada com sucesso\n");
							System.out.println("DADOS DA COMPRA\n__________________");
							System.out.println(
									"\nCliente: " + c1.getNome() +
									"\nIdade: " + c1.getIdade() + " anos" +
									"\nSaldo em carteira: " + c1.getCarteira() +
									"\nDestino: " + p1.Destino +
									"\n\nBOA VIAGEM E VOLTE SEMPRE\n\n"
									);
							break;
						}
					}
					else if (resposta2 == 2) {
						Passagem p1 = new Passagem();
						p1.passagemRJ();
						
						if (c1.getCarteira() < p1.Valor) {
							System.out.println("Valor em carteira insuficiente!!!\n");
							continue inicio;
						}
						else {
							double valorFinal;
							valorFinal = c1.getCarteira() - p1.Valor;
							c1.setCarteira(valorFinal);
							System.out.println("\n\nCompra efetuada com sucesso\n");
							System.out.println("DADOS DA COMPRA\n__________________");
							System.out.println(
									"\nCliente: " + c1.getNome() +
									"\nIdade: " + c1.getIdade() + " anos" +
									"\nSaldo em carteira: " + c1.getCarteira() +
									"\nDestino: " + p1.Destino +
									"\n\nBOA VIAGEM E VOLTE SEMPRE\n\n"
									);
							break;
						}
					}
					else if (resposta2 == 3) {
						Passagem p1 = new Passagem();
						p1.passagemSC();
						
						if (c1.getCarteira() < p1.Valor) {
							System.out.println("Valor em carteira insuficiente!!!\n");
							continue inicio;
						}
						else {
							double valorFinal;
							valorFinal = c1.getCarteira() - p1.Valor;
							c1.setCarteira(valorFinal);
							System.out.println("\n\nCompra efetuada com sucesso\n");
							System.out.println("DADOS DA COMPRA\n__________________");
							System.out.println(
									"\nCliente: " + c1.getNome() +
									"\nIdade: " + c1.getIdade() + " anos" +
									"\nSaldo em carteira: " + c1.getCarteira() +
									"\nDestino: " + p1.Destino +
									"\n\nBOA VIAGEM E VOLTE SEMPRE\n\n"
									);
							break;
						}
					} 
					else break;
				}
			}
		}

	}

}
