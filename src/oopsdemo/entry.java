package oopsdemo;

public class entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		tree t =new tree();
		int i=10;
		t.method1(i);
		System.out.println(i);
		
		fruit f= new fruit();
		fruit f1= new fruit();
		
		
		f.scolour="red";
		t.method2(f);
		System.out.println(f.scolour);  // we are passing the object to referencde 
		
		System.out.println(f1.scolour);
	}

}
