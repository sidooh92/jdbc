package jdbc.student;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface AbstractRepsitoryI<T> {
    T get(int id);

    List<T> getAll() throws SQLException;

    boolean delete(int id);

    boolean insert(Map<String, String> map);

    boolean update(int id, Map<String, String> map);
}
