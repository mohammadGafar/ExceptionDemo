package gafar.com;

import java.util.Arrays;

public class ArrayEquals {

	public static void main(String[] args) {
		String a[]={"java","perl",".net"};
		String b[]={"perl","java",".net"};
		String c[]={"java","perl",".net"};
		System.out.println("a is equals to b"+Arrays.deepEquals(a, b));
		System.out.println("b is equals to c"+Arrays.deepEquals(b, c));
		System.out.println("c equals to a"+Arrays.deepEquals(c, a));
	}

}
