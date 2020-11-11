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
			//1. ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2. Ŀ�ؼ� ��û
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "system", "oracle");
			pstmt = conn.prepareStatement(query);
			//���⵵ �ε��� 0
			pstmt.setInt(1, no);
			rset = pstmt.executeQuery();
			if(rset.next()) {
				m = new Memo();
				//����1. �ε����� 0����
				m.setNo(rset.getInt("no"));
				m.setName(rset.getString("name"));
				m.setMsg(rset.getString("msg"));
				m.setWriteday(rset.getDate("writeday"));				
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} //����3. �ڿ� ��ȯ 
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