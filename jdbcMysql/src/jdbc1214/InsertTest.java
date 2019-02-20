package jdbc1214;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.concurrent.locks.Condition;

public class InsertTest {
public static void main(String[] args) {
	//MySQL 데이터베이스 - JDBC 
	//MySQL 관련정보
	String url = "jdbc:mysql://localhost:3306/soldesk";
	String user = "root";
	String password = "1234";
	String driver = "org.gjt.mm.mysql.Driver"; 

	Connection con = null;
	PreparedStatement pstmt = null;
	
	try {
		Class.forName(driver);
		con = DriverManager.getConnection(url, user, password);
		
		StringBuilder sql = new StringBuilder();
		//sql.append(" INSERT INTO sungjuk(uname,kor,eng,mat,regdt)" );
		//sql.append(" VALUES(?, ?,?,?, now()) ");
		sql.append(" INSERT INTO sungjuk(sno, uname, kor, eng, mat)" );
		sql.append(" VALUES(  (select ifnull(max(sno),0)+1 FROM sungjuk as TB)");
		sql.append("  ,?, ?, ?, ?, now()) ");
		
		
		pstmt = con.prepareStatement(sql.toString());
		pstmt.setString(1, "손흥민");
		pstmt.setInt(2, 99);
		pstmt.setInt(3, 97);
		pstmt.setInt(4, 95);
		int result = pstmt.executeUpdate();
		if(result == 0) {
			System.out.println("행추가 실패");
		}else {
			System.out.println("행추가 성공");
		}
	}catch (Exception e) {
		System.out.println("MySQL DB 연결 실패 : " + e);
	}finally {
	    //자원반납
        try {
        	if(pstmt!=null) {pstmt.close();}
        }catch (Exception e) {}
        try {
        	if(con!=null) {con.close();}
        }catch (Exception e) {}
	}//try e

	}// main e
}// class e
