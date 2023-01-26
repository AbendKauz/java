package sec06.exam03.pack4; // Y 클래스랑 패키지가 다름

import sec06.exam03.pack3.Y;

public class X {

	Y y1 = new Y(10); // -> public 생성자 호출
//	Y y2 = new Y(true);	// -> default 생성자 호출	(error)
//	Y y3 = new Y("Y");	// -> private 생성자 호출	(error)

}
