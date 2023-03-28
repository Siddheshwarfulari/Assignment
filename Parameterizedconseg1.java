import Method.User_defined3;

public class Parameterizedconseg1 {
		int age;
		String name;


		Parameterizedconseg1 (int a,String n){
		age=a;
		name=n;
		}
		void show() {
			System.out.println(age+" "+name);
			}
		public static void main(String[] args) {
			
			Parameterizedconseg1 d=new Parameterizedconseg1(39,"Asitosh");
			Parameterizedconseg1 d1=new Parameterizedconseg1(29,"Manoj");
			Parameterizedconseg1 d2=new Parameterizedconseg1(58,"Santhosh");
			Parameterizedconseg1 d3=new Parameterizedconseg1(48,"Buman");
			Parameterizedconseg1 d4=new Parameterizedconseg1(36,"Gopal");
		d.show();
		d1.show();
		d2.show();
		d3.show();
		d4.show();
	
		}
}
