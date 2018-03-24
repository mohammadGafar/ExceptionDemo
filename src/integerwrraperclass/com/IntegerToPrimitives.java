package integerwrraperclass.com;

public class IntegerToPrimitives {

	public static void main(String[] args) {
		Integer it=new Integer(10);
		System.out.println("byte value"+it.byteValue());
		System.out.println("int value"+it.intValue());
		System.out.println("short value"+it.shortValue());
		System.out.println("long value"+it.longValue());
		System.out.println("double value"+it.doubleValue());
		System.out.println("float value"+it.floatValue());
		System.out.println("hash value"+it.hashCode());
	}

}
