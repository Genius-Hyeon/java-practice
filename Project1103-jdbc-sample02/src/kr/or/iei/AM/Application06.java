package kr.or.iei.AM;
import java.sql.*;
import java.time.LocalDateTime;

public class Application06 {

	private static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String DB_USER = "system";
	private static final String DB_PASS = "oracle";

	public static void main(String[] args) throws ClassNotFoundException {
		// 1. Ŭ���� �ε�
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// 2. db�� ����
		try (final Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {
			//3. db �۾�
			final String sql = "SELECT * FROM jdbc_example WHERE id = 4";
			final PreparedStatement pstmt = conn.prepareStatement(sql);
			final ResultSet rs = pstmt.executeQuery();
			rs.next();

			final int id = rs.getInt("id");
			final String name = rs.getString("name");
			final LocalDateTime time = rs.getTimestamp("time").toLocalDateTime();
			final String email = rs.getString("email");

			System.out.println(id);
			System.out.println(name);
			System.out.println(time);
			System.out.println(email);

		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
	}

}

