package kr.or.iei.AM.testExcercise03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Dao {
	public int update(Memo m) {
		Connection conn = null;
		PreparedStatement pstmt = null;		
		int result = 0 ;//원인1
		ResultSet rs = null; // 원인2
		String query = "update memo set name = ?, msg = ? where no = ?";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        0.1:1521:xe", "system", "oracle");
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getName());
			pstmt.setString(2, m.getMsg());
			pstmt.setInt(3, m.getNo());
			rs = pstmt.executeQuery();
			conn.commit();
			//3. DML 수행 후에는 항상 커밋, 롤백
			if (result > 0)
				conn.commit();
			else
				conn.rollback();
			
			//1. result = pstmt.executeUpdate();
			//DML은 executeUpdate로 실행
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {				
				pstmt.close();
				conn.close();
				rs.close();//반환해주기
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}