package gafar.execeptiondemo;

public class VariableScopeDemo {
	int rollnumber=1;
	static int salary=1000;
	
	{System.out.println("output from block");}
	
	static {
		System.out.println("static block");
	}
	
	void display(int x){
		this.rollnumber=x;
		salary=2000;
		System.out.println(rollnumber);
		System.out.println(salary);
		System.out.println(this.rollnumber);
	}
	
	static void staticDisplay(){
		
		System.out.println(salary);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableScopeDemo v=new VariableScopeDemo();
		v.display(2);
		VariableScopeDemo.staticDisplay();
	}

}
