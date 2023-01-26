package sec06.exam02.mycompany;

// import문 - 외부 패키지안의 클래스 사용
// ctrl + shift + o : import
import sec06.exam02.hankook.*;
import sec06.exam02.hankook.Tire;
import sec06.exam02.kumho.*;
import sec06.exam02.hyundai.Engine; // 외부 패키지 안의 클래스 사용

public class Car {

	Engine eng = new Engine();
	SnowTire tire1 = new SnowTire();
	Tire tire2 = new Tire();

	BigWidthTire tire3 = new BigWidthTire();

	// * 경우에 따라서 import문과 상관없이 패키지가 포함된 클래스 전체 이름을 기술
	// -> 서로 다른 패키지에 동일한 이름의 클래스가 있다면 + 두 패키지가 모두 import
	// 컴파일러가 어떤 패키지의 클래스를 쓰는 것인지 애매모호함 --> 컴파일에러
	// 해결법 : 정확하게 패키지가 포함된 클래스 전체 이름을 기술
	sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire();

	// * import문
	// -> 사용하고자 하는 클래스 또는 인터페이스가 다른 패키지에 소속되어 있을 경우
	// import문으로 해당 패키지의 클래스 또는 인터페이스를 가져와 사용할 것임을 알려주는 기능
	// -> 개수에 제한이 없이 얼마든지 사용 가능함.

	// * 주의할 점
	// --> 상위 패키지를 import 했다고 하위패키지까지 import되는 것은 아님
	// 하위 패키지 안의 클래스도 사용하겠다는 import문 따로 작성

	// * import문 작성방법
	// import 상위패키지.하위패키지.클래스이름;
	// import 상위패키지.하위패키지.*;
	// -> 개별적으로 모든 클래스에 해당하는 import문을 작성하는 것보다는
	// * 를 이용해서 해당 패키지 내에 소속된 모든 클래스들을 사용할 것임을 알려주기

}
