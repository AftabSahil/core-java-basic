class J 
{
	static int a;

	J()
	{
		System.out.println(a);
	}

	{
		System.out.println(a);
	}

	void test1()
	{
		System.out.println(a);
	}

	static void test2()
	{
		System.out.println(a);
	}

	static
	{
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		System.out.println(a);
	}
}
