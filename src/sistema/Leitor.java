package sistema;

import java.io.File;
import java.io.FileNotFoundException;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Leitor {

	public static void leitores(File Cooler, File Fonte, File Funcionarios, File Gabinetes, File HD, File Headset,
			File Ram, File Monitor, File Mouse, File PlacaVideo, File PlacaM, File Processador, File Ssd, File Teclado) throws FileNotFoundException, SQLException {
		Scanner leitor = new Scanner (System.in);
		//dbCooler(Cooler); 
		//dbFonte( Fonte);
		//dbFuncionario (Funcionarios);
		//dbGabinete (Gabinetes);
		//dbHD(HD);
		//dbHeadset (Headset);
		//dbRam(Ram);
		//dbMonitor (Monitor);
		//dbMouse (Mouse);
		//dbPlacaVideo (PlacaVideo);
		//dbPlacaM (PlacaM);
		//dbProcessador (Processador);
		//dbSsd (Ssd);
		//dbTeclado (Teclado);
		 leitor.close();
	}

	//REALIZAR ALTERAÇÃO NO CAMPO FILE, SCANNER
	
	//private static void dbTeclado(File Teclado) throws SQLException, FileNotFoundException {
	///	Scanner leitorT = new Scanner(Teclado);
		//leitorT.nextLine();
		//String url = "jdbc:sqlite:C:\\Users\\Pc\\Desktop\\Trabalhos UP\\JAVA\\db\\loja.db";
		
		//Connection conexao = DriverManager.getConnection(url);
	
		//String sql = "insert into produto (idProduto, preco, descricao, quantidade) values (?, ?, ?, ?);";
		//PreparedStatement executor = conexao.prepareStatement(sql);
		
		//while (leitorT.hasNext()) {
		
		//	String line = leitorT.nextLine();
		//	String partes[] = line.split(";");
		//	String precostr = partes[0];
		//	String descri = partes[1];
		//	String quantstr = partes [2];
		//	double preco = Double.parseDouble(precostr);
		//	int quanti = Integer.parseInt(quantstr);


			//Query e executor
			//
			//executor.setDouble(2, preco);
			//executor.setString(3, descri);
			//executor.setInt(4 , quanti);
		//
		//	executor.executeUpdate();
		

		//}
		//leitorT.close();
		//executor.close();
		//conexao.close();
	//}
	


	
}
