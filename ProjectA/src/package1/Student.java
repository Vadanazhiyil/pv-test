package package1;

public class Student 
{
  int age;
  int rollNo;
  public void display1()
  {
  System.out.println("Wecome to all of you");
  }
  
  public void display2()
  {
  System.out.println("Automation is very easy");
  }
  
  public static void main(String[] args) 
  {
	Student assignment = new Student();
	assignment.display1();
	assignment.display2();
	assignment.age = 99;
	assignment.rollNo = 1234;
	System.out.println("Age is "+assignment.age + " and roll number is "+assignment.rollNo);
  }
}
