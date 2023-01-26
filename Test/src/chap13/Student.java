package chap13;

import java.util.Objects;

public class Student {

	public int studentNum;
	public String name;

	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return (student.studentNum == studentNum) && (student.name.equals(name));
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash();
	}

}
