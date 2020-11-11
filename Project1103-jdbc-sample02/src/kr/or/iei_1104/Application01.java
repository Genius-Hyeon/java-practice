package kr.or.iei_1104;

import java.sql.*;

public class Application01 {
	
	private static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String DB_USER = "system";
	private static final String DB_PASS = "oracle";
	
	public static void main(String[] args) throws ClassNotFoundException {
		//1. 클래스 로드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2. DB 접속
		try (final Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {
			final String sql = "SELECT empno, ename, job FROM emp";
			final PreparedStatement pstmt = conn.prepareStatement(sql);
			final ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				final int empno = rs.getInt("empno");
				final String ename = rs.getString("ename");
				final String job = rs.getString("job");
				System.out.println(empno);
				System.out.println(ename);
				System.out.println(job);
				System.out.println("===============");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
