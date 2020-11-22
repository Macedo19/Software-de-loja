package DAO;


import java.util.List;

import javax.persistence.TypedQuery;

import model.ClienteModel;


public  class ClienteDAO extends GenericDAO<ClienteModel> {

	  public List<ClienteModel> buscarPorCPF(int CPF) {
		    String jpql = "select p from ClienteModel p where p.CPF = :CPF";
		    TypedQuery<ClienteModel> query = entityManager.createQuery(jpql, ClienteModel.class);
		    query.setParameter("CPF", CPF);
		    List<ClienteModel> cliente = query.getResultList();
		    return cliente;
		  }

}
