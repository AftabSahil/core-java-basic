class A
{
	static int i;
	static void test1()
	{
		System.out.println("A-test1");
	}
}
class F extends A 
{
	public static void main(String[] args) 
	{
		F.test1();
		System.out.println(F.i);
	}
}
