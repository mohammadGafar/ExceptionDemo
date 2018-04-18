package mathclass.com;

public class MathClassVariable {

	public static void main(String[] args) {
		System.out.println("natural value of algorithm is "+Math.log(2.0));
		
		System.out.println("base 10 alogorithm value of 2 is "+Math.log10(2));
		
		System.out.println(""+Math.nextAfter(10,5));
		
		System.out.println(""+Math.nextUp(10));
		
		System.out.println("gets random vallue b/w 0.0 to 1.0"+Math.random());
		
		System.out.println(" closest value to argument equal to integer."+Math.rint(32.456));
		
		System.out.println("round figure value is  "+Math.round(12.8));
		
		System.out.println(+Math.sqrt(25));
		
		
		 System.out.println("signum value of 20.23 is: "+Math.signum(20.23));
	        System.out.println("signum value of 0 is: "+Math.signum(0));
	        System.out.println("signum value of -20.23 is: "+Math.signum(-20.23));
	        
	        System.out.println("Value of sin(90) is: "+Math.sin(90));
	        System.out.println("Value of sin(45) is: "+Math.cos(45));
	        System.out.println("Value of sin(30) is: "+Math.tan(30));
	}

}
