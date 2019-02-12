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
      
        //SQL�� �ۼ�
        StringBuilder sql = new StringBuilder();
        sql.append(" SELECT sno, uname, kor, eng, mat, aver, addr, wdate ");
        sql.append(" FROM sungjuk ");
        sql.append(" WHERE sno = ? ");
        
        // SQL�� ��ȯ
        pstmt = con.prepareStatement(sql.toString());
        pstmt.setInt(1, 5); //sno=5 ���ڵ� ��ȸ�ϱ�
        
        // SQL�� ����
        //pstmt.executeUpdate(); //INSERT, UDPATE, DELETE�� ����
        rs = pstmt.executeQuery(); //SELECT�� ����
        if(rs.next()) { //cursor�����ϴ���?
            System.out.println("�ڷ� ����~~");
            //1)Į����
            System.out.print(rs.getInt("sno") + " ");
            System.out.print(rs.getString("uname") + " ");
            System.out.print(rs.getInt("kor") + " ");
            System.out.print(rs.getInt("eng") + " ");
            System.out.print(rs.getInt("mat") + " ");
            System.out.print(rs.getInt("aver") + " ");
            System.out.print(rs.getString("addr") + " ");
            System.out.print(rs.getString("wdate") + " ");
            System.out.println();
            
            //2)Į������
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getInt(3) + " ");
            System.out.print(rs.getInt(4) + " ");
            System.out.print(rs.getInt(5) + " ");
            System.out.print(rs.getInt(6) + " ");
            System.out.print(rs.getString(7) + " ");
            System.out.print(rs.getString(8) + " ");
            
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
