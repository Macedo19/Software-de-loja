package sistema;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;


public class Arquivo {

	public static void arquivo() throws FileNotFoundException, SQLException {
	
		
		File Cooler = new File("C:\\Users\\Pc\\Desktop\\Trabalhos UP\\JAVA\\PROJETO SISTEMA DE COMPUTADORES\\cooler.txt ");
		
		File Fonte = new File("C:\\Users\\Pc\\Desktop\\Trabalhos UP\\JAVA\\PROJETO SISTEMA DE COMPUTADORES\\fonte.txt ");
		
		File Funcionarios= new File("C:\\Users\\Pc\\Desktop\\Trabalhos UP\\JAVA\\PROJETO SISTEMA DE COMPUTADORES\\funcionarios.txt ");
		
		File Gabinetes = new File("C:\\Users\\Pc\\Desktop\\Trabalhos UP\\JAVA\\PROJETO SISTEMA DE COMPUTADORES\\gabinetes.txt ");

		File HD = new File("C:\\Users\\Pc\\Desktop\\Trabalhos UP\\JAVA\\PROJETO SISTEMA DE COMPUTADORES\\hard disck.txt ");

		File Headset = new File("C:\\Users\\Pc\\Desktop\\Trabalhos UP\\JAVA\\PROJETO SISTEMA DE COMPUTADORES\\headset.txt ");
	
		File Ram = new File("C:\\Users\\Pc\\Desktop\\Trabalhos UP\\JAVA\\PROJETO SISTEMA DE COMPUTADORES\\memoria ram.txt ");

		File Monitor = new File("C:\\Users\\Pc\\Desktop\\Trabalhos UP\\JAVA\\PROJETO SISTEMA DE COMPUTADORES\\monitor.txt ");

		File Mouse = new File("C:\\Users\\Pc\\Desktop\\Trabalhos UP\\JAVA\\PROJETO SISTEMA DE COMPUTADORES\\mouse.txt ");

		File PlacaVideo = new File("C:\\Users\\Pc\\Desktop\\Trabalhos UP\\JAVA\\PROJETO SISTEMA DE COMPUTADORES\\placa de video.txt ");

		File PlacaM = new File("C:\\Users\\Pc\\Desktop\\Trabalhos UP\\JAVA\\PROJETO SISTEMA DE COMPUTADORES\\placa mae.txt ");

		File Processador = new File("C:\\Users\\Pc\\Desktop\\Trabalhos UP\\JAVA\\PROJETO SISTEMA DE COMPUTADORES\\processador.txt ");

		File Ssd = new File("C:\\Users\\Pc\\Desktop\\Trabalhos UP\\JAVA\\PROJETO SISTEMA DE COMPUTADORES\\ssd.txt ");
		
		File Teclado = new File("C:\\Users\\Pc\\Desktop\\Trabalhos UP\\JAVA\\PROJETO SISTEMA DE COMPUTADORES\\teclado.txt ");

		
		Leitor.leitores (Cooler, Fonte, Funcionarios, Gabinetes, HD, Headset, Ram, Monitor, Mouse, PlacaVideo, PlacaM,
							Processador, Ssd, Teclado);
	}

}
