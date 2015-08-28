package com.rafi.app;

public class Main {

	public static void main(String[] args) {

		Teacher teacher = new Teacher();
		teacher.setName("Wise teacher");
		System.out.println("I am a " + teacher.getName());
			
		AncientStudent student = new AncientStudent("Moga");
		student.hanashi();

	}

}
