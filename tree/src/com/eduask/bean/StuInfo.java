package com.eduask.bean;
//用来和班级表拆箱装箱
public class StuInfo {
	private Integer stuNo;
    private String stuId;
    private String stuPass;
    private String stuName;
    private String stuSex;
    private String stuOri;
    private String stuNat; 
    private Integer stuAge;
    private String stuPhone;
    private Integer classId;
    private Integer stuState;
    private ClassInfo ci;
    
    public StuInfo(){
    	
    }
	
	public StuInfo(Integer stuNo, String stuId, String stuPass, String stuName,
			String stuSex, String stuOri, String stuNat, Integer stuAge,
			String stuPhone, Integer classId, Integer stuState, ClassInfo ci) {
		super();
		this.stuNo = stuNo;
		this.stuId = stuId;
		this.stuPass = stuPass;
		this.stuName = stuName;
		this.stuSex = stuSex;
		this.stuOri = stuOri;
		this.stuNat = stuNat;
		this.stuAge = stuAge;
		this.stuPhone = stuPhone;
		this.classId = classId;
		this.stuState = stuState;
		this.ci = ci;
	}

	public Integer getStuNo() {
		return stuNo;
	}

	public void setStuNo(Integer stuNo) {
		this.stuNo = stuNo;
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getStuPass() {
		return stuPass;
	}

	public void setStuPass(String stuPass) {
		this.stuPass = stuPass;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuSex() {
		return stuSex;
	}

	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}

	public String getStuOri() {
		return stuOri;
	}

	public void setStuOri(String stuOri) {
		this.stuOri = stuOri;
	}

	public String getStuNat() {
		return stuNat;
	}

	public void setStuNat(String stuNat) {
		this.stuNat = stuNat;
	}

	public Integer getStuAge() {
		return stuAge;
	}

	public void setStuAge(Integer stuAge) {
		this.stuAge = stuAge;
	}

	public String getStuPhone() {
		return stuPhone;
	}

	public void setStuPhone(String stuPhone) {
		this.stuPhone = stuPhone;
	}

	public ClassInfo getCi() {
		return ci;
	}

	public void setCi(ClassInfo ci) {
		this.ci = ci;
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public Integer getStuState() {
		return stuState;
	}

	public void setStuState(Integer stuState) {
		this.stuState = stuState;
	}

	@Override
	public String toString() {
		return "StuInfo [stuNo=" + stuNo + ", stuId=" + stuId + ", stuPass="
				+ stuPass + ", stuName=" + stuName + ", stuSex=" + stuSex
				+ ", stuOri=" + stuOri + ", stuNat=" + stuNat + ", stuAge="
				+ stuAge + ", stuPhone=" + stuPhone + ", classId=" + classId
				+ ", stuState=" + stuState + ", ci=" + ci + "]";
	}
    
}
