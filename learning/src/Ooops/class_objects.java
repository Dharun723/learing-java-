package Ooops;
public class class_objects {
  int eid;
  String name;
  String job;
  String sal;
  void display()
  {
	  System.out.println(eid);
	  System.out.println(name);
	  System.out.println(job);
      System.out.println(sal);
  }
    public static void main(String[] args) {
    	class_objects emp1=new class_objects();
        
        emp1.eid=101;
        emp1.name="john";
        emp1.job="manual"; 
        emp1.sal="10";
        emp1.display();
    }
}



