package kr.or.iei.AM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
//Read
public class Application05 {
	public static void main(String[] args) throws ClassNotFoundException {
		//1. jvm에 클래스 로드(Oracle JDBC Driver)
		Class.forName("oracle.jdbc.driver.OracleDriver");

		//2. 드라이버 매니저로부터 커넥션 얻어옴
		try(final Connection conn 
				= DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:XE", 
						"system", "oracle"
						);
				) {
			final String sql = "SELECT * FROM jdbc_example WHERE id = 4";
			final PreparedStatement pstmt = conn.prepareStatement(sql);
			final ResultSet rs = pstmt.executeQuery();
			rs.next();
			final int id = rs.getInt("id");
			final String name = rs.getString("name");
			final LocalDateTime localDateTime = rs.getTimestamp("time").toLocalDateTime();
			final String email = rs.getString("email");
			
			System.out.println(id);
			System.out.println(name);
			System.out.println(localDateTime);
			System.out.println(email);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
