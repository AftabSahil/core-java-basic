class H 
{
	void test()
	{
		System.out.println("test:" +this);
	}
	public static void main(String[] args) 
	{
		H h1 = new H();
		System.out.println("main1:" + h1);
		h1.test();
		System.out.println("-------------------------");
		H h2 = new H();
		System.out.println("main2:" + h2);
		h2.test();
		System.out.println("---------------------------");
	}
}
