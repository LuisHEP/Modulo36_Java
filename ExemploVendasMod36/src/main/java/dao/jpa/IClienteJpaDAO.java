package main.java.dao.jpa;


import main.java.dao.generic.jpa.IGenericJapDAO;
import main.java.domain.jpa.Persistente;


public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
