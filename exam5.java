package exam;

import java.util.Scanner;

public class exam5 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	double kor;
	String mat;
	double eng;
	System.out.println("문자를 입력하세요");
	mat = sc.next();
	System.out.println("mat   : " + mat);
	System.out.println("실수를 입력하세요");
	eng = sc.nextDouble();
	System.out.println("eng   : " + eng + "\n");
	
	kor = eng * 91.44;
	System.out.println(eng + mat + " = " + (Math.round(kor*10)/10.0) + "cm");
	
	
	
	
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
