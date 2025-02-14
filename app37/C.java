class C 
{
	static int i =  test();

	static
	{
          System.out.println("C-STB");
	}
	static int test()
	{
          System.out.println("C-STB");
	      return 200;
	}
	public static void main(String[] args) 
	{
		System.out.println("C -main" + i);
	}
}
