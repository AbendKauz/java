package sec06.exam03.pack3;

public class Y {

	// 필드
	Y y1 = new Y(10); // -> public 생성자 호출
	Y y2 = new Y(true); // -> default 생성자 호출
	Y y3 = new Y("Y"); // -> private 생성자 호출

	// 생성자
	public Y(int a) {
	} // public 접근제한

	Y(boolean a) {
	} // default 접근제한

	private Y(String a) {
	} // private 접근제한

}
