package jdbc.student;

import java.util.List;
import java.util.Map;

public abstract class AbstractRepository<T> {
    abstract T get(int id);

    abstract List<T> getAll();

    abstract boolean delete(int id);

    abstract boolean insert(Map<String, String> map);

    abstract boolean update(int id, Map<String, String> map);
}
