package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "produto" )
@TableGenerator(
		name = "gerador_de_id_produto",
		table = "sqlite_sequence",
		pkColumnName = "name",
		valueColumnName = "seq",
		pkColumnValue = "produto",
		initialValue =1,
		allocationSize =1
		)
public class ProdutoModel {
	
	@Id
	@GeneratedValue( strategy = GenerationType.TABLE, generator = "gerador_de_id_produto")
	private int idProduto;
	private double preco;
	private String descricao;
	private int quantidade;
	
	
public ProdutoModel() {

}
	
	
	public ProdutoModel(double preco, String descricao, int quantidade) {
		super();
		this.preco = preco;
		this.descricao = descricao;
		this.quantidade = quantidade;
	}
	public ProdutoModel(int idProduto ,double preco, String descricao, int quantidade) {
		super();
		this.idProduto = idProduto;
		this.preco = preco;
		this.descricao = descricao;
		this.quantidade = quantidade;
	}



	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
