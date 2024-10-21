package key_words;


	class Father{
		char gender='M';
		int age =30;
		void print1() {
			System.out.println("hi");
			
		}
	}

class mother extends Father{
	char gender='f';
	 void print() {
		 System.out.println("hello");
		 super.print1();
	 }

 public static void main(String[]args) {
	Father f= new Father();
	f.print1();
	 mother M= new mother();
	M.print();
 }
}
