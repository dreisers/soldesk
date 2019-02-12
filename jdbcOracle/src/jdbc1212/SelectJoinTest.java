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
      
        //SQL�� �ۼ�
        //��) �й��� ������û ������ �������� �й������� ��ȸ�Ͻÿ�
        //    g1001 ȫ�浿 8
        //    g1005 ����ȭ 6
                
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
        
        // SQL�� ��ȯ
        pstmt = con.prepareStatement(sql.toString());
        
        // SQL�� ����
        rs = pstmt.executeQuery();
        if(rs.next()) { //cursor�����ϴ���?
            System.out.println("�ڷ� ����~~");
            do {
              System.out.print(rs.getString("hakno") + " ");
              System.out.print(rs.getInt("hap") + " ");
              System.out.print(rs.getString("uname") + " ");
              System.out.println();
            }while(rs.next());
        }else {
            System.out.println("�ڷ� ����!!");
        }//if end
      
    }catch (Exception e) {
        System.out.println("����Ŭ DB ���� ����!!" + e);
    }finally {
        //�ڿ��ݳ�(��������)
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
