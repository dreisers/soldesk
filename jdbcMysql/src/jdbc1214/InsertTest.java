package jdbc1214;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.concurrent.locks.Condition;

public class InsertTest {
public static void main(String[] args) {
	//MySQL �����ͺ��̽� - JDBC 
	//MySQL ��������
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
		pstmt.setString(1, "�����");
		pstmt.setInt(2, 99);
		pstmt.setInt(3, 97);
		pstmt.setInt(4, 95);
		int result = pstmt.executeUpdate();
		if(result == 0) {
			System.out.println("���߰� ����");
		}else {
			System.out.println("���߰� ����");
		}
	}catch (Exception e) {
		System.out.println("MySQL DB ���� ���� : " + e);
	}finally {
	    //�ڿ��ݳ�
        try {
        	if(pstmt!=null) {pstmt.close();}
        }catch (Exception e) {}
        try {
        	if(con!=null) {con.close();}
        }catch (Exception e) {}
	}//try e

	}// main e
}// class e
