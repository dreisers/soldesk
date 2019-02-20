package jdbc1210;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateTest2 {

  public static void main(String[] args) {
    try {
        String url      = "jdbc:oracle:thin:@localhost:1521:xe";
        String user     = "java1113";
        String password = "1234";
        String driver   = "oracle.jdbc.driver.OracleDriver"; //ojdbc6.jar
      
        Class.forName(driver);        
        Connection con = DriverManager.getConnection(url, user, password);      
      
        //SQL�� �ۼ�
        //sno=24�� ������ �����ϱ�
        int sno = 24;
        StringBuilder sql = new StringBuilder();
        sql.append(" UPDATE sungjuk ");
        sql.append(" SET uname = ? ");
        sql.append(" , kor = ? ");
        sql.append(" , eng = ? ");
        sql.append(" , mat = ? ");
        sql.append(" , addr = ? ");
        sql.append(" , wdate = sysdate ");
        sql.append(" WHERE sno = ? ");
        
        // SQL�� ��ȯ
        PreparedStatement pstmt = con.prepareStatement(sql.toString());
        pstmt.setString(1, "������");
        pstmt.setInt(2, 99);
        pstmt.setInt(3, 77);
        pstmt.setInt(4, 88);
        pstmt.setString(5, "����");
        pstmt.setInt(6, sno);
        
        // SQL�� ����
        
        int result = pstmt.executeUpdate();
        if(result == 0) {
            System.out.println("����� ����!!");
        }else {
            System.out.println("����� ����~~");
        }//if end
      
    }catch (Exception e) {
        System.out.println("����Ŭ DB ���� ����!!" + e);
    }
    
    

  }//main() end
}//class end
