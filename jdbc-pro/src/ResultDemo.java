import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class ResultDemo {
	public static void main(String[] args) throws SQLException {
		String sql= "select * from cust";
		
		try {
			Connection conn= JdbcFactory.getConnection();
			
			Statement stmt= conn.createStatement();
			
			ResultSet rs= stmt.executeQuery(sql);
			
//			while(rs.next()) {
//				System.out.println(rs.getInt(1)+", "+rs.getString(2)+", "+rs.getString(3));
//			}
			
			ResultSetMetaData meta= (ResultSetMetaData) rs.getMetaData();
			
			System.out.println(meta.getColumnCount());
			
			while(rs.next()) {
				for (int c=1; c<meta.getColumnCount(); c++) {
					System.out.println(rs.getString(c)+", ");
				}
				System.out.println();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
