package com.javaex.ex01;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
//		사용자로 키와 몸무게를 입력받아 표준체중을 계산한 후에 저체중, 표준, 과체중을 구분하여 출력하 프
//		로그램을 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키:");
		int cm = sc.nextInt();
		System.out.print("몸무게:");
		int kg = sc.nextInt();
		double a = (cm-100)*0.9;
		
		if (kg<a) {
			System.out.println("저체중 입니다.");
		}else if (kg==a) {
			System.out.println("표준 입니다.");
		}else if (kg>a) {
			System.out.println("과체중 입니다.");
		}
		System.out.println("표준체중:"+a);
		sc.close();

	}

}
