package kr.or.iei.PM;

import java.sql.*;

public class Application03 {

	private static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String DB_USER = "system";
	private static final String DB_PASS = "oracle";

	public static void main(String[] args) throws ClassNotFoundException {
		//1. ����̹� Ŭ���� �ε�
		Class.forName("oracle.jdbc.driver.OracleDriver");

		//2. Ŀ�ؼ��� ��´� - DB�� ����(����)
		try (final Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {
			//3. db �۾�
			//1) executeQuery�� ��ȯ�� - ResultSet
			test1(conn);

			//2) executeUpdate - int (������� ���� ��)
			test2(conn);

			//3) Ʈ����� ����
			test3(conn);

			//4. ���� ����
		} catch (SQLException throwables) {
			// TODO Auto-generated catch block
			throwables.printStackTrace();
		}

	}

	//Ʈ�����
	private static void test3(Connection conn) throws SQLException {
		conn.setAutoCommit(false);//autocommit ����
		conn.commit();//�������� ����ҿ� �ݿ�
		conn.rollback();//�������� ����ҿ� �ݿ��� ����� ���
		conn.getAutoCommit();//���� autocommit�� ��������

	}
	//INSERT
	private static void test2(Connection conn) throws SQLException {
		final String sql = "INSERT INTO bank_account VALUES (?, ?, ?)";
		final PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setLong(1, 10);
		pstmt.setString(2, "jhlee");
		pstmt.setLong(3, 10000);
		pstmt.close(); //�ڿ� ����
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
