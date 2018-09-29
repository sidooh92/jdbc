package jdbc.student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentRepository implements AbstractRepsitoryI {


    String DB_CONNECTION = "jdbc:mysql://localhost:3306/test?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC";
    String DB_USER = "root";
    String DB_PASSWORD = "admin";

    Connection connection = null;
    Statement statement = null;
    ResultSet rs = null;


    @Override
    public Student get(int id) {
        return null;
    }

    @Override
    public List<Student> getAll() throws SQLException {
        List<Student> students =  new ArrayList<>();
        try {
            connection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
            statement = connection.createStatement();

            String selectTableSQL = "SELECT * from person";

            rs = statement.executeQuery(selectTableSQL);

            while (rs.next()) {

                int studentId = rs.getInt("idStudent");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                students.add(new Student(studentId, name, surname ));


            }
        } catch (
                SQLException e)

        {

            System.out.println(e.getMessage());

        } finally

        {
            if (rs != null) {
                rs.close();
            }

            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return students;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean update(int id, Map map) {
        return false;
    }

    @Override
    public boolean insert(Map map) {
        return false;
    }
}
