class  I
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
	public static void test()
	{
		System.out.println("test begin");			
		if (true)
		{
			return ;
		}
		System.out.println("test end");
	}
}
