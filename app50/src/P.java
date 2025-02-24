interface A
{
	void test1();
	void test2();
}
interface B
{
	void test3();
}

class P implements A, B
{
	public void test1()
	{
		System.out.println("P-test1");
	}
	public void test2()
	{
		System.out.println("P-test2");
	}
	public void test3()
	{
		System.out.println("P-test3");
	}
	public static void main(String[] args) 
	{
		P p1 = new P();
		p1.test1();
		p1.test2();
		p1.test3();
		System.out.println("done");
	}
}