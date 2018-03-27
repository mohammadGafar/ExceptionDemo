package student.com;

public class studentResult {

	public static void main(String[] args) {
		
       Student[] stuobj = new Student[2];
       for(int i=0;i<2;i++){
    	   stuobj[i] = new Student();
    	 //  stuobj[i].read();
       }
		 
    /*   for(int i=0;i<2;i++){
    	   stuobj[i].display();
       }
		/*switch(total){
		
		case total>=500: System.out.println("passed with distinction"); break;
		case total>=400 && total<500: System.out.println("passed with 1st class"); break;
		case total>=300 && total<400:	System.out.println("passed with 2nd class"); break;
		case total>=250 && total<300: System.out.println("passed with 3rd class"); break;
		default: System.out.println("failed");
		
		}*/
	}

}
