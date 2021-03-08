package helloJava;

public class hello {
	public static void main(String []args)
	{
		// main
		System.out.println("Java is very similar to C# - right now I think I prefer C# over Java\n");
		dataTypes();
		createLine(); // added for readability
		
		int mySampleInt = add(24, 64);
		int num1 = 24;
		int num2 = 64;
		
		// string interpolation works like Golang or C
		String myFormattedString = String.format("Adding %d and %d gives me: %d", num1, num2, mySampleInt);
		System.out.println(myFormattedString);
	}
	
	public static void dataTypes()
	{
		int myInt = 2147483647;
		short myShort = 12345;
		float myFloat = 0.5f;
		double myDouble = 3.14159265358979;
		char myChar = 'A';
		boolean myBool = true;
		System.out.println("maximun int is: " + myInt);
		System.out.println("anything shorter uses short: " + myShort);
		System.out.println("floats end in f: " + myFloat);
		System.out.println("a double holds 8 bytes (64 bits) and is more precise than a float: " + myDouble);
		System.out.println("single character with single quotes: " + myChar);
		System.out.println("boolean is true/false: " + myBool);
	}
	
	public static void createLine()
	{
		System.out.println("\n");
	}
	
	public static int add(int num1, int num2)
	{
		return num1 + num2;
	}

}
