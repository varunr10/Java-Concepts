package classesobjectsandmembers;

/**********	JAVA IS ALWAYS PASS BY VALUE	********** */
public class PassByValue {

	String name = "Dwight Shrute";
	public static void main(String args[]) {
		
		int id = 100;
		updateId(id);
		System.out.println("value of id is --> "+id);
		//Still id = 100 because for Primitive data type, a copy is made in the function that is called. 
		
		PassByValue obj = new PassByValue();
		updateName(obj);
		System.out.println("Name of Employee is -->"+obj.name);
		// Name is updated because, for objects the memory address is passed to the function that is called.
		// In the function, the updation is made to the memory address object. The old object also points to the same address
	
	}

	private static void updateName(PassByValue obj) {
		obj.name = "Dwight Danger Shrute";
	}

	public static void updateId(int id) {
		id = 10197;		
	}
}
