class  H
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
	public static void test()
	{
		System.out.println("from test");			//  compilation error(incompatible types: unexpected return value)
		return 100 ;
	}
}
