package jdbc1210;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertTest2 {

  public static void main(String[] args) {
    try {
        String url      = "jdbc:oracle:thin:@localhost:1521:xe";
        String user     = "java1113";
        String password = "1234";
        String driver   = "oracle.jdbc.driver.OracleDriver"; //ojdbc6.jar
      
        Class.forName(driver);        
        Connection con = DriverManager.getConnection(url, user, password);      
      
        //SQL�� �ۼ�       
        StringBuilder sql = new StringBuilder();
        sql.append(" INSERT INTO sungjuk(sno, uname, kor, eng, mat, addr, wdate) ");
        sql.append(" VALUES( (SELECT NVL(MAX(sno),0)+1 FROM sungjuk), ?, ?, ?, ?, ?, sysdate) ");
        
        // SQL�� ��ȯ
        PreparedStatement pstmt = con.prepareStatement(sql.toString());

        // ? ������ ? �ڷ����� ����!!
        pstmt.setString(1, "���׼�"); // 1 -> ù��°?, uname
        pstmt.setInt(2, 100);         // 2 -> �ι�°?, kor
        pstmt.setInt(3, 90);          // 3 -> ����°?, eng
        pstmt.setInt(4, 70);          // 4 -> �׹�°?, mat
        pstmt.setString(5, "��Ʈ��"); // 5 -> �ټ���°?, addr        
        
        // SQL�� ����
        int result = pstmt.executeUpdate();
        if(result == 0) {
            System.out.println("���߰� ����!!");
        }else {
            System.out.println("���߰� ����~~");
        }//if end
      
    }catch (Exception e) {
        System.out.println("����Ŭ DB ���� ����!!" + e);
    }
    
    

  }//main() end
}//class end
