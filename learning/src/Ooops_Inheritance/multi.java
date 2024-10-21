package Ooops_Inheritance;
class a{ 
    int f;
	void soft()
		{
			System.out.println(f);
		}
	}

  class j extends a{
	  int e;
	  void coo ()
	  {
		  System.out.println(f+e);
	  }
	  
	  
  }

  class c extends j{
	  int g;
	  void pm()
	  {
		  System.out.println(g);
	  }
  }
      public class multi{
	  public static void main(String []args )
	  {
		  c obj=new c();
		  obj.f=30;
		  obj.e=40;
		  obj.g=50;
		  obj.soft();
		  obj.coo();
		  obj.pm();
		  
	  }
      }


