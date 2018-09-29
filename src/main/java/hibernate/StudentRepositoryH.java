package hibernate;

import jdbc.student.AbstractRepsitoryI;
import jdbc.student.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Map;

public class StudentRepositoryH implements AbstractRepsitoryI<Student> {

    EntityManager em = null;

    private void initEntityManager() {
        if (em == null) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
            em = emf.createEntityManager();
        }
    }

    @Override
    public Student get(int id) {
        initEntityManager();
        em.getTransaction().begin();


        em.getTransaction().commit();
        em.close();
        return null;
    }

    @Override
    public List<Student> getAll() {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean insert(Map<String, String> map) {
        return false;
    }

    @Override
    public boolean update(int id, Map<String, String> map) {
        return false;
    }
}
