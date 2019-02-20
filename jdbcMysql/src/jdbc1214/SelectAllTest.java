package jdbc1214;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectAllTest {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/soldesk?useUnicode=true&characterEncoding=euckr";
		String user = "root";
		String password = "1234";
		String driver = "org.gjt.mm.mysql.Driver"; 

		Connection con = null;
		PreparedStatement pstmt = null;
	    ResultSet rs = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			
			StringBuilder sql = new StringBuilder();
			sql.append(" SELECT sno, uname, kor, eng, mat, regdt " );
			sql.append(" FROM sungjuk ");
			sql.append(" ORDER BY sno desc " );
			
			
			pstmt = con.prepareStatement(sql.toString());
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				  do {
		            	System.out.print(rs.getInt("sno") + " ");
		                System.out.print(rs.getString("uname") + " ");
		                System.out.print(rs.getInt("kor") + " ");
		                System.out.print(rs.getInt("eng") + " ");
		                System.out.print(rs.getInt("mat") + " ");
		                System.out.print(rs.getInt("regdt") + " ");
		                System.out.println();
		            }while (rs.next());            
			}else {
				System.out.println("자료 없음");
			}//if e
		
		}catch (Exception e) {
			System.out.println("MySQL DB 연결 실패 : " + e);
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
		}//try e

		}// main e
	}// class e