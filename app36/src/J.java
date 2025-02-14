class J  
{
	static int a = test();
	static
	{
		System.out.println("SIB");
	}
	static int test()
}
	public static void main(String[] args) 
	{
		System.out.println("from test");
		return 200;
	}
}
