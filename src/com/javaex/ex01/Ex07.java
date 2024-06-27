package com.javaex.ex01;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[]args) {
//		나이를 입력받아 아래와 같이 입장료가 출력되도록 프로그램을 작성하세요
		
//		조건 출력내용
//		0세~7세 취학전아동/무료 입니다.
//		8세~13세 초등학생/2000원 입니다.
//		14세~16세 중학생/3000원 입니다.
//		17세~19세 고등학생/4000원 입니다.
//		20세~ 성인/5000원 입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이:");
		int age = sc.nextInt();
		
		if (0<=age&&age<=7) {
			System.out.println("취학전아동/무료 입니다.");
		}else if (8<=age&&age<=13) {
			System.out.println("초등학생/2000원 입니다.");
		}else if (14<=age&&age<=16) {
			System.out.println("중학생/3000원 입니다.");
		}else if (17<=age&&age<=19) {
			System.out.println("고등학생.4000원 입니다.");
		}else if (20<=age) {
			System.out.println("성인/5000원 입니다.");
		}
		
		sc.close();
	}

}
