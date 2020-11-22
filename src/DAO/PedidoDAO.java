package DAO;

import java.util.List;

import javax.persistence.TypedQuery;

import model.PedidoModel;


public class PedidoDAO extends GenericDAO<PedidoModel> {

	public List<PedidoModel> buscarPorNome(String nome) {
	    String jpql = "select p from PedidoModel p where p.nome = :nome";
	    TypedQuery<PedidoModel> query = entityManager.createQuery(jpql, PedidoModel.class);
	    query.setParameter("nome", nome);
	    List<PedidoModel> pedido = query.getResultList();
	    return pedido;
	  }
	  
	  public List<PedidoModel> buscarPorCPF(int CPF) {
	    String jpql = "select p from PedidoModel p where p.CPF = :CPF";
	    TypedQuery<PedidoModel> query = entityManager.createQuery(jpql, PedidoModel.class);
	    query.setParameter("CPF", CPF);
	    List<PedidoModel> pedido = query.getResultList();
	    return pedido;
	  }
}
