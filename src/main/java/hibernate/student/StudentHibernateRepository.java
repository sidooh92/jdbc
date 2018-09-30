package hibernate.student;

import java.util.List;

public class StudentHibernateRepository implements AbstractRepsitoryI<Student> {


    @Override
    public Student get(int id) {
        //query z parametrem
        return null;
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
