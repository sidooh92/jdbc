package hibernate.student;

import java.util.List;

public class SubjectHibernateRepository
implements AbstractRepsitoryI<Subject>{
    @Override
    public Subject get(int id) {
        return null;
    }

    @Override
    public List<Subject> getAll() {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean insert(Subject object) {
        return false;
    }

    @Override
    public boolean update(Subject object) {
        return false;
    }
}
