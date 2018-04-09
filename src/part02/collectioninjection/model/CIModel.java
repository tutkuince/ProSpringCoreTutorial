package io.spring.tutorial.part02.collectioninjection.model;

import java.util.List;
import java.util.Map;

// Collection Injection(CI)
public class CIModel {
	private List<String> nameList;
	private List<Student> studentList;

	private Map<String, Integer> idNameList;

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

	public Map<String, Integer> getIdNameList() {
		return idNameList;
	}

	public void setIdNameList(Map<String, Integer> idNameList) {
		this.idNameList = idNameList;
	}

	@Override
	public String toString() {
		return "CIModel [nameList=" + nameList + ", studentList=" + studentList + ", idNameList=" + idNameList + "]";
	}

}
