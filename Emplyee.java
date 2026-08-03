package com.thiskeyword;

public class Emplyee {
	
	public String empName;
	public String empDesg;
	
	public String getEmpName() {
		return empName;
	}
	public String GetempDesg() {
		return empDesg;
	}
	public void setEmpName(String empName) {
		this.empName=empName;	
		}
	public void setEmpdesg(String empDesg) {
		this.empDesg=empDesg;	
		}
	
	public void showData() {
		System.out.println("employee Name:"+ empName);
		System.out.println("employee Desg:"+ empDesg);
	}

	
}
