package hibernate;

import hibernate.student.*;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        StudentHibernateRepository studentRepo = new StudentHibernateRepository();
        MarkHibernateRepository markRepo = new MarkHibernateRepository();
        SubjectHibernateRepository subjectRepository = new SubjectHibernateRepository();
      //dodanie nowego studenta o id 1
        Student student = new Student();
        student.setIdStudent(1);

        Subject subject = new Subject();
        subject.setSubjectName("TEST2");
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student);
        subject.setStudents(studentSet);
        subjectRepository.insert(subject);
//
//        //dodanie 2 ocen do studenta o id 1
//        markRepo.insert(new Mark(5,student));
//        markRepo.insert(new Mark(5,student));
//
//
//        markRepo.insert(new Mark(3,student2));
//        markRepo.insert(new Mark(2,student2));
//
//        //pobranie studenta o o id 1 i wyswietlenie wewnatrz metody get jego toString
//        studentRepo.get(1);
//
//        //usuniecie oceny po id
//        markRepo.delete(1);
//
//        //wyswietlenie studenta  z ocenami po usunieciu jednej oceny
//        studentRepo.get(1);
//
//
//        //pobranie i wyswietlenie wszystkich studentow z ich ocenami
//        studentRepo.getAll();
//
//
//        //pobranie i wyswietlenie wszystkich ocen
//        markRepo.getAll();


        HibernateUtils.closeEmFactory();

}


}
