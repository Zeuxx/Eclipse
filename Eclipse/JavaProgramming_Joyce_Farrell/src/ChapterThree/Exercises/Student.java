package ChapterThree.Exercises;

public class Student {
	
	private int ID;
	private int creditEarned;
	private int pointsEarned;
	private double GPA;
	
	public Student()
	{
		ID = 0;
		creditEarned = 0;
		pointsEarned = 0;
		GPA = 0;		
	}
	
	public void setID(int n)
	{
		ID = n;
	}
	
	public void setCreditEarned(int n)
	{
		creditEarned = n;
	}
	
	public void setPointsEarned(int n)
	{
		pointsEarned = n;
	}
	
	public void setGPA()
	{
		GPA = (double) pointsEarned / creditEarned;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public int getCreditEarned()
	{
		return creditEarned;
	}
	
	public int getPointsEarned()
	{
		return pointsEarned;
	}
	
	public double getGPA()
	{
		return GPA;
	}

}
