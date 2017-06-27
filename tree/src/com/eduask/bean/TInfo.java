package com.eduask.bean;
//ΩÃ ¶±Ì
public class TInfo {
	private Integer tNo;
    private Integer tId;
    private String tPass;
    private String tName;
    private String tSex;
    private String tOri;
    private String tNat; 
    private Integer tAge;
    private String tPhone;
    private String eduBac; 
    private Integer subId;
    private Integer roleId;
    private Integer tState;
    
    public TInfo(){
    	
    }

	public TInfo(Integer tNo, Integer tId, String tPass, String tName,
			String tSex, String tOri, String tNat, Integer tAge, String tPhone,
			String eduBac, Integer subId, Integer roleId, Integer tState) {
		super();
		this.tNo = tNo;
		this.tId = tId;
		this.tPass = tPass;
		this.tName = tName;
		this.tSex = tSex;
		this.tOri = tOri;
		this.tNat = tNat;
		this.tAge = tAge;
		this.tPhone = tPhone;
		this.eduBac = eduBac;
		this.subId = subId;
		this.roleId = roleId;
		this.tState = tState;
	}

	public Integer gettNo() {
		return tNo;
	}

	public void settNo(Integer tNo) {
		this.tNo = tNo;
	}

	public Integer gettId() {
		return tId;
	}

	public void settId(Integer tId) {
		this.tId = tId;
	}

	public String gettPass() {
		return tPass;
	}

	public void settPass(String tPass) {
		this.tPass = tPass;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public String gettSex() {
		return tSex;
	}

	public void settSex(String tSex) {
		this.tSex = tSex;
	}

	public String gettOri() {
		return tOri;
	}

	public void settOri(String tOri) {
		this.tOri = tOri;
	}

	public String gettNat() {
		return tNat;
	}

	public void settNat(String tNat) {
		this.tNat = tNat;
	}

	public Integer gettAge() {
		return tAge;
	}

	public void settAge(Integer tAge) {
		this.tAge = tAge;
	}

	public String gettPhone() {
		return tPhone;
	}

	public void settPhone(String tPhone) {
		this.tPhone = tPhone;
	}

	public String getEduBac() {
		return eduBac;
	}

	public void setEduBac(String eduBac) {
		this.eduBac = eduBac;
	}

	public Integer getSubId() {
		return subId;
	}

	public void setSubId(Integer subId) {
		this.subId = subId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer gettState() {
		return tState;
	}

	public void settState(Integer tState) {
		this.tState = tState;
	}

	@Override
	public String toString() {
		return "TInfo [tNo=" + tNo + ", tId=" + tId + ", tPass=" + tPass
				+ ", tName=" + tName + ", tSex=" + tSex + ", tOri=" + tOri
				+ ", tNat=" + tNat + ", tAge=" + tAge + ", tPhone=" + tPhone
				+ ", eduBac=" + eduBac + ", subId=" + subId + ", roleId="
				+ roleId + ", tState=" + tState + "]";
	}

	
	
}
