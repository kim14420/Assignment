package exam;

import java.util.Scanner;

public class exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int kor;
		int mat;
		int eng;
        Scanner tx= new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		kor = tx.nextInt();
		System.out.println("kor  : " + kor);
		mat = tx.nextInt();
		System.out.println("mat  : " + mat);
		eng = tx.nextInt();
		System.out.println("eng  : " + eng + "\n");
		
		int sum = kor + mat + eng;
		System.out.println("sum" + " = " + sum);
		int avg = sum / 3;
		System.out.println("avg" + " = " + avg);
				
			
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
