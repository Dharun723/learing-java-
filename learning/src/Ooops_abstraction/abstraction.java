package Ooops_abstraction;

abstract class computer {
	void turn() {
		System.out.println("turn on");
		}
  
}

class hp extends computer{

}
class dell extends computer{
	void turn1( ) {
		System.out.println("turn off");
		}
}
public class abstraction{
public static void main (String []args) {
	hp ob =new hp();
	ob.turn();
	dell ob1=new dell();
	ob1.turn1();
}
	
}