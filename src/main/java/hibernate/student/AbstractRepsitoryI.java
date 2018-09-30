package hibernate.student;

import java.util.List;

public interface AbstractRepsitoryI<T> {
    T get(int id);

    List<T> getAll();

    boolean delete(T object);

    boolean insert(T object);

    boolean update(T object);
}
