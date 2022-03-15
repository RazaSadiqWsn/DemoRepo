class Abc
{
	public static void main(String args[])
	{
		System.out.println("Helloworld");
		for(int i=0;i<10'i++)
			System.out.println("Hello Wissen");

		System.out.println(checkEven(17));
	}

	static boolean checkEven(int number)
	{
		if(number%2==0)
			return true;
		return false;
	}
	
}