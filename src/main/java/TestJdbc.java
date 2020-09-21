import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbc {

    public static void main(String[] args) throws SQLException {

        String jdbcUrl = "jdbc:mysql://localhost:3306/test_bd?useSSL=false&serverTimezone=UTC";

        String user = "hbstudent";
        String pass = "hbstudent";

        System.out.println("connection to database " + jdbcUrl);
        Connection conn = DriverManager.getConnection(jdbcUrl, user, pass);

        System.out.println("sucsefull!");
    }
}
