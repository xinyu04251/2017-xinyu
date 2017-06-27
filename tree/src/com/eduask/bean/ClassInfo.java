package com.eduask.bean;

import java.util.Set;

public class ClassInfo {
	private Integer classId;
	private String className;
	private Set<StuInfo> stuSet;
	private 
	
	public ClassInfo() {
	}
	
	public ClassInfo(Integer classId, String className, Set<StuInfo> stuSet) {
		super();
		this.classId = classId;
		this.className = className;
		this.stuSet = stuSet;
	}

	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}

	public Set<StuInfo> getStuSet() {
		return stuSet;
	}

	public void setStuSet(Set<StuInfo> stuSet) {
		this.stuSet = stuSet;
	}

	@Override
	public String toString() {
		return "ClassInfo [classId=" + classId + ", className=" + className
				+ ", stuSet=" + stuSet + "]";
	}
    
}
