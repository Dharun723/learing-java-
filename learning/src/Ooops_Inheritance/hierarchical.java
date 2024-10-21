package Ooops_Inheritance;
class Parent{ 
    
	void soft(int r)
		{
			System.out.println(r);
		}
	}

  class Child1 extends Parent{
	  
	  void coo (int l)
	  {
		  System.out.println(l);
	  }
	  
	  
  }

  class Child2 extends Parent{
	 
	  void pm( int m)
	  {
		  System.out.println(m);
	  }
  }

public class hierarchical {
public static void main (String [] args) {
	Child1 c1=new Child1();
	 c1.coo(100);
	 c1.soft(3);
	 Child2 c2=new Child2();
	 c2.pm(200);
	 c2.pm(30);
}
}
