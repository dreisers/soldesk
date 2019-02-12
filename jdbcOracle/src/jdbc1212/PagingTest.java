package jdbc1212;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PagingTest {

	public static void main(String[] args) {

	    String url      = "jdbc:oracle:thin:@localhost:1521:xe";
	    String user     = "java1113";
	    String password = "1234";
	    String driver   = "oracle.jdbc.driver.OracleDriver"; //ojdbc6.jar

	    Connection con = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
	    
	    try {
	      
	        Class.forName(driver);        
	        con = DriverManager.getConnection(url, user, password);      
	      
	        //SQL�� �ۼ�
	        // �й��� ������û ������ �� ������ �й������� ��ȸ
	        // g1001 ȫ�浿 8
	        // g1005 ����ȭ 6
	        int start = 1;
	        int end = 3;
	        StringBuilder sql = new StringBuilder();
	        sql.append(" select rnum, hakno, uname, address, phone, email "); 
	        sql.append(" from( ");
	        sql.append("select rownum as rnum, hakno, uname, address, phone, email ");
	        sql.append(" from( select hakno, uname, address, phone, email ");
	        sql.append(" from tb_student order by hakno ");
	        sql.append("            ) ");
	        sql.append("       ORDER BY rownum DESC ");
	        sql.append("      ) ");
	        sql.append(" WHERE rnum>=? AND rnum<=? ");
	        // SQL�� ��ȯ
	        pstmt = con.prepareStatement(sql.toString());
	        pstmt.setInt(1, start);
	        pstmt.setInt(2, end);
	        // SQL�� ����

	        rs = pstmt.executeQuery();
	        if(rs.next()) { 
	            System.out.println("�ڷ� ����~~");
	            do {
	            	System.out.print(rs.getInt("rnum") + " ");
	                System.out.print(rs.getString("hakno") + " ");
	                System.out.print(rs.getString("uname") + " ");
	                System.out.print(rs.getString("address") + " ");
	                System.out.print(rs.getString("phone") + " ");
	                System.out.print(rs.getString("email") + " ");
	                System.out.println();
	            }while (rs.next());            
	        }else {
	            System.out.println("�ڷ� ����!!");
	        }//if end
	      
	    }catch (Exception e) {
	        System.out.println("����Ŭ DB ���� ����!!" + e);
	    }finally {
	        //�ڿ��ݳ�
	        try {
	        	if(rs!=null) {rs.close();}
	        }catch (Exception e) {}
	        try {
	        	if(pstmt!=null) {pstmt.close();}
	        }catch (Exception e) {}
	        try {
	        	if(con!=null) {con.close();}
	        }catch (Exception e) {}
	    }
	    
	    

	  }//main() end
	}//class end
