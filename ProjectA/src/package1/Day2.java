package package1;

public class Day2 
{
    
    public int sum(int a, int b)
    {
    	int c;
    	c = a+b;
    	return c;    
    }
     public int sub(int d, int e)
    {
    	int f;
    	f = d-e;
    	return f;
    }
    
    public int multi(int g, int h)
    {
    	int i;
    	i=g*h;
    	return i;
    }
    
    public int div(int j, int k)
    {
    	int l;
    	l=j/k;
    	return l;
    }
    
	public static void main(String[] args) 
	{
		Day2 assignment1 = new Day2();
        int oper1 = assignment1.sum(10, 2);
        int oper2 = assignment1.sum(oper1, 2);
        int oper3 = assignment1.sub(oper2, 2);
        int oper4 = assignment1.multi(oper3,2);
        int oper5 = assignment1.div(oper4, 2);
        
         System.out.println("Result of assignment 1 is "+ oper5);
         
         Day2 assignment2 = new Day2();
         int oper6 = assignment2.multi(10, 2);
         int oper7 = assignment2.sub(oper6, 2);
         int oper8 = assignment2.sum(oper7, 2);
         int oper9 = assignment2.sub(oper8, 2);
         int oper10 =assignment2.div(oper9, 2);
         System.out.println("Result of assignment 2 is "+oper10);
      }

}
