package com.kprit.tns.oops;

public class StudentDemo {
	private int sid;
	private String sname;
	
	public int getSid() {
		return sid;
	}
	
	public void setSid(int sid) {
		this.sid=sid;
	}
	
	public String getSname() {
		return sname;
		
	}
	
	public void setSname(String sname) {
		this.sname=sname;
	}
	
	public void display() {
		System.out.print("The Students details are :"+ sid + sname);
		
	}

}
