package classesobjectsandmembers;

public class Constructors {

	String name;
	int id;
	int salary;
	
	//Same name as Class name, No Return type, Can be overloaded
	public Constructors(String uname, int uid) {
		this.name = uname;
		this.id = uid;
	}
	
	public Constructors(String uname, int uid, int cash) 
	{
		this(uname,uid); //Reference to 'this' must be done in first statement
		salary = cash;
		//this(uname, uid, cash);//Recursive constructor invocation is not allowed
		//this(uname,uid); This one throws error. Also only one this constructor call per class
	}
	d
	public static void main(String args[]) {
		
		Constructors varun = new Constructors("Varun", 5047841, 24200);
		System.out.println("Name is "+varun.name+", Id is "+varun.id+" and Salary is "+varun.salary);
	}
}
