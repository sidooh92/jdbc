package hibernate.student;

import java.util.List;

public class StudentHibernateRepository implements AbstractRepsitoryI<Student> {


    @Override
    public Student get(int id) {
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
