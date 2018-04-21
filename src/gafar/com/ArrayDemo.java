package gafar.com;

public class ArrayDemo {
	int a[];
	int b[]={1,2,3};
	int account_no[]=new int[10];
	
	void display(){
		System.out.println(a);
		System.out.println(b[1]);
		System.out.println(account_no[9]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDemo ar=new ArrayDemo();
		ar.display();
	}

}
