package kr.or.iei.AM;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Application08 {

	private static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String DB_USER = "system";
	private static final String DB_PASS = "oracle";

	public static void main(String[] args) throws ClassNotFoundException {
		// 1. Ŭ���� �ε�
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// 2. db�� ����
		// try �ȿ� �ִ� ������ �˾Ƽ� �޾���
		try (final Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {
			//3. db �۾�
			final String sql = "UPDATE jdbc_example SET name = ? WHERE 1 = 1";
			final PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "java");
			final int affectedRows = pstmt.executeUpdate();
			System.out.println(affectedRows);
			
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
	}

}