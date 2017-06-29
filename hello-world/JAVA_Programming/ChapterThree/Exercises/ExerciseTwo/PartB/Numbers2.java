// Numbers2.java
// Isaac Ussery
// 06/17/2017

public class Numbers2
{
    public static void main(String[] args)
    {
	int var1, var2, temp;
	var1 = 10;
	var2 = 20;

	temp = product(var1, var2);
	System.out.println("The product of " + var1 + " and " + var2 + " is " + temp);
    }

    public static int product(int a, int b)
    {
	return a * b;
    }
}
