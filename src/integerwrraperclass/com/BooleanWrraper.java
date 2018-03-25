package integerwrraperclass.com;

public class BooleanWrraper {

	public static void main(String[] args) {
	/*	boolean b=false;
		Boolean ob= new Boolean(b);
		System.out.println(ob);
		Boolean obj=new Boolean(true);
		System.out.println(obj);
		System.out.println(ob.booleanValue());*/
		
		String str="true";
		Boolean bl=Boolean.parseBoolean(str);
		System.out.println("str booleam"+bl);
		
		
		System.out.println(Boolean.FALSE);
		System.out.println(Boolean.TRUE);
	}

}
