package sec01.exam18;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {

		// substring 이용하여 단어 거꾸로 출력하기
		Scanner s = new Scanner(System.in);
		System.out.print("단어 입력 : ");
		String word = s.next();
		String result = "";

		for (int i = 0; i < word.length(); i++) {
			result += word.substring(word.length() - (i + 1), word.length() - i);
		}
		System.out.println(result);

//		String[] strArr = new String[word.length()];
//		String result = "";
//		
//		for(int i = 0; i < word.length(); i++) {
//			strArr[i] = Character.toString(word.charAt(i));
//		}
//		
//		for(int i = 0; i < word.length(); i++) {
//			if(i == word.length() - 1) {
//				strArr[i] = word.substring(word.length() - 1 - i);
//			}else {
//				strArr[i] = word.substring(word.length() - 1 - i, word.length() - i);
//			}
//		}
//		
//		for(int i = word.length() - 1; i >= 0; i--) {
//			result += strArr[i];
//		}
//		
//		System.out.println(result);

	}

}
