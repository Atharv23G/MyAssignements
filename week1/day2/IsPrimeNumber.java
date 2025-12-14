package week1.day2;
import java.util.Scanner;
public class IsPrimeNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number:");
		int num=sc.nextInt();
		boolean isPrime=true;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
		
		if(isPrime==true)
		{
			System.out.println(num +" is a prime number");
		}
		else
		{
			System.out.println(num +" is a not prime number");
		}
		
	}


}
