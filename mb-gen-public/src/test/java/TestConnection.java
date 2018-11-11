import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author wangyufei
 * @date 2018/11/11
 */
public class TestConnection {

    public static void main(String[] args) {

        String connectionURL = "jdbc:mysql://localhost:3306/gp?useUnicode=true&characterEncoding=UTF-8";
        String userId = "root";
        String password = "root1234";
        try {
            Connection connection = DriverManager.getConnection(connectionURL, userId, password);
            System.out.println(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
