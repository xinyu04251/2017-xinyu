package com.eduask.bean;
//¿ÆÄ¿±í
public class SubInfo {
    private Integer subId;
    private String subName;
    
	public SubInfo() {
		
	}

	public SubInfo(Integer subId, String subName) {
		this.subId = subId;
		this.subName = subName;
	}

	public Integer getSubId() {
		return subId;
	}

	public void setSubId(Integer subId) {
		this.subId = subId;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	@Override
	public String toString() {
		return "SubInfo [subId=" + subId + ", subName=" + subName + "]";
	}
    
}
