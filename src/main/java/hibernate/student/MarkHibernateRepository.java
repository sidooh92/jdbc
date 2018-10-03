package hibernate.student;

import javax.persistence.EntityManager;
import java.util.List;

public class MarkHibernateRepository implements AbstractRepsitoryI<Mark> {


    @Override
    public Mark get(int id) {
        EntityManager em = HibernateUtils.getEntityManager();
        em.getTransaction().begin();
        Mark mark = em.find(Mark.class, id);
        System.out.println(mark);
        em.getTransaction().commit();
        em.close();
        return mark;
    }

    @Override
    public List<Mark> getAll() {
        EntityManager em = HibernateUtils.getEntityManager();
        em.getTransaction().begin();
        List<Mark> markList = em.createQuery
                ("from Mark")
                .getResultList();
        System.out.println(markList);
        em.getTransaction().commit();
        em.close();
        return  markList;
    }

    @Override
    public boolean delete(int id) {
        EntityManager em = HibernateUtils.getEntityManager();
        em.getTransaction().begin();
        Mark mark = em.find(Mark.class, id);

        em.remove(mark);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public boolean insert(Mark object) {
        EntityManager em = HibernateUtils.getEntityManager();
        em.getTransaction().begin();
        object.setStudent(em.find(Student.class, object.getStudent().getIdStudent()));
        em.persist(object);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public boolean update(Mark object) {
        EntityManager em = HibernateUtils.getEntityManager();
        em.getTransaction().begin();
        Mark mark = em.find(Mark.class, object.getIdMark());
        mark.setMark(object.getMark());

        em.remove(mark);
        em.getTransaction().commit();
        em.close();
        return true;
    }
}
