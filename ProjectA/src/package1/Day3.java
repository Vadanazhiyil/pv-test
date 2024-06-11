package package1;

public class Day3 
{
  public Day3()
  {
	  this (1,2,3);
	  System.out.println("default constructor");
  }
  
  public Day3(int a )
  {
	  System.out.println("one parameterized  constructor");
  }
  

  public Day3(int a, int b)
  {
	  System.out.println("two parameterized constructor");
  }
  
  public Day3(int a, int b, int c)
  {
	  System.out.println("three parameterized constructor");
  }
  
  public static void main(String[] args) 
  {
	
	  Day3 d =new Day3();
	  Day3 one = new Day3(1);
	  Day3 two = new Day3(1, 2);
  }
}
	

