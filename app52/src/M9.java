class M9 
{
	public static void main(String[] args) 
	{
		A a1 = new D();
		B b1 = new C();
		test(a1);
		test(b1);
		System.out.println("Hello World!");
	}

	static void test(C obj)
	{
		System.out.println("test");
	}
}
