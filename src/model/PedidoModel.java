package model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;



@Entity
@Table(name = "pedido")
@TableGenerator(
 name = "gerador_de_id_pedido",
 table = "sqlite_sequence",
 pkColumnName = "name",
 valueColumnName = "seq",
 pkColumnValue = "pedido",
 initialValue =1,
 allocationSize =1
	)
public class PedidoModel {
	
		
	@Id
	@GeneratedValue( strategy = GenerationType.TABLE, generator = "gerador_de_id_pedido")
	private int idPedido;
	private int CPF;
	private int quantItens;
	private int idProduto;
	private LocalDate  data;
	
	public PedidoModel(){
		
	}
	
	public PedidoModel(int CPF, int quantItens,  int idProduto, LocalDate  data){
		super();
		this.CPF = CPF;
		this.quantItens = quantItens;
		this.idProduto = idProduto;
		this.data = data;
	}
	



	public PedidoModel(int idPedido ,int CPF, int quantItens,  int idProduto){
		super();
		this.idPedido = idPedido;
		this.CPF = CPF;
		this.quantItens = quantItens;
		this.idProduto = idProduto;
	}

	public PedidoModel(int CPF){
		super();
		this.CPF = CPF;

	}
	
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	public int getQuantItens() {
		return quantItens;
	}
	public void setQuantItens(int quantItens) {
		this.quantItens = quantItens;
	}

	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public LocalDate  getData() {
		return data;
	}

	public void setData(LocalDate  data) {
		this.data = data;
	}

}
