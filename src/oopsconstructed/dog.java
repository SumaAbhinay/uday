package oopsconstructed;

public class dog {

	String sdogname;
	
	int a=50;
	
	dog(){  // ----> constructor
		// constructor will have the same class name .this is a special metod in java 
		// ther is no retuen type in constructor
		
		System.out.println("dog constructor called");
		
}
	
	public void sound(){
		
		
		System.out.println("dog sound");
	}
	
	public  int add(int a, int b) {
		return this.a+b; // when we use this keyword it will be reffered to the same class.and this can also used to invoke 
		                    // current class methods as well
	}
	
}
