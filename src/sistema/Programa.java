package sistema;


import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Programa {

	public static void main (String[] agrs) throws SQLException, IOException {
		
	
		Scanner leitor = new Scanner(System.in);
		System.out.println("____________________________________________________________________________________________");
		System.out.println("                                   MENU DE NAVEGAÇÃO                     ");
		System.out.println();
		System.out.println("         | (1) Área do Cliente |        | (2) Área do Gerenciador |	| (3)Fechar Programa |  ");
		int guia = leitor.nextInt();
		
		if (guia == 1) {
			Cliente.AreaCliente();
		}
		else if (guia == 2) {
			Gerenciador.AreaGerenciador();
		}
		else if (guia == 3) {
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
			System.out.println("Erro - Desculpe a sua escolha não se encontra em nosso sistema.");
			guia =leitor.nextInt();
		}
		
		leitor.close();
		
		
	}
}

	
