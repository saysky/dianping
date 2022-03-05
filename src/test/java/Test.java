import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author 言曌
 * @date 2022/1/26 1:06 下午
 */

public class Test {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/dbmanager?serverTimezone=Asia/Shanghai&characterEncoding=utf8&useSSL=false&allowMultiQueries=true";
        String username = "root";
        String password = "1234567";
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(url, username, password);
        System.out.println(connection);

    }
}
