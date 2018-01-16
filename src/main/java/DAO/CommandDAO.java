package DAO;

import ORM.ORMCommand;
import ORM.ORMUser;

import javax.persistence.EntityManager;

public class CommandDAO {

    private final EntityManager em;

    public CommandDAO(EntityManager em) {
        this.em = em;
    }


    public ORMCommand getByid(int id) {
        return em.find(ORMCommand.class,id);
    }
}
