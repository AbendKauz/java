package sec03.exam11;

public class Student {

	// 1. Student 클래스 작성 (접근제한자 private )

	private String name;
	private String number;
	private int age;
	private int javaScore;
	private int webScore;
	private int pythonScore;

	// 생성자

	public Student(String name, String number, int age, int javaScore, int webScore, int pythonScore) {
		this.name = name;
		this.number = number;
		this.age = age;
		this.javaScore = javaScore;
		this.webScore = webScore;
		this.pythonScore = pythonScore;
	}

	// 메소드
	// 1. 필드값을 변경, 필드값을 읽을 수 있는 메소드 생성

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public String getNumber() {
//		return number;
//	}
//	
//	public void setNumber(String number) {
//		this.number = number;
//	}
//	
//	public int getAge() {
//		return age;
//	}
//	
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//	public int getJavaScore() {
//		return javaScore;
//	}
//	
//	public void setJavaScore(int javaScore) {
//		this.javaScore = javaScore;
//	}
//	
//	public int getWebScore() {
//		return webScore;
//	}
//	
//	public void setWebScore(int webScore) {
//		this.webScore = webScore;
//	}
//	
//	public int getPythonScore() {
//		return pythonScore;
//	}
//	
//	public void setPythonScore(int pythonScore) {
//		this.pythonScore = pythonScore;
//	}

	// 2. toString( ) 메소드 오버라이딩
	// <console>
	// 이름 : 홍길동, 학번 : 20220123, 나이 : 20, java 점수 :40, web 점수 :50, python 점수 :60

	@Override
	public String toString() {
		String str = "이름 : " + name + ", 학번 : " + number + ", 나이 : " + age + ", java 점수 : " + javaScore + ", web 점수 : "
				+ webScore + ", python 점수 : " + pythonScore;
		return str;
//		return "이름 : " + name + ", 학번 : " + number + ", 나이 : " + age
//				+ ", java 점수 : " + javaScore
//				+ ", web 점수 : " + webScore + ", python 점수 : " + pythonScore;

	}

}
