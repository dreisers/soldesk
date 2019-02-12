package jdbc1210;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertTest1 {

  public static void main(String[] args) {
    try {
        //1) ����Ŭ DB ���� ���� ����
        String url      = "jdbc:oracle:thin:@localhost:1521:xe";
        String user     = "java1113";
        String password = "1234";
        String driver   = "oracle.jdbc.driver.OracleDriver"; //ojdbc6.jar
      
        //2) ����̹� �ε�
        Class.forName(driver);
        
        //3) �����ͺ��̽� ���� ����
        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("����ŬDB���� ���� ����!!");        
      
        //4) SQL�� �ۼ�
        /*
        String sql = "";
        sql += " INSERT INTO sungjuk(sno, uname, kor, eng, mat, addr, wdate)";
        sql += " VALUES (sungjuk_seq.nextval, '������', 99, 88, 77, 'Jeju', sysdate)";
        */
        
        StringBuilder sql = new StringBuilder();
        sql.append(" INSERT INTO sungjuk(sno, uname, kor, eng, mat, addr, wdate) ");
        sql.append(" VALUES( (SELECT NVL(MAX(sno),0)+1 FROM sungjuk),'QUEEN', 55, 66, 44, 'Suwon', sysdate) ");
        
        //5) SQL�� ��ȯ
        //PreparedStatement pstmt = con.prepareStatement(sql);
        PreparedStatement pstmt = con.prepareStatement(sql.toString());
        
        //6) SQL�� ����
        int result = pstmt.executeUpdate();
        System.out.println(result);//1���߰�
      
    }catch (Exception e) {
        System.out.println("����Ŭ DB ���� ����!!" + e);
    }
    
    

  }//main() end
}//class end
