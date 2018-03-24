package integerwrraperclass.com;

public class IntegerToBinary {

	public static void main(String[] args) {
		Integer  i=new Integer(10);
		String binary=Integer.toBinaryString(i);
		System.out.println(binary);
		
		String hexa=Integer.toHexString(i);
		System.out.println(hexa);
		
		String octa=Integer.toOctalString(i);
		System.out.println(octa);
	}

}
