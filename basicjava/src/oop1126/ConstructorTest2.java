package oop1126; 
							
//사용하고자 하는 클래스가 위치해 있는 패키지를 선택하고 사용
import java.util.*;
import java.io.*;
import java.sql.ResultSet;

class Jumsu{
	
	private String name;
	private int kor, eng, mat;
	private int aver;
	
	//생성자 함수는 자동 코딩 추가할 수 있도록 한다.
	//이클립스 : Source -> Generate Constructor...
	public Jumsu() {} //default constructor 기본생성자 함수

	public Jumsu(String name) {
		this.name = name;
	}

	public Jumsu(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	
	
	
	
}//class e

public class ConstructorTest2 {

	public static void main(String[] args) {
	
	
	
	}//main e
}// class e
