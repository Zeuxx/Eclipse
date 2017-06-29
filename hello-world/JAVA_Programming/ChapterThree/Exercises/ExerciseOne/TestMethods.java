// TestMethods.java
// Isaac Ussery
// 06/17/2017

public class TestMethods
{
    public static void main(String[] args)
    {
	int var1, var2;
	var1 = 1;
	var2 = 2;

	displayIt(var1);
	displayIt(var2);

	displayItTimesTwo(var1);
	displayItTimesTwo(var2);

	displayItPlusOneHundred(var1);
	displayItPlusOneHundred(var2);
    }

    public static void displayIt(int var)
    {
	System.out.println("The value in the variable is: " + var);
    }

    public static void displayItTimesTwo(int var)
    {
	int temp = var * 2;
	System.out.println("The value times two is: " + temp);
    }

    public static void displayItPlusOneHundred(int var)
    {
	int temp = var + 100;
	System.out.println("The value plus 100 is: " + temp);
    }
}
