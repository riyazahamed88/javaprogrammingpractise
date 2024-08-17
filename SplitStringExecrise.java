package javaproject;

public class SplitStringExecrise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//string is an object  // String literal
		
		String s1  ="Hello World";
		
		//new
		
		String s2 = new String("Welcome to Java Learning");
		String [] splitarray = s2.split("Java");
		System.out.println(splitarray[0]);
		System.out.println(splitarray[1]);
		System.out.println(splitarray[1].trim());
		
	//to print the values in reverse order
		for (int i = s2.length()-1; i>=0 ; i--) {
			System.out.println(s2.charAt(i));
			
		}
		
	}

}
