package net.testbean;

public class CalcBean {
	//���밪 
	public int abs(int a) {
		return Math.abs(a);
	}
	//���丮��
	public int fact(int a) {
		return (a==0) ? 1 : a*fact(a-1);
	}
}//class end
