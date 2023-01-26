package sec01.exam03;

public class Button {

	OnclickListener listener; // 인터페이스 타입의 필드

	void setOnClickListener(OnclickListener listener) {
		this.listener = listener;
	}

	void touch() { // 호출할 메소드
		listener.onClick(); // 구현객체의 onclick() 메소드 호출
	}

	static interface OnclickListener { // 중첩 인터페이스
		void onClick();
	}

}
