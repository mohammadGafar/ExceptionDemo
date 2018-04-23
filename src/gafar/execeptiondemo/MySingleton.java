package gafar.execeptiondemo;

public class MySingleton {
	
	private MySingleton(){
		System.out.println("constructor singleton");
	}
	
	private static MySingleton instance;
	
	static{
		instance=new MySingleton();
	}
	
	public static MySingleton getInstance(){
        return instance;
    } 
	
	void display(){
		System.out.println("object created");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySingleton m=new MySingleton();
		m.display();
	}

}
