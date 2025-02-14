class C 
{
	int i;
	void test()
	{
		System.out.println("test");
	}
	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println(c1.i);
		c1.test();
	}
}
