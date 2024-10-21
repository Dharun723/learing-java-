package Ooops_interface;
 interface a{
	int lengths=20;
	int height=30;
	void method (); // abstract
	default void d()
	{
	 System.out.println("this is square");
	}
	static void b() 
	{
		System.out.println("this is rectangle");
	}
     class interpro implements a{
	public void display ()
	{
		System.out.println("hello world");
		
	}
	void triangle()
	{
		System.out.println("hello dharun");
		
	}
 public class interpo{
 public static void main(String []args){
 	interpro object= new interpro ();
	object.display();
}
     
 }

	




