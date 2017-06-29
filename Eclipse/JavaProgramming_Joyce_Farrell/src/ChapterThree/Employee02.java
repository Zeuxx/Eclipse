package ChapterThree;

//Employee.java holds employee data
//Isaac Ussery
//06/17/2017

public class Employee02
{
 // private data members
 private int empNum;
 private String empLastName;
 private String empFirstName;
 private double empSalary;

 // public mutator and accessor methods
 public int getEmpNum()
 {
	return empNum;
 }

 public void setEmpNum(int emp)
 {
	empNum = emp;
 }

 public String getEmpLastName()
 {
	return empLastName;
 }

 public void setEmpLastName(String lastName)
 {
	empLastName = lastName;
 }

 public String getEmpFirstName()
 {
	return empFirstName;
 }

 public void setEmpFirstName(String firstName)
 {
	empFirstName = firstName;
 }

 public double getEmpSalary()
 {
	return empSalary;
 }

 public void setEmpSalary(double salary)
 {
	empSalary = salary;
 }
}
