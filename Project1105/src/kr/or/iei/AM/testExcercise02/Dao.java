package kr.or.iei.AM.testExcercise02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {
	public Memo selectOne(int no) {
		Memo m = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String query = "select * from memo where no = ?";
		try {
			//1. 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2. 커넥션 요청
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "system", "oracle");
			pstmt = conn.prepareStatement(query);
			//여기도 인덱스 0
			pstmt.setInt(1, no);
			rset = pstmt.executeQuery();
			if(rset.next()) {
				m = new Memo();
				//원인1. 인덱스가 0부터
				m.setNo(rset.getInt("no"));
				m.setName(rset.getString("name"));
				m.setMsg(rset.getString("msg"));
				m.setWriteday(rset.getDate("writeday"));				
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} //원인3. 자원 반환 
		finally {
			try {
				rset.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return m;
	}

}