package Managers;

import DAO.CommandDAO;
import DAO.UserDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Commandmanager {


    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbi356103");

    public void register(int commandId) {
        EntityManager em = emf.createEntityManager();

        CommandDAO cmd = new CommandDAO(em);
        em.getTransaction().begin();
        try {
            cmd.getByid(commandId);
            em.getTransaction().commit();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            em.close();
        }
    }
}
