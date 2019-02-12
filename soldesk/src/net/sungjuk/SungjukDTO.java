package net.sungjuk;

public class SungjukDTO {
	//Data Transfer Object ������ ���� ��ü
	//Value Object
	//SungjukVO, SungjukDataBean
	//���̺��� Į���� 1:1��Ī�Ǵ�
	//field�� private ��������� ����
	private int sno;
	private String uname;
	private int kor;     
	private int eng;   
	private int mat;  
	private int aver;
	private String addr;
	private String wdate;
	public SungjukDTO() {}
	
	public int getSno() {
		return this.sno;
	}
	
	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getAver() {
		return aver;
	}

	public void setAver(int aver) {
		this.aver = aver;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getWdate() {
		return wdate;
	}

	public void setWdate(String wdate) {
		this.wdate = wdate;
	}

	@Override
	public String toString() {
		return "SungjukDTO [sno=" + sno + ", uname=" + uname + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat
				+ ", aver=" + aver + ", addr=" + addr + ", wdate=" + wdate + "]";
	}
	
	
}// class end
