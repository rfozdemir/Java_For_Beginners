package Beginner.day48_MethodOverRiding;

class student{
	
	public void printName() { 
		System.out.println("Alen");
	}
	
	
}


public class MethodOverriding extends student {
//				sub  					super
		
	public void print(String str) {
		
	}
	
	public void print(double a) {
		
	}
	
	// public void print(String str) {  }   overriding cannot happen in the same class
	
	public void printName() {
		System.out.println("shukran");
	}
	
	
	public static void main(String[] args) {
		
				
		student obj2 = new student();
				obj2.printName();  // Alen
				
		MethodOverriding obj = new MethodOverriding();
				obj.printName();   // shukran
		
		
	}
	

}
