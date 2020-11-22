package sistema;


import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;



public class Gerenciador {

	public static void AreaGerenciador() throws IOException {
		Scanner leitor = new Scanner(System.in);
	System.out.println();
	System.out.println("____________________________________________________________________________________________");
	System.out.println("                                    Área do Gerenciador                       ");
	System.out.println("____________________________________________________________________________________________");
	System.out.println();
	System.out.println(" |(1) Atualizar itens|   |(2) Excluir itens|  |(3) Incluir itens|    |(4) Visualizar listas|");
	System.out.println();
	System.out.println(" |(5) Visualizar funcionários |	   |(6) Novo funcionário |    |(7) Exonerar funcionário |");
	System.out.println();
	System.out.println(" |(8) Atualizar salários   | (9)Visualizar e imprimir pedidos |   |(10) Fechar Programa");
	int resp = leitor.nextInt();
	
	opcao(resp);
	leitor.close();
	}
 
	private static void opcao(int resp) throws IOException {
		Scanner leitor = new Scanner(System.in);
		if (resp == 1) {
			Entradas.updateItens();
			
		}
		else if (resp == 2) {
			Entradas.deleteItens();			
		}
		else if (resp == 3) {
			Entradas.incluirItens();
		}
		else if ( resp == 4) {
			Entradas.listaIten();
		}
		else if (resp == 5) {
			Entradas.listaFunc();
		}
		else if (resp == 6) {
			Entradas.incluirFunc();
			
		}
		else if (resp == 7) {
			Entradas.deleteFunc();
		
		}
		else if (resp == 8) {
			Entradas.updateFunc();
			
		}
		else if ( resp == 9 ) {
			Entradas.imprimirL();
		}
		else if (resp == 10) {
			LocalDateTime datahora = LocalDateTime.now();
		    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		    String dataformatada = datahora.format(myFormatObj);
			System.out.println();
			System.out.println();
			System.out.println("|Desligando programa    " + dataformatada + " |");
			System.out.println();
			System.out.println("FIM DO PROGRAMA        ");
		}
		else {
			System.out.println("Erro - O número de escolha não se encontra em nosso sistema. Por favor tente novamwente");
			resp = leitor.nextInt();
			opcao(resp);
		}
		leitor.close();
	}

}
