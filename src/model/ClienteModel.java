package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;


@Entity
@Table(name = "cliente" )
@TableGenerator(
		name = "gerador_de_id_cliente",
		table = "sqlite_sequence",
		pkColumnName = "name",
		valueColumnName = "seq",
		pkColumnValue = "cliente",
		initialValue =1,
		allocationSize =1
		)

public class ClienteModel {
	
	@Id
	@GeneratedValue( strategy = GenerationType.TABLE, generator = "gerador_de_id_cliente")

	private int idCliente;
	private String nome;
	private String rua;

	private String bairro;
	private String cidade;
	private int CPF;
	
	


	public ClienteModel(){
		
	}
	
	public ClienteModel(int CPF,String nome, String rua, String bairro, String cidade) {
		super();
		this.CPF = CPF;
		this.nome = nome;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		
	}
	
	public ClienteModel(int CPF,String nome) {
		super();
		this.CPF = CPF;
		this.nome = nome;

		
	}

	
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getCPF() {
		return CPF;
	}
	public void setCPF(int CPF) {
		this.CPF = CPF;
	}
	
}
