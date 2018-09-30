package hibernate;

import hibernate.student.HibernateUtils;
import hibernate.student.Student;
import hibernate.student.StudentHibernateRepository;

import javax.persistence.EntityManager;

public class Main {

    public static void main(String[] args) {
        StudentHibernateRepository studentHibernateRepository = new StudentHibernateRepository();
        Student student = studentHibernateRepository.get(1);

        System.out.println(student);

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

        HibernateUtils.closeEmFactory();

}


}
