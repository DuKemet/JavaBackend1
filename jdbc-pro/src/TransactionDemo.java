import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class TransactionDemo {
	public static void main(String[] args) {
		String sql1 = "insert into cust values(151,'Nik','Noida','43829239420', 'nik@gmail.com','1000.00')";
		String sql2 = "update cust set City='Madurai' where Cust_Id=11";
		String sql3 = "delete from cust where Cust_Id=14";
		Connection conn= null;
		try {
			conn = JdbcFactory.getConnection();
			conn.setAutoCommit(false);
			
			Statement stmt= conn.createStatement();
			//adding all 3 queries as a branch.
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			
			//Executing batch of 3 dml queries.
			stmt.executeBatch();
			conn.commit();
			System.out.println("Transaction Completed");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Transaction Failed");
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
}
