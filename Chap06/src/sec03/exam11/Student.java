package sec03.exam11;

public class Student {

	// 1. Student Ŭ���� �ۼ� (���������� private )

	private String name;
	private String number;
	private int age;
	private int javaScore;
	private int webScore;
	private int pythonScore;

	// ������

	public Student(String name, String number, int age, int javaScore, int webScore, int pythonScore) {
		this.name = name;
		this.number = number;
		this.age = age;
		this.javaScore = javaScore;
		this.webScore = webScore;
		this.pythonScore = pythonScore;
	}

	// �޼ҵ�
	// 1. �ʵ尪�� ����, �ʵ尪�� ���� �� �ִ� �޼ҵ� ����

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

	// 2. toString( ) �޼ҵ� �������̵�
	// <console>
	// �̸� : ȫ�浿, �й� : 20220123, ���� : 20, java ���� :40, web ���� :50, python ���� :60

	@Override
	public String toString() {
		String str = "�̸� : " + name + ", �й� : " + number + ", ���� : " + age + ", java ���� : " + javaScore + ", web ���� : "
				+ webScore + ", python ���� : " + pythonScore;
		return str;
//		return "�̸� : " + name + ", �й� : " + number + ", ���� : " + age
//				+ ", java ���� : " + javaScore
//				+ ", web ���� : " + webScore + ", python ���� : " + pythonScore;

	}

}
