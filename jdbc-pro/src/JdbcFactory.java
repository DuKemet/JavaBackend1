import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public final class JdbcFactory {
    public static Connection getConnection()throws SQLException {
    		Properties prop= new Properties();
    		try {
				prop.load(new FileReader("src/mysql.info"));
				String url = prop.getProperty("url");
				Class.forName(prop.getProperty("driver"));
				Connection conn = DriverManager.getConnection(url, prop.getProperty("user"), prop.getProperty("pass"));
				System.out.println("Connection Successful");
				return conn;
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				throw new SQLException();
    }
}}