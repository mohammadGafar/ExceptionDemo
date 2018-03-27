package number.com;

import java.util.*;

public class ConvertNumberToWord {
	public void printWord(int num,String ch){
		String one[]={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twleve",
				       "thirteen","forteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String ten[]={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};
		if(num>19){
			System.out.println(ten[num/10]+" "+one[num%10]);
		}
			else{
				System.out.println(one[num]);
		}
			if(num>0){
				System.out.println(ch);
				
			}
	}

	public static void main(String[] args) {
		
		int num=0;
		Scanner scanf = new Scanner(System.in);
		System.out.println("enter an integer");
		num=scanf.nextInt();
		
		if(num<=0){
			System.out.println("enter number greater zero");
		}
		else
		{
			ConvertNumberToWord a=new ConvertNumberToWord();
			a.printWord((num/1000000000),"hundred");
			a.printWord(((num/10000000)%100),"crore");
			a.printWord(((num/100000)%100),"lakh");
			a.printWord(((num/1000)%100),"thousand");
			a.printWord(((num/100)%10),"hundred");
			a.printWord((num%100),"  ");
			
		}
		
	}

}
