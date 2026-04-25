class Fibonacci_con
{
	int n;
	Fibonacci_con(int n)
	{
		this.n=n;
		System.out.println("Fibonacci series is: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(fib(i));
		}
	}
	int fib(int n)
	{
		if(n==0)
		return 0;
		if(n==1)
		return 1;
		return fib(n-1)+fib(n-2);
	}
	
	public static void main(String[] str)
	{
		int n=Integer.parseInt(str[0]);
		Fibonacci_con ob= new Fibonacci_con(n);
	}
}