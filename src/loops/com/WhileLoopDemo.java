package loops.com;

public class WhileLoopDemo {
	
	void display(int i){
//	int i=0;
	do{
		System.out.println(i);
		i++;
	}while(i<3);
	}

	public static void main(String[] args) {
		WhileLoopDemo w=new WhileLoopDemo();
		w.display(0);
			int i=1;
		while(i<10){
			System.out.println(i);
			i++;
		}
		
		
		
	}


}