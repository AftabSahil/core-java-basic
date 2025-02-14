class K 
{
	int i;
	void test1()
	{
		System.out.println("test1:" + i);
		i += 10;
		test2();
	}
	void test2()
	{
		System.out.println("test2:" +i);
		i +=20;
	}
	public static void main(String[] args) 
	{
		K k1 = new K();
		k1.i = 5;
		System.out.println("main1:" + k1.i);
		k1.test1();
		System.out.println("main1:" + k1.i);
		k1.i +=30;
		k1.test2();
		System.out.println("main1:" + k1.i);
	}
}
