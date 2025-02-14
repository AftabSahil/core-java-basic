class B 
{
	int i;
	static void test(B a1)
	{
		System.out.println("test:" + a1.i);
		a1.i =  40;
	}
	public static void main(String[] args) 
	{
		B a1= new B();
		System.out.println(a1.i);
		a1.i = 20;
		test(a1);
		System.out.println(a1.i);

	}
}
