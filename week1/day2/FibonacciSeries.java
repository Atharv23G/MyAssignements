package week1.day2;

public class FibonacciSeries 
{

	public static void main(String[] args) 
	{
		int n1=0,n2=1,n3,i,range=20;
		System.out.println(n1+"\n"+n2);
		System.out.println("The Fibonacci Series from 1 to 20 is:");
		for(i=2;i<range;++i)
		{
			n3=n1+n2;
			System.out.println(""+n3);
			n1=n2;
			n2=n3;
		}
	}

}
