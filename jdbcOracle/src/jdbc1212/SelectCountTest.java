package jdbc1212;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectCountTest {

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
        //��) �������̺� ��ü ���ڵ� ���� ��ȸ
        StringBuilder sql = new StringBuilder();
        sql.append(" SELECT count(*) ");
        sql.append(" FROM sungjuk ");
        
        // SQL�� ��ȯ
        pstmt = con.prepareStatement(sql.toString());
        
        // SQL�� ����
        //pstmt.executeUpdate(); //INSERT, UDPATE, DELETE�� ����
        rs = pstmt.executeQuery(); //SELECT�� ����
        if(rs.next()) { //cursor�����ϴ���?
            System.out.println("�ڷ� ����~~");
            System.out.println(rs.getInt(1));
        }else {
        	System.out.println("�ڷ� ����");
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