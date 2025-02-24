interface A
{
	void test1();
	void test2();
}
interface B
{
	void test3();
}
class C{
    void test4(){
        System.out.println("test4");
    }
}

class Q extends C  implements A, B
{
	public void test1()
	{
		System.out.println("test1");
	}
	public void test2()
	{
		System.out.println("test2");
	}
	public void test3()
	{
		System.out.println("test3");
	}
	public static void main(String[] args) 
	{
		Q q1 = new Q();
        q1.test1();
        q1.test2();
        q1.test3();
        q1.test4();
		System.out.println("done");
	}
}