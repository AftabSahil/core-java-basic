class G 
{
	void test()
	{
		System.out.println("test:" + this);
	}
	public static void main(String[] args) 
	{
		G g1 = new G();
		System.out.println("main1:" + g1);
		g1.test();
		System.out.println("---------------");
		G g2 = new G();
		System.out.println("main2:" + g2);
		g2.test();
		System.out.println("---------------");
	}
}
