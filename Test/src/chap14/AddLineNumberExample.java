package chap14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class AddLineNumberExample {

	public static void main(String[] args) throws Exception {

		String filePath = "src/chap14/AddLineNumberExample.java";

		FileReader fr = new FileReader(filePath); // ����ó��
		// BufferedReader -> ������� ���� ��Ʈ��
		// -> ���α׷��� ���� ������ ��������
		// -> readLine() : ���δ����� ���ڿ��� �о���� �޼ҵ�

		BufferedReader br = new BufferedReader(fr);

		int cnt = 1;
		String str = "";
		while (true) {
			str = br.readLine();
			if (str == null) {
				break;
			}
			System.out.println(cnt++ + ": " + str);
		}
		br.close();
		fr.close();

	}

}
