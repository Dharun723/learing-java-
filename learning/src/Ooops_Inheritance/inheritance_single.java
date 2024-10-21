package Ooops_Inheritance;

 class in { 

	int a;
	void ec()
		{
			System.out.println(a);
		}
	}

  class b extends in{
	  int c;
	  void group()
	  {
		  System.out.println(c+a);
	  }
  }
   
 public	 class inheritance_single{
 public static void main(String []args ) 
 {
              b d=new b();
               d.c=20;
               d.a=10;
              d.ec();
              d.group();
              
 }

 }
