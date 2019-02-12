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
      
        //SQL문 작성
        //문) 성적테이블 전체 레코드 갯수 조회
        StringBuilder sql = new StringBuilder();
        sql.append(" SELECT count(*) ");
        sql.append(" FROM sungjuk ");
        
        // SQL문 변환
        pstmt = con.prepareStatement(sql.toString());
        
        // SQL문 실행
        //pstmt.executeUpdate(); //INSERT, UDPATE, DELETE문 실행
        rs = pstmt.executeQuery(); //SELECT문 실행
        if(rs.next()) { //cursor존재하는지?
            System.out.println("자료 있음~~");
            System.out.println(rs.getInt(1));
        }else {
        	System.out.println("자료 없음");
        }//if end
      
    }catch (Exception e) {
        System.out.println("오라클 DB 연결 실패!!" + e);
    }finally {
        //자원반납
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
