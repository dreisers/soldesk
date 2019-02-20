package jdbc1210;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateTest {

  public static void main(String[] args) {
    try {
        String url      = "jdbc:oracle:thin:@localhost:1521:xe";
        String user     = "java1113";
        String password = "1234";
        String driver   = "oracle.jdbc.driver.OracleDriver"; //ojdbc6.jar
      
        Class.forName(driver);        
        Connection con = DriverManager.getConnection(url, user, password);      
      
        //SQL문 작성
        //sno>=21의 평균 구하기
        int sno = 21;
        StringBuilder sql = new StringBuilder();
        sql.append(" UPDATE sungjuk ");
        sql.append(" SET aver = (kor+eng+mat)/3 ");
        sql.append(" where sno >= ? ");
        
        // SQL문 변환
        PreparedStatement pstmt = con.prepareStatement(sql.toString());
        pstmt.setInt(1, sno);
        
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
