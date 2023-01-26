package sec01.exam03;

public class Button {

	OnclickListener listener; // �������̽� Ÿ���� �ʵ�

	void setOnClickListener(OnclickListener listener) {
		this.listener = listener;
	}

	void touch() { // ȣ���� �޼ҵ�
		listener.onClick(); // ������ü�� onclick() �޼ҵ� ȣ��
	}

	static interface OnclickListener { // ��ø �������̽�
		void onClick();
	}

}
