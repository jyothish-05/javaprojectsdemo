package vcubeprojects;

public class Employee {
	int employeeID;
	String employeeName;
	int salary;
	int experience;
	char grade;
	boolean PS;
	
	void display() {
		System.out.println("EmployeeID: "+employeeID);
		System.out.println("EmployeeName: "+ employeeName);
		System.out.println("Salary: "+salary);
		System.out.println("Experience: "+experience+" years");
		System.out.println("Grade: "+grade);
		if(PS)
		System.out.println("Permanent");
		else
			System.out.println("Temporary");
		System.out.println();
	}
	
	

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.employeeID=111;
		e1.employeeName="vijay";
		e1.salary=35000;
		e1.experience=3;
		e1.grade='B';
		e1.PS=false;
		
		Employee e2 = new Employee();
		e2.employeeID=112;
		e2.employeeName="raju";
		e2.salary=55000;
		e2.experience=5;
		e2.grade='A';
		e2.PS=true;
		
		Employee e3 = new Employee();
		e3.employeeID=125;
		e3.employeeName="ashok";
		e3.salary=65000;
		e3.experience=7;
		e3.grade='A';
		e3.PS=true;
		
		e1.display();
		e2.display();
		e3.display();

	}

}
