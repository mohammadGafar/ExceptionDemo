package loops.com;

public class EnumDemo {
	
	
	private Fruits myFruit;
	
	EnumDemo(Fruits fruit){
		this.myFruit=fruit;
	}
	public void fruitDes(){
		
		switch(myFruit){
		case BANANA:
			System.out.println("HIGH IN FIBER");
			break;
		
		case APPLE:
			System.out.println("KEEPS AWAY FROM DOCYOR");
			break;
		case ORANGE:
			System.out.println("RICH IN VITAMINS");
			break;
		case PAPPAYA:
			System.out.println("ITS READUCE BODY HEAT");
			break;
			
		default:
			System.out.println("no desc available");
		}	
	}
	public static void main(String[] args) {
		EnumDemo apple=new EnumDemo(Fruits.APPLE);
		apple.fruitDes();
		EnumDemo banana=new EnumDemo(Fruits.BANANA);	 
		banana.fruitDes();
		EnumDemo pappaya=new EnumDemo(Fruits.PAPPAYA);
		pappaya.fruitDes();
		EnumDemo orange=new EnumDemo(Fruits.ORANGE);
		orange.fruitDes();
		
		
	}
}
enum Fruits{APPLE,BANANA,ORANGE,PAPPAYA
}