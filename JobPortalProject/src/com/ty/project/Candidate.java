package com.ty.project;

public class Candidate {
	String name;
	int per;
	String gender;
	
	public Candidate(String name,int per,String gender) {
		this.name=name;
		this.per=per;
		this.gender=gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPer() {
		return per;
	}

	public void setPer(int per) {
		this.per = per;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public String toString() {
		return name+"\t\t"+per+"\t\t"+gender;
	}

}
