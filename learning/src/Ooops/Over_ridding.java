package Ooops;
class a{
	void display(String name) {
		{
			System.out.println(name);
		}
	}
}
class B extends a 
{
   void display(String name) {
	   {
		  System.out.println(name);
	   }
	}
}
class c extends a
{
	 void display(String name) {
		 {
			 System.out.println(name);
		}
}
}
public class Over_ridding {
public static void main (String  []args) {
	a obj0= new a();
	obj0.display("abishek");
	B obj1=new B();
	 obj1.display("dharun");
	 
	 c obj2=new c();
	  obj2.display("vikky");
	  
	}

}
