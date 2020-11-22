package sistema;

import java.io.IOException;

public class Entradas {

	public static void updateItens() throws IOException {
		
		System.out.println();
		System.out.println("____________________________________________________________________________________________");
		System.out.println("==================================> Atualizar Itens <======================================= ");
		System.out.println("____________________________________________________________________________________________");
				
		GerenciaCRUD.update();
			}

	public static void deleteItens() {
		System.out.println();
		System.out.println("____________________________________________________________________________________________");
		System.out.println("==================================>  Deletar Itens  <======================================= ");
		System.out.println("____________________________________________________________________________________________");
		
		GerenciaCRUD.delete();
	}

	public static void incluirItens() {
		System.out.println();
		System.out.println("____________________________________________________________________________________________");
		System.out.println("================================>  Incluir novos Itens  <=================================== ");
		System.out.println("____________________________________________________________________________________________");
		
		GerenciaCRUD.incluir();
	}

	public static void listaIten() throws IOException {
		System.out.println();
		System.out.println("____________________________________________________________________________________________");
		System.out.println("==================================>  Lista de Itens  <====================================== ");
		System.out.println("____________________________________________________________________________________________");
		
		GerenciaCRUD.lista();
		
	}

	public static void listaFunc() throws IOException {
		System.out.println();
		System.out.println("____________________________________________________________________________________________");
		System.out.println("==================================>  Funcionários  <======================================== ");
		System.out.println("____________________________________________________________________________________________");
		
		GerenciaCRUD.ListaFunc();
		
	}

	public static void incluirFunc() {
		System.out.println();
		System.out.println("____________________________________________________________________________________________");
		System.out.println("================================>   Novo Funcionário   <==================================== ");
		System.out.println("____________________________________________________________________________________________");
		
		GerenciaCRUD.IncluirFunc();
		
	}

	public static void deleteFunc() throws IOException {
		System.out.println();
		System.out.println("____________________________________________________________________________________________");
		System.out.println("==================================>    Exonerar    <======================================== ");
		System.out.println("____________________________________________________________________________________________");
		
		GerenciaCRUD.DeleteFunc();
		
	}

	public static void updateFunc() throws IOException {
		System.out.println();
		System.out.println("____________________________________________________________________________________________");
		System.out.println("============================>  Atualização de Funcionário  <================================ ");
		System.out.println("____________________________________________________________________________________________");
		
		GerenciaCRUD.updateFunc();
		
	}

	public static void imprimirL() throws IOException {
		System.out.println();
		System.out.println("____________________________________________________________________________________________");
		System.out.println("==================================>  Área de impressão  <=================================== ");
		System.out.println("____________________________________________________________________________________________");
		
		GerenciaCRUD.Imprimir();
	}

	public static void incluirC() {
		System.out.println();
		System.out.println("____________________________________________________________________________________________");
		System.out.println("================================>   Cadastro   <============================================ ");
		System.out.println("____________________________________________________________________________________________");
		
		
		try {
			ClienteCRUD.incluirCliente();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void incluirCompra() throws IOException {
		System.out.println();
		System.out.println("____________________________________________________________________________________________");
		System.out.println("===================================>  Itens a venda <======================================= ");
		System.out.println("____________________________________________________________________________________________");
		
		ClienteCRUD.incluirCompra();
		
	}

	public static void listaItem() throws IOException {
		System.out.println();
		System.out.println("____________________________________________________________________________________________");
		System.out.println("========================================>   Itens  <======================================== ");
		System.out.println("____________________________________________________________________________________________");
		
		
		ClienteCRUD.listaItem();
		
	}

	public static void deletarPedido() throws IOException {
		System.out.println();
		System.out.println("____________________________________________________________________________________________");
		System.out.println("================================>  Cancelar Pedido  <=================================== ");
		System.out.println("____________________________________________________________________________________________");
		
		
		ClienteCRUD.deletarPedido();
		
	}

	public static void imprimirPed() throws IOException {
		System.out.println();
		System.out.println("____________________________________________________________________________________________");
		System.out.println("==================================>  Área de impressão  <=================================== ");
		System.out.println("____________________________________________________________________________________________");
		
		ClienteCRUD.imprimir();
		
	}

	


}


