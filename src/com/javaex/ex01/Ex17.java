package com.javaex.ex01;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
//		다음과 같이 수익을 입력받아 소득세를 계산하는 프로그램을 작성하세요
//		⚫ 세금계산법
//		⚫ 0원이상 1000만원 이하인 경우 tax: 0.09*수익
//		⚫ 1000만원 초과 4000만원 이하인 경우 tax: 1000*0.09 + 0.18*(수익-1000)
//		⚫ 4000만원 초과 8000만원 미만인 경우 tax: 1000*0.09 + 3000*0.18 + 0.27*(수익-4000)
//		⚫ 8000만원 이상인 경우 tax: 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(수익-8000)
		
		Scanner sc = new Scanner(System.in);
		double a = 1000*0.09;
		double b = a+3000*0.18;
		double c = b+4000*0.27;
		
		System.out.println("세금을 입력해 주세요");
		System.out.print("금익:");
		double won = sc.nextDouble();
		
		if(won<0) {
			System.out.println("잘못 입력했습니다.");
		}else if(won<=1000) {
			System.out.println("소득세는 "+(won*0.09)+" 입니다.");
		}else if(1000<won&&won<=4000) {
			System.out.println("소득세는 "+(a+(won-1000)*0.18)+" 입니다.");
		}else if(4000<won&&won<=8000) {
			System.out.println("소득세는 "+(b+((won-4000)*0.27))+" 입니다.");
		}else if(8000<won) {
			System.out.println("소득세는 "+(c+((won-8000)*0.36))+" 입니다.");
		}
		sc.close();

	}

}
