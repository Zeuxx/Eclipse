// Number.java
// Isaac Ussery
// 06/17/2017

public class Numbers
{
    public static void main(String[] args)
    {
	int var1, var2;
	var1 = 10;
	var2 = 20;

	sum(var1, var2);

	difference(var1, var2);
    }

    public static void sum(int a, int b)
    {
	int temp = a + b;
	System.out.println("The sum of " + a + " and " + b + " is " + temp);
    }

    public static void difference(int a, int b)
    {
	int temp = a - b;
	System.out.println("The difference between " + a + " and " + b + " is " + temp);
    }
}
