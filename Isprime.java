package week1.day1;

public class Isprime {
public static void main(String[] args) {
	int num = 71;
	int i=2;
	int primeIndicator =0;
	
	for (i=2;i<=(num-1);i++)
	{
		if(num%i==0)
		{
			System.out.println(num +" is not prime");
			primeIndicator = 1;
			break;
		}
		
		
}
	if (primeIndicator ==0)
	{System.out.println(num +" is prime");
	}
}
}