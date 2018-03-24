package loops.com;

public class EnumOvverrideToString {
	
/*	enum Season{winter,summer}
	public static void main(String[] args) {
		for(Season s:Season.values( )){
			System.out.println(s);
		}
	}*/
	enum Season{
		WINTER{
			public String toString(){
				return "winter season now";
			}
		},
		SUMMER{
			public String toString(){
				return "summer to hot now";
			}
		},
		SPRING{
			public String toString(){
				return "spring now";
			}
		}
	}
	public static void main(String [] args){
		System.out.println(Season.SUMMER);
		System.out.println(Season.WINTER);
		System.out.println(Season.SPRING);
	}

}
