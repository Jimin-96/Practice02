package com.javaex.ex01;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
//		숫자(정수) 3개를 입력받아 가장 큰 수를 출력하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 3개를 입력하세요.");
		System.out.print("숫자1:");
		int a = sc.nextInt();
		System.out.print("숫자2:");
		int b = sc.nextInt();
		System.out.print("숫자3:");
		int c = sc.nextInt();
		if(a>b) {
			if(c>a) {
				System.out.println("가장 큰수는 "+c+" 입니다.");
			}else {
				System.out.println("가장 큰수는 "+a+" 입니다.");
			}
		}else if(b>a) {
			if(c>b) {
				System.out.println("가장 큰수는 "+c+" 입니다.");
			}else {
				System.out.println("가장 큰수는 "+b+" 입니다.");
			}
		}
		sc.close();
	}

}
