package kr.or.iei.AM;

import java.sql.*;

public class Application {
	public static void main(String[] args) throws ClassNotFoundException {
		//1. jvm�� Ŭ���� �ε�(Oracle JDBC Driver)
		Class.forName("oracle.jdbc.driver.OracleDriver");

		//2. ����̹� �Ŵ����κ��� Ŀ�ؼ� ����
		try(final Connection conn 
				= DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:XE", 
						"system", "oracle"
						);
				//3. �����ͺ��̽� �۾�
				final PreparedStatement pstmt = 
						conn.prepareStatement("SELECT 1 FROM dual");
				) {
			final ResultSet rs = //query ����� ��� ��ü
					pstmt.executeQuery(); //query ����(SELECT)
			rs.next();
			int value = rs.getInt(1);
			System.out.println(value);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
