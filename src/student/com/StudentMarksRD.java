package student.com;

import java.util.Scanner;

public class StudentMarksRD {
	
	/*int student[];
	StudentMarksRD(){
	}
		public void getStudentMarks(){
			System.out.println("enter student details");
			
		}
		
		public void displayStudentsMarks(){
			for(int i=0;i<10;i++){
				System.out.println("students marks"+student);
				
			}
	}*/

	public static void main(String[] args) {
		
		String name;
		int rollno,eng;
		Scanner SC=new Scanner(System.in);
		int j=10;
		for(int i=0;i<j;i++){
		
		System.out.print("enter name");
		name=SC.nextLine();	
		
		System.out.print("enter rollno");
		rollno=SC.nextInt();
		
		System.out.print("enter eng marks");
		eng=SC.nextInt();
		
		System.out.println(rollno);
		System.out.println(name);
		System.out.println(eng);
		
		}
		
	}

}
