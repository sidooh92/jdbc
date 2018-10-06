package hibernate.student;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubjectHibernateRepository
implements AbstractRepsitoryI<Subject>{
    @Override
    public Subject get(int id) {
        EntityManager em = HibernateUtils.getEntityManager();
        em.getTransaction().begin();
        Subject subject = (Subject) em.createQuery
                ("from Subject s where s.idSubject = :idSubject")
                .setParameter("idSubject", id)
                .getSingleResult();
        //alternatywa
        //Subject subject1 = em.find(Subject.class, id);

        System.out.println(subject);
        em.getTransaction().commit();
        em.close();
        return subject;
    }

    @Override
    public List<Subject> getAll() {
        EntityManager em = HibernateUtils.getEntityManager();
        em.getTransaction().begin();
        List<Subject> subjectList = em.createQuery
                ("from Subject")
                .getResultList();
       System.out.println(subjectList);
        em.getTransaction().commit();
        em.close();
        return subjectList;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean insert(Subject object) {
        EntityManager em = HibernateUtils.getEntityManager();
        em.getTransaction().begin();
        Set<Student> actualStudents = new HashSet<>();
        for (Student student : object.getStudents()) {
        actualStudents.add(em.find(Student.class, student.getIdStudent()));
        }
        object.setStudents(actualStudents);
        em.persist(object);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public boolean update(Subject object) {
        return false;
    }
}
