package integerwrraperclass.com;

public class BinaryToInteger {

	public static void main(String[] args) {
		
		String binary="101011";
		Integer i=Integer.parseInt(binary,2);
		System.out.println(i);
		
		
		 String hex = "FF23";
	        Integer j = Integer.parseInt(hex,16);
	        System.out.println("Integer value: "+j);
	        
	        String octal = "7776";
	        Integer k = Integer.parseInt(octal,8);
	        System.out.println("Integer value: "+k);
	        
	        String str = "adef";
	        Integer l = Integer.parseInt(str,27);
	        System.out.println("Integer value: "+l);
	}

}
