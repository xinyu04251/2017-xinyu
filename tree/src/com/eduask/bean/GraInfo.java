package com.eduask.bean;

import java.util.Set;

//Äê¼¶±í
public class GraInfo {
	private Integer graId;
	private String graName;
	private Set<ClassInfo> claSet;
	
	public GraInfo() {
		
	}
	
	public GraInfo(Integer graId, String graName, Set<ClassInfo> claSet) {
		super();
		this.graId = graId;
		this.graName = graName;
		this.claSet = claSet;
	}

	public Integer getGraId() {
		return graId;
	}
	public void setGraId(Integer graId) {
		this.graId = graId;
	}
	public String getGraName() {
		return graName;
	}
	public void setGraName(String graName) {
		this.graName = graName;
	}
	
	public Set<ClassInfo> getClaSet() {
		return claSet;
	}

	public void setClaSet(Set<ClassInfo> claSet) {
		this.claSet = claSet;
	}

	@Override
	public String toString() {
		return "GraInfo [graId=" + graId + ", graName=" + graName + ", claSet="
				+ claSet + "]";
	}
	
}
