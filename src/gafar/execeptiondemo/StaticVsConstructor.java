package gafar.execeptiondemo;

public class StaticVsConstructor {
	public StaticVsConstructor(){
		System.out.println("am in constructor");
	}
	
	static{
		
		System.out.println("static block");
		System.out.println("static block executed only once");
		System.out.println("before constructor static block will be called first");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVsConstructor s=new StaticVsConstructor();
		StaticVsConstructor s1=new StaticVsConstructor();
	}

}
