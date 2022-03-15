class Abc
{
	public static void main(String args[])
	{
		System.out.println("Helloworld");
		for(int i=0;i<10'i++)
			System.out.println("Hello Wissen");

		System.out.println(checkPrime(13));
	}
	public static boolean checkPrime(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==2)
				return false;
		}
		return true;
	}
}