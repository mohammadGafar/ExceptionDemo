package loops.com;

public class ContinueBreak {
	ContinueBreak(){
	for(int j=1;j<10;j++){
		if(j==6){
			System.out.println("j values"+j);
			break;
		}
		System.out.println(j);
	}
	}

	public static void main(String[] args) {
		
		ContinueBreak cb=new ContinueBreak();
		for(int i=0;i<10;i++){
			
			
			if(i%2==0){
				continue;
			}
				System.out.println(i );
		}
	}

}
