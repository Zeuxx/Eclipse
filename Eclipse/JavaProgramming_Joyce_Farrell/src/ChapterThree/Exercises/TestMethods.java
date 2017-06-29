package ChapterThree.Exercises;

public class TestMethods {
	public static void main(String[] args) {
		int var1, var2;
		var1 = 10;
		var2 = 20;
		
		displayIt(var1);
		displayIt(var2);
		
		displayItTimesTwo(var1);
		displayItTimesTwo(var2);
		
		displayItPlusOneHundred(var1);
		displayItPlusOneHundred(var2);
	}
	
	public static void displayIt(int var)
	{
		System.out.println("The value is: " + var);
	}
	
	public static void displayItTimesTwo(int var) {
		System.out.println("The value time two is: " + (var * 2));
	}
	
	public static void displayItPlusOneHundred(int var) {
		System.out.println("The value plus 100 is: " + (var + 100));
	}
	
}