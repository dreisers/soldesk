package jdbc1212;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectOneTest {

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
        StringBuilder sql = new StringBuilder();
        sql.append(" SELECT sno, uname, kor, eng, mat, aver, addr, wdate ");
        sql.append(" FROM sungjuk ");
        sql.append(" WHERE sno = ? ");
        
        // SQL문 변환
        pstmt = con.prepareStatement(sql.toString());
        pstmt.setInt(1, 5); //sno=5 레코드 조회하기
        
        // SQL문 실행
        //pstmt.executeUpdate(); //INSERT, UDPATE, DELETE문 실행
        rs = pstmt.executeQuery(); //SELECT문 실행
        if(rs.next()) { //cursor존재하는지?
            System.out.println("자료 있음~~");
            //1)칼럼명
            System.out.print(rs.getInt("sno") + " ");
            System.out.print(rs.getString("uname") + " ");
            System.out.print(rs.getInt("kor") + " ");
            System.out.print(rs.getInt("eng") + " ");
            System.out.print(rs.getInt("mat") + " ");
            System.out.print(rs.getInt("aver") + " ");
            System.out.print(rs.getString("addr") + " ");
            System.out.print(rs.getString("wdate") + " ");
            System.out.println();
            
            //2)칼럼순서
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getInt(3) + " ");
            System.out.print(rs.getInt(4) + " ");
            System.out.print(rs.getInt(5) + " ");
            System.out.print(rs.getInt(6) + " ");
            System.out.print(rs.getString(7) + " ");
            System.out.print(rs.getString(8) + " ");
            
        }else {
            System.out.println("자료 없음!!");
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
