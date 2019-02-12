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
      
        //SQL문 작성
        //sno=24의 데이터 수정하기
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
        
        // SQL문 변환
        PreparedStatement pstmt = con.prepareStatement(sql.toString());
        pstmt.setString(1, "차범근");
        pstmt.setInt(2, 99);
        pstmt.setInt(3, 77);
        pstmt.setInt(4, 88);
        pstmt.setString(5, "독일");
        pstmt.setInt(6, sno);
        
        // SQL문 실행
        
        int result = pstmt.executeUpdate();
        if(result == 0) {
            System.out.println("행수정 실패!!");
        }else {
            System.out.println("행수정 성공~~");
        }//if end
      
    }catch (Exception e) {
        System.out.println("오라클 DB 연결 실패!!" + e);
    }
    
    

  }//main() end
}//class end
