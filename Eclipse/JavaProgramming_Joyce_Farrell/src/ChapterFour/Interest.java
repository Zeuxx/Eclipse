package ChapterFour;

public class Interest
{

	public static void main(String[] args)
	{
		calculateInterest(4000.0, 0.04);
		calculateInterest(4000.0, 4);

	}
	
	public static void calculateInterest(double bal, double rate)
	{
		double interest;
		interest = bal * rate;
		
		System.out.println("Simple interest on $" + bal + " at "
		+ rate + "% rate is " + interest);		
	}
	
	public static void calculateInterest(double bal, int rate)
	{
		double interest, rateAsPercent;
		
		rateAsPercent = rate / 100.0;
		interest = bal * rateAsPercent;
		
		System.out.println("Simple interest on $" + bal + " at "
		+ rate + "% rate is " + interest);
	}

}
