package sistema;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

import DAO.FuncionariosDAO;
import DAO.PedidoDAO;
import DAO.ProdutosDAO;
import model.FuncionariosModel;
import model.PedidoModel;
import model.ProdutoModel;

public class GerenciaCRUD {

	public static void lista() throws IOException {
		
		Scanner leitor = new Scanner(System.in);
		ProdutosDAO  objetoDao = new ProdutosDAO();
		List<ProdutoModel> lista = objetoDao.listar();
		
		for (ProdutoModel p : lista) {
			System.out.println("ID " + p.getIdProduto() + "  Nome:" + p.getDescricao() + "  PREÇO  R$" + p.getPreco());
		}
		
		System.out.println();
		System.out.println("Deseja incluir, excluir ou atualizar algum item?");
		System.out.println();
		System.out.println("(1)incluir     (2) excluir     (3) atualizar  ");
		int resp = leitor.nextInt();
		
		if (resp == 1) {
			incluir();
		}
		else if ( resp == 2) {
			delete();
		}
		else if ( resp == 3) {
			update();
		}
		else {
			Gerenciador.AreaGerenciador();
		}
		leitor.close();
	}

	public static void incluir() {
		
		Scanner leitor = new Scanner(System.in);
		
		ProdutosDAO  objetoDao = new ProdutosDAO(); 
		
		System.out.println("Digite a quantidade: ");
		int quant = leitor.nextInt();
		leitor.nextLine();
		System.out.println("Digite o nome que deseja incluir: ");
		String descricao = leitor.nextLine();
		leitor.nextLine();
		System.out.println();
		System.out.println("Digite seu valor: ");
		double valor = leitor.nextDouble();
		leitor.nextLine();
	
	
		

		
		ProdutoModel produto = new ProdutoModel(valor,descricao,quant);
		
		objetoDao.salvar(produto);
		
		List<ProdutoModel> lista = objetoDao.listar();
		
		for (ProdutoModel p : lista) {
			System.out.println("ID: " + p.getIdProduto() + "|  Nome: " + p.getDescricao() + "  PREÇO  R$" + p.getPreco());
			System.out.println();
			
		}
		System.out.println();
		System.out.println();
		System.out.println("Deseja incluri mais algum produto ao banco de dados?");
		boolean resp = leitor.nextBoolean();
		
		if (resp == true) {
			incluir();
		}
		else {
			try {
				Gerenciador.AreaGerenciador();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		leitor.close();
	}

	public static void delete() {
		Scanner leitor = new Scanner(System.in);
		
		ProdutosDAO  objetoDao = new ProdutosDAO(); 
		
		System.out.println("Digite o Id do item que deseja apagar: ");
		int Id = leitor.nextInt();
		
		objetoDao.apagar(Id);
		
		System.out.println();
		System.out.println("Deseja excluir mais algum item do banco de dados?");
		boolean resp = leitor.nextBoolean();
		
		if (resp == true) {
			delete();
		}
		else {
			try {
				Gerenciador.AreaGerenciador();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		leitor.close();
		
	}

	public static void update() throws IOException {
		Scanner leitor = new Scanner(System.in);
		
		ProdutosDAO  objetoDao = new ProdutosDAO(); 
		
		System.out.println();
		System.out.println("Insira o Id que deseja atualizar: ");
		int Id = leitor.nextInt();
		leitor.nextLine();
		System.out.println("Insira novo nome: ");
		String nome = leitor.nextLine();
		leitor.nextLine();
		System.out.println("Insira o novo valor: ");
		double valor = leitor.nextDouble();
		leitor.nextLine();
		System.out.println("Insira a quantidade do produto: ");
		int quant = leitor.nextInt();
		leitor.nextLine();
		
		ProdutoModel produto = new ProdutoModel (Id, valor, nome, quant);
		objetoDao.atualizar(produto);
		
		List<ProdutoModel> lista = objetoDao.listar();
		
		for (ProdutoModel p : lista) {
			System.out.println("ID: " + p.getIdProduto() + "|  Nome: " + p.getDescricao() + "  PREÇO  R$" + p.getPreco());
			System.out.println();
			
		}
		System.out.println();
		System.out.println();
		System.out.println("Deseja atualizar mais algum item ao banco de dados?");
		boolean resp = leitor.nextBoolean();
		
		if (resp == true) {
			update();
		}
		else {
			Gerenciador.AreaGerenciador();
		}
		
		leitor.close();
	}

	public static void ListaFunc() throws IOException {
		Scanner leitor = new Scanner (System.in);
		FuncionariosDAO  objetoDao = new FuncionariosDAO();
		List<FuncionariosModel> lista = objetoDao.listar();
		
		for (FuncionariosModel f : lista) {
			System.out.println("ID" + f.getIdFunc() + "Nome:" + f.getNome());
		}
		System.out.println();
		System.out.println(" Deseja incluir, exonerar ou atualizar algum funcionário?");
		System.out.println("(1)incluir     (2) exonerar     (3) atualizar  ");
		int func = leitor.nextInt();
		
		if (func == 1 ) {
				Entradas.incluirFunc();
		}
		else if (func == 2) {
				Entradas.deleteFunc();
		}
		else if (func == 3) {
				Entradas.updateFunc();
		}
		else {
			Gerenciador.AreaGerenciador();
		}
		leitor.close();
	}

	public static void IncluirFunc() {
		FuncionariosDAO  objetoDao = new FuncionariosDAO();
				
		Scanner leitor = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Digite o nome do colaborador que deseja incluir: ");
		String nome = leitor.nextLine();
		leitor.nextLine();
		System.out.println();
		System.out.println("Digite o cargo o qual será designado: ");
		String cargo = leitor.nextLine();
		leitor.nextLine();
		System.out.println("Digite o salário do funcionário: ");
		double salario = leitor.nextDouble();
		
		FuncionariosModel funcionario = new FuncionariosModel( nome, cargo, salario);
		
		objetoDao.salvar(funcionario);
		
		System.out.println();
		List<FuncionariosModel> lista = objetoDao.listar();
		
		for (FuncionariosModel f : lista) {
			System.out.println("ID  " + f.getIdFunc() + "Nome:  " + f.getNome());
		}
		
		
		System.out.println();
		System.out.println("Deseja incluir mais algum funcionario no banco de dados?");
		boolean resp = leitor.nextBoolean();
		
		if (resp == true) {
			IncluirFunc();
		}
		else {
			try {
				Gerenciador.AreaGerenciador();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		leitor.close();
		
	}

	public static void DeleteFunc() throws IOException {
		
		FuncionariosDAO  objetoDao = new FuncionariosDAO();
		List<FuncionariosModel> lista = objetoDao.listar();
		
		for (FuncionariosModel f : lista) {
			System.out.println("ID" + f.getIdFunc() + "Nome:" + f.getNome());
		}
		

		Scanner leitor = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Digite o Id do funcionário que não se encontra mais ativo: ");
		int Id = leitor.nextInt();
		
		objetoDao.apagar(Id);
		
		System.out.println();
		System.out.println("Deseja excluir mais algum funcionario do banco de dados?");
		boolean resp = leitor.nextBoolean();
		
		if (resp == true) {
			DeleteFunc();
		}
		else {
			Gerenciador.AreaGerenciador();
		}
		
		leitor.close();
		
	}

	public static void updateFunc() throws IOException {
		FuncionariosDAO  objetoDao = new FuncionariosDAO(); 
		List<FuncionariosModel> lista = objetoDao.listar();
		
		for (FuncionariosModel f : lista) {
			System.out.println("ID: " + f.getIdFunc() + "		Nome: " + f.getNome() + " 		Salario: " + f.getSalario()+ "		Cargo: 	" + f.getCargo());
		}
		

		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Insira o Id que deseja atualizar: ");
		int Id = leitor.nextInt();
		leitor.nextLine();
		System.out.println("Insira o nome atualizado: ");
		String nome = leitor.nextLine();
		leitor.nextLine();
		System.out.println("Insira seu cargo atualizado: ");
		String cargo= leitor.nextLine();
		leitor.nextLine();
		System.out.println("Insira seu salario atualizado: ");
		double salario = leitor.nextDouble();
		
		FuncionariosModel funcionario = new FuncionariosModel (Id, nome, cargo, salario);
		objetoDao.atualizar(funcionario);
		
		
		System.out.println();
		System.out.println("Deseja atualizar mais algum cadastro no banco de dados?");
		boolean resp = leitor.nextBoolean();
		
		if (resp == true) {
			updateFunc();
		}
		else {
			Gerenciador.AreaGerenciador();
		}
		
		leitor.close();
		
	}

	public static void Imprimir() throws IOException { 
		Scanner leitor = new Scanner (System.in);
		PedidoDAO  objetoDao = new PedidoDAO();
		List<PedidoModel> lista = objetoDao.listar();
		for (PedidoModel p : lista) {
			System.out.println(" Identficador da compra: " + p.getIdPedido() + "  CPF: " + p.getCPF() 
			+ "|  Quantidade: " + p.getQuantItens() + "  identificador do Produto  " + p.getIdProduto() + "     Data: " + p.getData());
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Confirmar Impressão?");
		boolean imprimir = leitor.nextBoolean();
		
		if (imprimir == true) {
			FileWriter arquivo = new FileWriter("C:\\Users\\Pc\\Desktop\\Trabalhos UP\\JAVA\\Computacional\\Controle de pedidos\\Relatorio de pedidos.txt");
			PrintWriter  gravador = new PrintWriter (arquivo);
			
			PedidoDAO  objetoD = new PedidoDAO();
			List<PedidoModel> relatorio = objetoD.listar();
			for (PedidoModel p : relatorio) {
				gravador.println(" Identficador da compra: " + p.getIdPedido() + "  CPF: " + p.getCPF() 
				+ "|  Quantidade: " + p.getQuantItens() + "  identificador do Produto  " + p.getIdProduto() + "     Data: " + p.getData());
				gravador.println();
			}
			System.out.println();
			System.out.println("Impressão concluída");
			gravador.close();
			Gerenciador.AreaGerenciador();
		}
		else {
			Gerenciador.AreaGerenciador();
		}
		
		leitor.close(); 
	


	}
	
}
