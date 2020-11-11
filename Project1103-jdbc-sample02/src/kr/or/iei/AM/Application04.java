package kr.or.iei.AM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Application04 {
	public static void main(String[] args) throws ClassNotFoundException {
		//1. jvm�� Ŭ���� �ε�(Oracle JDBC Driver)
		Class.forName("oracle.jdbc.driver.OracleDriver");

		//2. ����̹� �Ŵ����κ��� Ŀ�ؼ� ����
		try(final Connection conn 
				= DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:XE", 
						"system", "oracle"
						);
				) {
			final String name = "abc";
			final String email = "abc";
			final String sql = "INSERT INTO jdbc_example VALUES (seq_jdbc_example_pk.nextval, ?, DEFAULT, ?)";
			final PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			final int affectedRows = pstmt.executeUpdate();
			System.out.println(affectedRows);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
