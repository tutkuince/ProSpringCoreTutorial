package io.spring.tutorial.part02.collectioninjection.model;

public class Student {
	private String studentNo;
	private String fullName;

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", fullName=" + fullName + "]";
	}

}
