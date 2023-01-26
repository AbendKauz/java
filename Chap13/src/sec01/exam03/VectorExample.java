package sec01.exam03;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		// -> Board ��ü�� �����ϴ� Vector ���� // �������� list
		// -> list�� ��ü �߰�
		// - "����1", "����1", "�۾���1" ���� ���� Board ��ü �߰�
		// - "����2", "����2", "�۾���2" ���� ���� Board ��ü �߰�
		// - "����3", "����3", "�۾���3" ���� ���� Board ��ü �߰�
		// - "����4", "����4", "�۾���4" ���� ���� Board ��ü �߰�
		// - "����5", "����5", "�۾���5" ���� ���� Board ��ü �߰�
		// -> �Ʒ��� ���� list �� ��� ��ü ���
		// <console>
		// ����1 ����1 �۾���1
		// ����2 ����2 �۾���2
		// ����3 ����3 �۾���3
		// ����4 ����4 �۾���4
		// ����5 ����5 �۾���5

		List<Board> list = new Vector<>();
		// 1.
//		list.add(new Board("����1", "����1", "�۾���1"));
//		list.add(new Board("����2", "����2", "�۾���2"));
//		list.add(new Board("����3", "����3", "�۾���3"));
//		list.add(new Board("����4", "����4", "�۾���4"));
//		list.add(new Board("����5", "����5", "�۾���5"));

		// 2.
		for (int i = 0; i < 5; i++) {
			list.add(new Board("����" + (i + 1), "����" + (i + 1), "�۾���" + (i + 1)));
		}

		for (Board board : list) {
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}

		System.out.println("============================================");
		// ============================================
		// -> 2, 3�� �ε��� ��ü ���� �� ���
		// <console>
		// ����1 ����1 �۾���1
		// ����2 ����2 �۾���2
		// ����4 ����4 �۾���4

		list.remove(2);
		list.remove(3);

		for (Board board : list) {
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}

	}

}
