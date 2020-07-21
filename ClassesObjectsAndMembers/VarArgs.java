package classesobjectsandmembers;

/*   To denote functions with Variable Arguments while calling    */
public class VarArgs {

	
	//Syntax ... (three dots)
	//Logic : Compiler considers it as an Array. If no arguments are passed, compiler sends empty array
	public static void lengthFinder(int... numbers) {
		
		System.out.println("Length of passed numbers is "+numbers.length);
	}
	
	public static void main(String args[]) {
		
		lengthFinder();                         // Length is 0
		lengthFinder(1, 2, 3, 4, 5);            // Length is 5
		lengthFinder(new int[] {1, 2, 3});      // Length is 3
		lengthFinder(999);                      // Length is 1
		lengthFinder(null);                     // Null pointer Exception

	}
}
