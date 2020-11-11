package kr.or.iei.AM;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Application07 {

	private static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String DB_USER = "system";
	private static final String DB_PASS = "oracle";

	public static void main(String[] args) throws ClassNotFoundException {
		// 1. 클래스 로드
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// 2. db에 접속
		// try 안에 있는 문장은 알아서 받아줌
		try (final Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {
			//3. db 작업
			final String sql = "SELECT * FROM jdbc_example";
			final PreparedStatement pstmt = conn.prepareStatement(sql);
			final ResultSet rs = pstmt.executeQuery();
			
			List<JdbcExample> list = new ArrayList<>();
			//SQL에서 조건 제대로 달아줄 것
			
			while (rs.next()) {
				final JdbcExample jdbcExample = read(rs);
				list.add(jdbcExample);
			}
			
			for (JdbcExample jdbcExample : list) {
				System.out.println(jdbcExample);
			}
			
		
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
	}
	
	private static JdbcExample read(ResultSet rs) throws SQLException {
		final long id = rs.getLong("id");
		final String name = rs.getString("name");
		final LocalDateTime time = rs.getTimestamp("time").toLocalDateTime();
		final String email = rs.getString("email");
		return new JdbcExample(id, name, time, email);
		
	}
}