package sistema;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import DAO.ClienteDAO;
import DAO.PedidoDAO;
import DAO.ProdutosDAO;
import model.ClienteModel;
import model.PedidoModel;
import model.ProdutoModel;

public class ClienteCRUD {

	
	public static void incluirCliente() throws IOException {
		Scanner leitor = new Scanner(System.in);
		
		ClienteDAO  objetoDao = new ClienteDAO(); 
		
		//System.out.println("Digite um ID (sem pontos): ");
		//int ID = leitor.nextInt();;
		System.out.println("Digite  os 3 primeiros digitos de seu CPF (sem pontos): ");
		int CPF = leitor.nextInt();
		leitor.nextLine();
		System.out.println("Digite seu Nome: ");
		String nome = leitor.nextLine();
		leitor.nextLine();
		System.out.println("Digite sua Rua: ");
		String rua = leitor.nextLine();
		leitor.nextLine();
		System.out.println("Digite seu Bairro: ");
		String bairro = leitor.nextLine();
		leitor.nextLine();
		System.out.println("Digite sua Cidade: ");
		String cidade = leitor.nextLine();
		leitor.nextLine();
	
		
		ClienteModel cliente = new ClienteModel( CPF, nome, rua, bairro, cidade);
		
		objetoDao.salvar(cliente);
		
		System.out.println();
		System.out.println("Fazer outro cadastro?");
		boolean cadastro = leitor.nextBoolean();
		
		if (cadastro == true) {
			incluirCliente();
		}
		else {
			Cliente.AreaCliente();
		}
		
		leitor.close();
}
	
	
	
	public static void incluirCompra() throws IOException {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println();
		System.out.println("Já é cadastrado?");
		boolean compra = leitor.nextBoolean();
		if ( compra == false ) {
			try {
				incluirCliente();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
		System.out.println();
		PedidoDAO objetoDAO = new PedidoDAO();
		ProdutosDAO  objetoDao = new ProdutosDAO();
		ClienteDAO clienteDAO = new ClienteDAO();
		List<ProdutoModel> lista = objetoDao.listar();
		
		for (ProdutoModel p : lista) {
			System.out.println("ID: " + p.getIdProduto() + "|  Nome: " + p.getDescricao() + "  PREÇO  R$" + p.getPreco());
			System.out.println();
			
		}
				
		
		System.out.println();
		System.out.println("Informe seu CPF: ");
		int CPF = leitor.nextInt();
		List<ClienteModel> cliente = clienteDAO.buscarPorCPF(CPF);
		System.out.println();
		for (ClienteModel c : cliente) {
		System.out.println("Olá  " + c.getNome());
		}
		System.out.println("Escolha o item que deseja(somente 1 item);");
		int item = leitor.nextInt();
		System.out.println("Escolha a quantidade que deseja desse produto:");
		int quant = leitor.nextInt();
		LocalDate myObj = LocalDate.now();
		PedidoModel pedido = new PedidoModel (CPF, quant, item, myObj);
		
		objetoDAO.salvar(pedido);
		
		System.out.println("Fazer outro pedido?");
		boolean cadastro = leitor.nextBoolean();
		
		if (cadastro == true) {
			incluirCompra();
		}
		else {
			Cliente.AreaCliente();
		}
		leitor.close();
	}

}

	public static void listaItem() throws IOException {
		Scanner leitor = new Scanner (System.in);
		ProdutosDAO  objetoDao = new ProdutosDAO();
		List<ProdutoModel> lista = objetoDao.listar();
		for (ProdutoModel p : lista) {
			System.out.println("ID: " + p.getIdProduto() + "|  Nome: " + p.getDescricao() + "  PREÇO  R$" + p.getPreco());
			System.out.println();
			
		}
		System.out.println();
		System.out.println("Deseja votlar área do cliente?");
		boolean cadastro = leitor.nextBoolean();
		
		if (cadastro == true) {
			Cliente.AreaCliente();
		}
		else {
			LocalDateTime datahora = LocalDateTime.now();
		    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		    String dataformatada = datahora.format(myFormatObj);
			System.out.println();
			System.out.println();
			System.out.println("|Desligando programa    " + dataformatada + " |");
			System.out.println();
			System.out.println("FIM DO PROGRAMA        ");
		}
		leitor.close();
	}



	public static void deletarPedido() throws IOException {
		Scanner leitor = new Scanner(System.in);
		
		PedidoDAO  objetoDao = new PedidoDAO();
		//L

		System.out.println();
		System.out.println("Caso deseja cancelar sua compra informe seu CPF:");
		int id = leitor.nextInt();
		List<PedidoModel> lista =	objetoDao.buscarPorCPF(id);
		PedidoDAO objetoDAO = new PedidoDAO();
		for (PedidoModel p : lista) {
			
			System.out.println(" Identficador da compra: " + p.getIdPedido() + "  CPF: " + p.getCPF() + "|  Quantidad: " + p.getQuantItens() + "  identificador do Produto  " + p.getIdProduto());
			System.out.println();
		
	}
		System.out.println("Informe o numero do identificador que deseja cancelar");
		int ident = leitor.nextInt();
		objetoDAO.apagar(ident);
		
		System.out.println("Fazer excluir outro pedido?");
		boolean cadastro = leitor.nextBoolean();
		
		if (cadastro == true) {
			deletarPedido();
		}
		else {
			Cliente.AreaCliente();
		}
		leitor.close();
	}



	public static void imprimir() throws IOException {
		Scanner leitor = new Scanner(System.in);
		
		PedidoDAO  objetoDao = new PedidoDAO();
		ClienteDAO clienteDao = new ClienteDAO();
		System.out.println();

		System.out.println();
		System.out.println("Informe seu CPF:");
		int id = leitor.nextInt();
		leitor.nextLine();
		FileWriter arquivo = new FileWriter("C:\\Users\\Pc\\Desktop\\Trabalhos UP\\JAVA\\Computacional\\Compras Cliente\\Compra " + id + ".txt");
		PrintWriter  gravador = new PrintWriter (arquivo);
		List<ClienteModel> cliente = clienteDao.buscarPorCPF(id);
		List<PedidoModel> lista =	objetoDao.buscarPorCPF(id);
		for (ClienteModel c : cliente) {
		for (PedidoModel p : lista ) {
			gravador.println("Nome:  " + c.getNome() + " Identficador da compra: " + p.getIdPedido() + "  CPF: " + p.getCPF() + "|  Quantidad: " + p.getQuantItens() + "  identificador do Produto  " + p.getIdProduto());
			gravador.println();
			}
		}
		leitor.close();
		gravador.close();
		 System.out.println();
		 System.out.println("Gravado com sucesso ");
		Cliente.AreaCliente();
	}


	
	
}
