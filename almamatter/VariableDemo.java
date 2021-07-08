package almamatter;

public class VariableDemo {  //the same rule apply for class names and also method names
	public static void main(String[] args) {
		
		//1. valid identifiers and declaration of variables
		int age;
		//First let us learn the concept of valid identifiers...(valid names/naming convention)
		//valid identifiers are those identifiers which start with a character or $ or _
		
		int $age;
		int _age;
		int _a$g_e;
		int ag2e;//you can also numbers in between
		
		//the above are legal valid identifiers.
		
		//invaid identifiers...
		
		//int @age; //you cannot start the name with symbols other than $ and _
		//int 2age;//you cannot start the name with a number
		//int a g e;//you cannot have space
		//int class;//you cannot declare a keyword of java as variable name.
		
		// variable names are case sensitive A is not the same as a;
		
		//2. Declarations and initialization of all the variables
		
		int salary=214_74_83_646;//underscore can be used for better readability
		
		salary=salary+1;
		
		System.out.println(salary);
		
		short s=32_7_6;
		
		byte b=127;
		
		float f=230.56f;//by adding f as the suffix the value will take 32 bits, and that can be stored in float
		
		double d=344.455;//double is 64 bit
		
		char c='a';
		
		boolean boo=true;
		boolean boo2=false;
		
		String str="hello world";
		
	}
}
