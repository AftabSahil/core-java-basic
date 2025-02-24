class M6 
{
	public static void main(String[] args) 
	{
		A a1 = new C();
		test(a1);
		test(new B());	//	test((object) new B());
		test(new C());
		D d1 = new D();
		test(d1);	//	test((object) d1);    ==>  auto upcasting
		System.out.println("Hello World!");
	}
	static void test(Object obj)
	{
		System.out.println("test");
	}
}
