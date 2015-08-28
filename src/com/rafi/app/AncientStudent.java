package com.rafi.app;

public class AncientStudent {

	private String name;

	public AncientStudent() {
	}

	public AncientStudent(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void hanashi(){
		
		System.out.println("Ami "+ name);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	

}
