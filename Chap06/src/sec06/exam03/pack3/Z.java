package sec06.exam03.pack3; // Y 클래스랑 동일한 패키지

public class Z {

	Y y1 = new Y(10); // -> public 생성자 호출
	Y y2 = new Y(true); // -> default 생성자 호출
//	Y y3 = new Y("Y");	// -> private 생성자 호출	(error)

}
