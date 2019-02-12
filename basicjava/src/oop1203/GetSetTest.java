package oop1203;

class Score{
	//field는 대부분 private속성을 많이 유지한다
	private String name;
	private int kor, eng, mat;
	private int aver;
	
	public Score() {} //default constructor
	
	//private속성의 field접근하는 경우 method활용한다
	public void setName(String name) {
	this.name = name;
	}
	public String getName( ) {
		return this.name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getKor() {
		return this.kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getEng() {
		return this.eng;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getMat() {
		return this.mat;
	}
	public void setAver(int aver) {
		this.aver = aver;
	}
	public int getAver() {
		return this.aver;
	}

	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", aver=" + aver + "]";
	}
	
}//class e
public class GetSetTest {

	public static void main(String[] args) {
		//getter 함수
		//setter 함수
		//접두어 set, get으로 시작하고
		//feild 첫글자를 대문자로 바꾼후 메소드 이름을 구성한다.
		
		Score score = new Score();
		//score.name
		//에러. private속성은 내부접근만 가능
		score.setName("무궁화");
		score.setKor(10);
		score.setEng(20);
		score.setMat(30);
		
		System.out.println(score.getName());
		System.out.println(score.getKor());
		System.out.println(score.getEng());
		System.out.println(score.getMat());
		
		System.out.println(score.toString());
		System.out.println(score); // toString 생략가능
		//toString 주소값출력 - 에러잡는데 많이 쓰임
		
		
	}//main e
}//class e
