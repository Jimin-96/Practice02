package com.javaex.ex01;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
//		알파벳을 입력받아 자음 모음을 구분하세요.
//		⚫ switch~case문을 사용합니다.
//		⚫ 영문 소문자 이외의 입력값은 고려하지 않습니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파 1글(소문자)를 입력하세요.");
		System.out.print("알파벳:");
		String arp = sc.nextLine();
		
		switch (arp) {
		case "a","e","i","o","u":
			System.out.println("모음입니다.");
		    break;
		default:
			System.out.println("자음입니다.");
			break;
		}
		
		sc.close();

	}

}
