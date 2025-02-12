class  R
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		String s1 = test();
		System.out.println("main end");
	}
	static int test()
	{
		System.out.println("test");
		return 1000;
	}
}
  

 // error : incompatible types: int cannot be converted to String