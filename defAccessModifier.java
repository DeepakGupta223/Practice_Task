package com.PracticeProjectTask.sys;

class defAccess{
	void display(){
		System.out.println("you are using Default access modifier");
	}
}
public class defAccessModifier {

	public static void main(String[] args) {
		System.out.println("Default access modifier");
		// TODO Auto-generated method stub
		defAccess s = new defAccess();
		s.display();
	}

}
