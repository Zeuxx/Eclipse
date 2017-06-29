// DemoRaise.java
// Isaac Ussery
// 06/17/2017

public class DemoRaise
{
    public static void main(String[] args)
    {
	double mySalary = 200.00;
	double moneyAmount = 800.00;
	System.out.println("Demonstrating some raises:");
	predictRaise(400.00);
	predictRaise(mySalary);
	predictRaise(moneyAmount);
    }

    public static double predictRaise(double moneyAmount)
    {
	double newAmount;
	double bonusAmount;
	final double RAISE = 1.10;
	newAmount = moneyAmount * RAISE;
	//	bonusAmount = calculateBonus(newAmount);
	newAmount = newAmount + bonusAmount;
	return newAmount;
    }

}
