package io.spring.tutorial.part02.collectioninjectionannotation.model;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("ciaModel")
public class CIAnnotationModel {

	@Resource(name = "utilAnnotationList")	// @Resource is in javax.annatotation package
	// When we inject to a collection, we use @Resource or @Value instead of @Autowired
	private List<String> nameList;

	@Value(value = "#{utilAnnotationMap}")	// @Value is in org.springframework.beans.factory.annotation.Value package
	private Map<String, Integer> idNameList;

	public List<String> getNameList() {
		return nameList;
	}

	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}

	public Map<String, Integer> getIdNameList() {
		return idNameList;
	}

	public void setIdNameList(Map<String, Integer> idNameList) {
		this.idNameList = idNameList;
	}

	@Override
	public String toString() {
		return "CIModel [nameList=" + nameList + ", idNameList=" + idNameList + "]";
	}
}
