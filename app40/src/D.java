class D 
{
	void test()
	{
		System.out.println("test:" + this);
	}
	public static void main(String[] args) 
	{
		D d1 = new D();
		System.out.println("main:" + d1);
		d1.test();
	}
}
