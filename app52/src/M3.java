class M3 
{
	static void test1(A a1)
	{
		System.out.println("test1:", + a1 );
	}
	public static void main(String[] args) 
	{
		A a1 = null;
		test1(a1);
		test1(new A());
		A a2 = new A();
		test1(a2);

		System.out.println("Hello World!");
	}
}
