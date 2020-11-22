package sistema;


import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;




public class Cliente {
 
	public static void AreaCliente() throws IOException {
		Scanner leitor = new Scanner(System.in);
	System.out.println();
	System.out.println("____________________________________________________________________________________________");
	System.out.println("                                    Área do Cliente                       ");
	System.out.println("____________________________________________________________________________________________");
	System.out.println();
	System.out.println("                                         Olá                   ");
	System.out.println();
	System.out.println("                                Essa é a área do cliente                  ");
	System.out.println();
	System.out.println("                        Por favor, informe qual ação deseja realizar                   ");
	System.out.println();
	System.out.println("|(1) Fazer cadastro|     |(2) Realizar uma compra|    |(3) Visualizar lista de itens a venda|    ");
	System.out.println();
	System.out.println("|(4) Cancelar pedido			(5) Imprimir seu pedido        (6) Fechar Programa |   ");
	int respCliente = leitor.nextInt();
	
	
	escolhaCliente(respCliente);
	leitor.close();
		

	}

	private static void escolhaCliente(int respCliente) throws IOException {
		Scanner leitor = new Scanner(System.in);
		if (respCliente== 1) {
			Entradas.incluirC();
		}
		else if (respCliente == 2) {
			Entradas.incluirCompra();
			
		}
		else if (respCliente == 3) {
			Entradas.listaItem();
		}
		else if (respCliente == 4) {
			Entradas.deletarPedido();
			
		}
		else if (respCliente == 5) {
			Entradas.imprimirPed();
		}
		else if (respCliente == 6) {
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
			System.out.println("Erro -  A ação solicitada não se encontra em nosso sistema. Por favor escolha novamente");
			respCliente = leitor.nextInt();
			escolhaCliente(respCliente);
		}
		
		leitor.close();
	}

}
