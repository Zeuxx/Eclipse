package ChapterThree.Exercises;

public class ShowStudent
{
	public static void main(String[] args)
	{
		Student Isaac = new Student();
		
		displayStudent(Isaac);
		
		assignValues(Isaac);
		
		displayStudent(Isaac);
	}
	
	public static void displayStudent(Student n)
	{
		System.out.println("Student ID: " + n.getID());
		System.out.println("Student Hours: " + n.getCreditEarned());
		System.out.println("Student Points: " + n.getPointsEarned());
		System.out.println("Student GPA: " + n.getGPA());
	}
	
	public static void assignValues(Student n)
	{
		n.setCreditEarned(120);
		n.setPointsEarned(120);
		n.setID(2839267);
		n.setGPA();
	}

}