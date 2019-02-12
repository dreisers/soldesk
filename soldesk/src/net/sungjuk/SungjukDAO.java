package net.sungjuk;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


import net.utility.DBClose;
import net.utility.DBOpen;

public class SungjukDAO {
	//Data Access Object �����ͺ��̽� ���� �۾�
	private DBOpen dbopen = null;
	private DBClose dbclose = null;
	public SungjukDAO() {
		dbopen = new DBOpen();
		dbclose = new DBClose();
	}
	
	//�����Ͻ� ���� �ۼ�
	public void insert(String uname, int kor, int eng, int mat, int aver, String addr) {
	}//insert end
	
	public int insert(SungjukDTO dto) {
		Connection con = null;
		PreparedStatement pstmt = null;
		StringBuilder sql = null;
		int res = 0;
		try {
			con = dbopen.getConnection();
			sql = new StringBuilder();
			sql.append(" INSERT INTO sungjuk(sno, uname, kor, eng, mat, aver, addr, wdate) ");
		    sql.append(" VALUES( (SELECT NVL(MAX(sno),0)+1 FROM sungjuk), ?, ?, ?, ?, ?, ?, sysdate) ");
		   
		    pstmt = con.prepareStatement(sql.toString());
		    pstmt.setString(1, dto.getUname());
		    pstmt.setInt(2, dto.getKor());        
		    pstmt.setInt(3, dto.getEng());         
		    pstmt.setInt(4, dto.getMat());         
		    pstmt.setInt(5, dto.getAver());         
		    pstmt.setString(6, dto.getAddr());
		    
		    res = pstmt.executeUpdate();
		    
		}catch (Exception e) {
			System.out.println("�߰����� : " + e);
		}finally {
			dbclose.close(con, pstmt);
		}//try end
			return res;
	}//insert end
	
	public ArrayList<SungjukDTO> list() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StringBuilder sql = null;
		ArrayList<SungjukDTO> list = null;
	try {
		 con = dbopen.getConnection();
		 sql = new StringBuilder();
		 sql.append(" SELECT sno, uname, kor, eng, mat, wdate");
	     sql.append(" FROM sungjuk");
	     sql.append(" ORDER BY sno DESC");
	     pstmt = con.prepareStatement(sql.toString());
	     rs = pstmt.executeQuery();
	     if(rs.next()) {
	    	 list = new ArrayList<>();
	    	 do {
	    		 SungjukDTO dto =new SungjukDTO();
	    		 dto.setSno(rs.getInt("sno"));
	    		 dto.setUname(rs.getString("uname"));
	    		 dto.setKor(rs.getInt("kor"));
	    		 dto.setEng(rs.getInt("eng"));
	    		 dto.setMat(rs.getInt("mat"));
	    		 dto.setWdate(rs.getString("wdate"));
	    		 list.add(dto);
	    	 }while(rs.next());
	     }//if end
		 
	}catch (Exception e) {
		System.out.println("��Ͻ��� : " + e);
	}finally {
		dbclose.close(con, pstmt, rs);
	}//try end
	return list;
	}//list end
	
	public SungjukDTO read(int sno) {
		Connection con = null;
		PreparedStatement pstmt = null;
		StringBuilder sql = null;
		ResultSet rs = null;
		SungjukDTO dto = null;
		try {
			con = dbopen.getConnection();
			sql = new StringBuilder();
			sql.append(" SELECT sno, uname, kor, eng, mat, aver, addr, wdate");
		    sql.append(" FROM sungjuk ");
		    sql.append(" WHERE sno = ? ");
		    
		    pstmt = con.prepareStatement(sql.toString());
		    pstmt.setInt(1, sno);
		    rs = pstmt.executeQuery();
		    if(rs.next()) {
		    	 dto = new SungjukDTO();
	    		 dto.setSno(rs.getInt("sno"));
	    		 dto.setUname(rs.getString("uname"));
	    		 dto.setKor(rs.getInt("kor"));
	    		 dto.setEng(rs.getInt("eng"));
	    		 dto.setMat(rs.getInt("mat"));
	    		 dto.setAver(rs.getInt("aver"));
	    		 dto.setAddr(rs.getString("addr"));
	    		 dto.setWdate(rs.getString("wdate"));
		    }
		}catch (Exception e) {
			System.out.println("�󼼺��� ���� : " + e);
		}finally {
			dbclose.close(con, pstmt);
		}//try end
		return dto;
	}//read end
	
	public int delete(int sno) {
		Connection con = null;
		PreparedStatement pstmt = null;
		StringBuilder sql = null;
		int res = 0;
		try {
			con = dbopen.getConnection();
			sql = new StringBuilder();
			sql.append(" DELETE FROM sungjuk ");
			sql.append(" WHERE sno = ? ");
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, sno);
			res = pstmt.executeUpdate();
			
		}catch (Exception e) {
			System.out.println("���� ���� : " + e);
		}finally {
			dbclose.close(con, pstmt);
		}//try end
		return res;
	}//delete end

	public SungjukDTO update(int sno) {
		Connection con = null;
		PreparedStatement pstmt = null;
		StringBuilder sql = null;
		ResultSet rs = null;
		SungjukDTO dto = null;
		
		
		try {
			con = dbopen.getConnection();
			sql = new StringBuilder();
			sql.append(" SELECT sno, uname, kor, eng, mat, addr, wdate");
		    sql.append(" FROM sungjuk ");
		    sql.append(" WHERE sno = ? ");
		      
		    pstmt = con.prepareStatement(sql.toString());
		    pstmt.setInt(1, sno);
		    rs=pstmt.executeQuery();
		    
	    if(rs.next()) {
	    	 dto = new SungjukDTO();
    		 dto.setSno(rs.getInt("sno"));
    		 dto.setUname(rs.getString("uname"));
    		 dto.setKor(rs.getInt("kor"));
    		 dto.setEng(rs.getInt("eng"));
    		 dto.setMat(rs.getInt("mat"));
    		 dto.setAddr(rs.getString("addr"));
    		 dto.setWdate(rs.getString("wdate"));
	    }
		      
		}catch (Exception e) {
			System.out.println("���� ���� : " + e);
		}finally {
			dbclose.close(con, pstmt,rs);
		}//try end
		return dto;
	}//update end
	
	public int updateproc (SungjukDTO dto) {
		Connection con = null;
		PreparedStatement pstmt = null;
		StringBuilder sql = null;
		
		int res = 0;
		
	try {
		con = dbopen.getConnection();
		sql = new StringBuilder();
	      sql.append(" UPDATE sungjuk " );
	      sql.append(" SET uname = ? " );
	      sql.append(" , kor = ? , eng = ?, mat = ? " );
	      sql.append(" , aver = ?  " );
	      sql.append(" , addr = ?  " );
	      sql.append(" ,wdate = sysdate " );
	      sql.append(" WHERE sno = ? " );
	
	      pstmt = con.prepareStatement(sql.toString());
	      pstmt.setString(1, dto.getUname());
	      pstmt.setInt(2, dto.getKor());
	      pstmt.setInt(3, dto.getEng());
	      pstmt.setInt(4, dto.getMat());
	      pstmt.setInt(5, dto.getAver());
	      pstmt.setString(6, dto.getAddr());
	      pstmt.setInt(7, dto.getSno());	 
	      
	      res=pstmt.executeUpdate();
	      
	}catch (Exception e) {
		System.out.println("���� ���� : " + e);
	}finally {
		dbclose.close(con, pstmt);
	}//try end
	return res;
}//updateproc end
	      
	
}//class end
