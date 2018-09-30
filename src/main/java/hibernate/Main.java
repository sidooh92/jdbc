package hibernate;

import hibernate.student.HibernateUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
         EntityManager em = HibernateUtils.getEntityManager();
        em.getTransaction().begin();

////
////
////        Person person = new Person();
////        person.setAge(919);
////        person.setName("sidAAA");
////        person.setSurname("sidsurnameAAA");
////        person.setIdperson(199);
////
////        em.persist(person);
//////
//
//        List<Person> idperson = em.createQuery
//                ("from Person p where p.idperson = :t")
//                .setParameter("t", 99)
//                .getResultList();
////
////
//        for (Person p : idperson ) {
//            System.out.println(p);
//            for (Dog dog : p.getDogs()) {
//                System.out.println(dog);
//            }
//
//        }
//

//        Person person1 = (Person) session.createQuery
// ("FROM Person WHERE idperson = 99").getSingleResult();
//        System.out.println(person1.getName());


//
//        String person2 = (String) session.createQuery("SELECT surname FROM Person WHERE idperson = 99").getSingleResult();
//        System.out.println(person2);
//        session.getTransaction().commit();

        em.getTransaction().commit();
        em.close();
        HibernateUtils.closeEmFactory();

}


}
