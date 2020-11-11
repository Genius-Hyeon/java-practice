package kr.or.iei.AM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Application {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");

		try(final Connection conn 
				= DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:XE", 
						"system", "oracle"
						);
				final PreparedStatement pstmt = 
						conn.prepareStatement("SELECT 1 FROM dual");
				) {
			final ResultSet rs = 
					pstmt.executeQuery(); 
			rs.next();
			int value = rs.getInt(1);
			System.out.println(value);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
