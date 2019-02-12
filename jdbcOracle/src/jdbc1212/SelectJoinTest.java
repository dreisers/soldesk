package jdbc1212;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectJoinTest {

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
        //문) 학번별 수강신청 과목의 총학점을 학번순으로 조회하시오
        //    g1001 홍길동 8
        //    g1005 무궁화 6
                
        StringBuilder sql = new StringBuilder();
        sql.append(" SELECT BB.hakno, BB.hap, ST.uname ");
        sql.append(" FROM ( SELECT AA.hakno, sum(AA.ghakjum) as hap ");
        sql.append("        FROM ( SELECT SU.hakno, SU.gcode, GW.ghakjum ");
        sql.append("               FROM tb_sugang SU JOIN tb_gwamok GW ");
        sql.append("               ON SU.gcode = GW.gcode ");
        sql.append("             )AA ");
        sql.append("        GROUP BY AA.hakno ");
        sql.append("      )BB JOIN tb_student ST ");
        sql.append(" ON BB.hakno = ST.hakno ");
        sql.append(" ORDER BY BB.hakno ");
        
        // SQL문 변환
        pstmt = con.prepareStatement(sql.toString());
        
        // SQL문 실행
        rs = pstmt.executeQuery();
        if(rs.next()) { //cursor존재하는지?
            System.out.println("자료 있음~~");
            do {
              System.out.print(rs.getString("hakno") + " ");
              System.out.print(rs.getInt("hap") + " ");
              System.out.print(rs.getString("uname") + " ");
              System.out.println();
            }while(rs.next());
        }else {
            System.out.println("자료 없음!!");
        }//if end
      
    }catch (Exception e) {
        System.out.println("오라클 DB 연결 실패!!" + e);
    }finally {
        //자원반납(순서주의)
        try {
          if(rs!=null) {rs.close();}
        }catch (Exception e) {}
        
        try {
            if(pstmt!=null) {pstmt.close();}
        }catch (Exception e) {}
        
        try {
            if(con!=null) {con.close();}
        }catch (Exception e) {}
        
    }//end
    
    

  }//main() end
}//class end
