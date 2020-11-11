package kr.or.iei.PM;

import java.sql.*;

public class Application03 {

	private static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String DB_USER = "system";
	private static final String DB_PASS = "oracle";

	public static void main(String[] args) throws ClassNotFoundException {
		//1. 드라이버 클래스 로드
		Class.forName("oracle.jdbc.driver.OracleDriver");

		//2. 커넥션을 얻는다 - DB에 접속(세션)
		try (final Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {
			//3. db 작업
			//1) executeQuery의 반환값 - ResultSet
			test1(conn);

			//2) executeUpdate - int (영향받은 행의 수)
			test2(conn);

			//3) 트랜잭션 제어
			test3(conn);

			//4. 연결 종료
		} catch (SQLException throwables) {
			// TODO Auto-generated catch block
			throwables.printStackTrace();
		}

	}

	//트랜잭션
	private static void test3(Connection conn) throws SQLException {
		conn.setAutoCommit(false);//autocommit 설정
		conn.commit();//물리적인 저장소에 반영
		conn.rollback();//물리적인 저장소에 반영할 내용들 취소
		conn.getAutoCommit();//현재 autocommit의 설정상태

	}
	//INSERT
	private static void test2(Connection conn) throws SQLException {
		final String sql = "INSERT INTO bank_account VALUES (?, ?, ?)";
		final PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setLong(1, 10);
		pstmt.setString(2, "jhlee");
		pstmt.setLong(3, 10000);
		pstmt.close(); //자원 해제
		final int affectedRows = pstmt.executeUpdate();
		System.out.println(affectedRows);
	}
	
	//SELECT
	private static void test1(Connection conn) throws SQLException {
		final String sql = "SELECT * FROM bank_account";
		final PreparedStatement pstmt = conn.prepareStatement(sql);
		final ResultSet resultSet = pstmt.executeQuery();
		while (resultSet.next()) {
			final int id = resultSet.getInt("id");
			final String username = resultSet.getString("username");
			final int money = resultSet.getInt("money");

			System.out.println(id);
			System.out.println(username);
			System.out.println(money);
			System.out.println("-------------");

		}//while 
	}

}
