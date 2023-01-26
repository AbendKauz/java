package chap04;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

//		Q2 ) 초를 키보드로 입력 받아 totalSecond 변수에 값을 저장하기
		Scanner sc = new Scanner(System.in);
		System.out.print("초 입력 : ");
		int totalSecond = sc.nextInt();
//   	 몇시 몇분 몇초인지 계산하는 코드를 작성해라.
//    	 ( hour, min, second 변수 생성하여 사용)
//  	[console]
// 		 초 입력 : __________                 초 입력 : 3723
//  	 ? 시 ?분 ?초                         1시 2분 3초

//		// 1)
//		int hour = 0;
//		int min = 0;
//		int second = 0;
//		
//		if(totalSecond >= 60) {
//			if(totalSecond >= 3600) {
//				hour = totalSecond / 3600;
//				min = (totalSecond % 3600) / 60;
//				second = (totalSecond % 3600) % 60;
//				System.out.println(hour + "시 " + min + "분 " + second + "초");
//			}else {
//				min = totalSecond / 60;
//				second = totalSecond % 60;
//				System.out.println(min + "분 " + second + "초");
//			}
//		}else {
//			second = totalSecond;
//			System.out.println(second + "초");
//		}

//		// 2)
		int hour = totalSecond / 60 / 60;
		totalSecond = totalSecond % (60 * 60);
		System.out.println(totalSecond);
		int min = totalSecond / 60;
		int sec = totalSecond % 60;
		System.out.println(hour + "시 " + min + "분 " + sec + "초");

	}

}
