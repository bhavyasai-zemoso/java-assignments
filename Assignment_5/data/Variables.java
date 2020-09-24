package bhavya.assignment.data;

public class Variables {
	int mem1;
	char mem2;

	public Variables() {
	}

	/**
	 * prints the member variables
	 */
	public void printDefaultClassVariables(){
		System.out.println(mem1);
		System.out.println(mem2);
	}

	public void printDefaultLocalVariables(){
		int var1;                                
		char var2;    
		
		/*There is no default value for local variables.
         We need to initialize local variables before using them.

        
		System.out.println(var1);
		System.out.println(var2);*/
	}

}