package mathclass.com;

public class Absolutevalue {
	public static void main(String[]args){
		double a=12.54;
		int b=534;
		double c=-17.32;
		System.out.println("absolute value"+Math.abs(a));
		System.out.println("absolute value"+Math.abs( b));
		System.out.println("absolute value"+Math.abs(c));
		
		System.out.println("ceiling value"+Math.ceil(a));
		System.out.println("ceiling value"+Math.ceil(b));
		System.out.println("ceiling value"+Math.ceil(c));
		
		System.out.println("cuberoot value"+Math.cbrt(10));
		System.out.println("cuberoot value"+Math.cbrt(625));
		
		System.out.println("exponential value of"+Math.exp(2));
		
		System.out.println("exponential values minus 1"+Math.expm1(25));
		
		System.out.println("floor value lower round figure"+Math.floor(42.21));
		
		System.out.println("copy sign of other int"+Math.copySign( 12, -1));
		
		System.out.println("max value between two numbers"+Math.max(45.21,87.21));
		System.out.println("min value between two numbers"+Math.min(45.21,87.21));
		
		System.out.println("2 to the power of 2"+Math.pow(2, 2));
		int x=10,y=10;
		System.out.println("length of hypotenues"+Math.hypot(x, y));
		
		System.out.println("exponent value f(x)=epower x is:"+Math.getExponent(15.0));
		
	}
}
