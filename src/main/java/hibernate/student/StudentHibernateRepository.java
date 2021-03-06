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

        System.out.println(student);
        em.getTransaction().commit();
        em.close();
        return student;
    }

    @Override
    public List<Student> getAll() {
        EntityManager em = HibernateUtils.getEntityManager();
        em.getTransaction().begin();
        List<Student> studentList = em.createQuery
                ("from Student")
                .getResultList();

        System.out.println(studentList);
        em.getTransaction().commit();
        em.close();
        return studentList;
    }

    @Override
    public boolean delete(int id) {
        EntityManager em = HibernateUtils.getEntityManager();
        em.getTransaction().begin();
        Student student = em.find(Student.class, id);

        em.remove(student);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public boolean insert(Student student) {
        EntityManager em = HibernateUtils.getEntityManager();
        em.getTransaction().begin();

        em.persist(student);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public boolean update(Student object) {
        EntityManager em = HibernateUtils.getEntityManager();
        em.getTransaction().begin();
        Student student = em.find(Student.class, object.getIdStudent());
        student.setName(object.getName());
        student.setSurname(object.getSurname());
        em.merge(student);
        em.getTransaction().commit();
        em.close();
        return true;
    }
}
