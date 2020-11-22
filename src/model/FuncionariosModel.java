package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "funcionarios")
@TableGenerator(
		name = "gerador_de_id",
		table = "sqlite_sequence",
		pkColumnName = "name",
		valueColumnName = "seq",
		pkColumnValue = "funcionarios",
		initialValue =1,
		allocationSize =1
		)
public class FuncionariosModel {

	@Id
	@GeneratedValue( strategy = GenerationType.TABLE, generator = "gerador_de_id")
	private int idFunc;
	private String nome;
	private String cargo;
	private double salario;
	
	
	public FuncionariosModel(){

	}
	
	
	
	public FuncionariosModel(String nome, String cargo, double salario) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public FuncionariosModel(int idFunc ,String nome, String cargo, double salario){
		super();
		this.idFunc = idFunc;
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}


	public int getIdFunc() {
		return idFunc;
	}
	public void setIdFunc(int idFunc) {
		this.idFunc = idFunc;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
