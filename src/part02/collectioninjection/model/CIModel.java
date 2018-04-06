package io.spring.tutorial.part02.collectioninjection.model;

import java.util.List;

public class CIModel {
	private List<String> nameList;
	private List<Student> studentList;

	public List<String> getNameList() {
		return nameList;
	}

	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		return "CIModel [nameList=" + nameList + ", studentList=" + studentList + "]";
	}

}
