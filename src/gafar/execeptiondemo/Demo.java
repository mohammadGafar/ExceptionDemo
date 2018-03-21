package gafar.execeptiondemo;

public class Demo {
	int number;
	byte x;
	short length;
	long distance;
	float percentage;
	double total;
	char name;
	String vol;
	int a[][]={{1,0},{0,1}};
	public void display(){
		System.out.println(number);
		System.out.println(x);
		System.out.println(length);
		System.out.println(distance);
		System.out.println(percentage);
		System.out.println(total);
		System.out.println(name);
		System.out.println(vol);
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++)
			{
		System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		d.display();
	}

}
