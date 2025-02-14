class M 
{
	int  i = 10;
	void test()
	{
		System.out.println("test:" + i);
		int i = 400;
		System.out.println("test:" + i);
		System.out.println("test:" + this.i);
	}
	public static void main(String[] args) 
	{
		M obj = new M();
		obj.test();
		System.out.println("done");
	}
}
