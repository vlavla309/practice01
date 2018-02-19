package practice01;

import java.util.Scanner;

public class Prob03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int num=sc.nextInt();
		int sum=0;
		
		for(int i=0; i<=num; i++) {
			if(isEven(num)) {
				if(isEven(i))
					sum+=i;
			}else {
				if(!isEven(i))
					sum+=i;
			}
		}
		
		System.out.println("결과 값 : "+sum);
	}
	
	public static boolean isEven(int num) {
		if(num%2 == 0)return true;
		return false;
	}
}
