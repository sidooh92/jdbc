package hibernate;

import hibernate.student.AbstractRepsitoryI;
import hibernate.student.Student;

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
    public boolean delete(Student object) {
        return false;
    }

    @Override
    public boolean insert(Student object) {
        return false;
    }

    @Override
    public boolean update(Student object) {
        return false;
    }

}
