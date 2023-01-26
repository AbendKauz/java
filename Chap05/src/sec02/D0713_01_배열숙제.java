package sec02;

import java.util.Scanner;

public class D0713_01_배열숙제 {

	public static void main(String[] args) {

		// Q1) 10, 20, 30, 40, 50, 60
		// index가 3인 곳만 출력하지 말기
		// [console]
		// 10, 20, 30, 50, 60

//		int[] arr = {10, 20, 30, 40, 50, 60};
//		for (int i = 0; i < arr.length; i++) {
//			if(i != 3) {
//				if(i == 5) {
//					System.out.print(arr[i]);
//				}else {
//					System.out.print(arr[i] + ", ");
//				}
//			}
//		}

		// Q2) index의 번호를 2개 입력받아, 그 값을 서로 바꿔보기
		// {10, 20, 30, 40, 50, 60}
		// {10, 20, 50, 40, 30, 60}
		// [console]
		// 10, 20, 50, 40, 30, 60

//		int[] arr1 = {10, 20, 30, 40, 50, 60};
//		Scanner sc = new Scanner(System.in);
//		System.out.print("번호 1 입력 : ");
//		int num1 = sc.nextInt();
//		System.out.print("번호 2 입력 : ");
//		int num2 = sc.nextInt();
//		
//		int temp = arr1[num1];
//		arr1[num1] = arr1[num2];
//		arr1[num2] = temp;
//		
//		for (int i = 0; i < arr1.length; i++) {
//			if(i == 5) {
//				System.out.print(arr1[i]);
//			}else {
//				System.out.print(arr1[i] + ", ");
//			}
//		}

		// Q3) 배열의 값 중에서 최대값과 최소값을 구하기
		// {75, 65, 48, 71, 35, 26, 94, 81}
		// [console]
		// 최대값 : 94, 최소값 : 26

//		int[] arr2 = {75, 65, 48, 71, 35, 26, 94, 81};
//		int max = arr2[0];
//		int min = arr2[0];
//		for (int i = 1; i < arr2.length; i++) {
//			if(max < arr2[i]) {
//				max = arr2[i];
//			}else if(min > arr2[i]) {
//				min = arr2[i];
//			}
//		}
//		System.out.println("최대값 : " + max + ", 최소값 : " + min);

		// Q4) 배열의 길이가 10인 int 배열 new 연산자를 이용해서 생성
		// 반복문을 통해서 10, 20, 30, 40, 50, 60, 70, 80, 90, 100이
		// 배열에 값이 저장
		// 배열의 값을 전부 출력

//		int[] arr3 = new int[10];
//		for (int i = 0; i < arr3.length; i++) {
//			arr3[i] = (i + 1) * 10;
//		}
//		for (int i = 0; i < arr3.length; i++) {
//			if(i == arr3.length-1) {
//				System.out.print(arr3[i]);
//			}else {
//				System.out.print(arr3[i] + ", ");
//			}
//		}

		// Q5) char 배열을 생성하여 알파벳 A~Z까지 대입 후 출력(알파벳은 26개)
		// (new 연산자를 활용하여 배열 생성)
		// [console]
		// A B C D E F G H I J K L M N O P Q R S T U V W X Y Z

		char[] arr5 = new char[26];
		for (int i = 0; i < arr5.length; i++) {
			arr5[i] = (char) (65 + i);
			System.out.print(arr5[i] + " ");
		}
		System.out.println();

		// Q6) 5번에서 만든 배열을 역순으로 출력
		// [console]
		// Z Y X W V U T S R Q P O N M L K J I H G F E D C B A

		for (int i = arr5.length - 1; i >= 0; i--) {
			System.out.print(arr5[i] + " ");
		}

	}

}
