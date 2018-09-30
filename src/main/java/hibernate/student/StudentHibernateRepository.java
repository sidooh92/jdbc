package hibernate.student;

import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;
import java.util.List;

public class StudentHibernateRepository implements AbstractRepsitoryI<Student> {


    @Override
    public Student get(int id) {

        EntityManager em = HibernateUtils.getEntityManager();
        em.getTransaction().begin();
        Student student = (Student) em.createQuery
                ("from Student p where p.idStudent = :idStudent")
                .setParameter("idStudent", id)
                .getSingleResult();

        em.getTransaction().commit();
        em.close();
        //query z parametrem
        return student;
    }

    @Override
    public List<Student> getAll() {
      // query bez parametru
        return null;
    }

    @Override
    public boolean delete(Student object) {
        //remove
        return false;
    }

    @Override
    public boolean insert(Student object) {

        //persist
        return false;
    }

    @Override
    public boolean update(Student object) {

        //merge
        return false;
    }
}
