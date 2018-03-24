package loops.com;

public class EnumCustomConstructor {
	
	enum Department{
		ACCOUNTS(10),HR(7),IT(5);
		
		private int deptId;
	Department(int id){
		deptId=id;
	}
	public int getDeptId(){
		return deptId;
	}
	}
	public static void main(String[] args) {
		System.out.println(Department.ACCOUNTS.getDeptId());
		System.out.println(Department.HR.getDeptId());
		System.out.println(Department.IT.getDeptId());
	}
	}

