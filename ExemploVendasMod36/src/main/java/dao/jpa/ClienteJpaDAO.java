
package main.java.dao.jpa;

import main.java.dao.generic.jpa.GenericJpaDB1DAO;
import main.java.domain.jpa.ClienteJpa;


public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

    public ClienteJpaDAO() {
        super(ClienteJpa.class);
    }

}
