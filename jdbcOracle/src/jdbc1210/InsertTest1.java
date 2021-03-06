package jdbc1210;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertTest1 {

  public static void main(String[] args) {
    try {
        //1) 오라클 DB 연결 관련 정보
        String url      = "jdbc:oracle:thin:@localhost:1521:xe";
        String user     = "java1113";
        String password = "1234";
        String driver   = "oracle.jdbc.driver.OracleDriver"; //ojdbc6.jar
      
        //2) 드라이버 로딩
        Class.forName(driver);
        
        //3) 데이터베이스 서버 연결
        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("오라클DB서버 연결 성공!!");        
      
        //4) SQL문 작성
        /*
        String sql = "";
        sql += " INSERT INTO sungjuk(sno, uname, kor, eng, mat, addr, wdate)";
        sql += " VALUES (sungjuk_seq.nextval, '박지성', 99, 88, 77, 'Jeju', sysdate)";
        */
        
        StringBuilder sql = new StringBuilder();
        sql.append(" INSERT INTO sungjuk(sno, uname, kor, eng, mat, addr, wdate) ");
        sql.append(" VALUES( (SELECT NVL(MAX(sno),0)+1 FROM sungjuk),'QUEEN', 55, 66, 44, 'Suwon', sysdate) ");
        
        //5) SQL문 변환
        //PreparedStatement pstmt = con.prepareStatement(sql);
        PreparedStatement pstmt = con.prepareStatement(sql.toString());
        
        //6) SQL문 실행
        int result = pstmt.executeUpdate();
        System.out.println(result);//1행추가
      
    }catch (Exception e) {
        System.out.println("오라클 DB 연결 실패!!" + e);
    }
    
    

  }//main() end
}//class end
