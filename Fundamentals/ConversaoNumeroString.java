package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		
		//Three ways to convert a number to string
		
		// 1st way. Set a wrapper
		Integer num1 = 1000; //Convert to wrapper. int to Integer
		System.out.println(num1.toString().length());
		
		
		// 2nd way. Calling a wrapper for a variable number
		int num2 = 100000;
		System.out.println(Integer.toString(num2)); //Calling a wrapper to variable num2
		System.out.println(Integer.toString(num2).length()); //Calling a wrapper to variable num2
		
		// System.out.println(Byte.toString(num2)); Error!!! Because num2 is 'int' and not 'byte'
		
		// 3rd way. Concatenate with a empty string
		System.out.println(("" + num1).length());
		String number1 = ("" + num1);
		System.out.println("This is number1: " + number1);
		
		String number2 = ("" + num2);
		System.out.println("This is number2: " + number2);
		
		
	}
}
