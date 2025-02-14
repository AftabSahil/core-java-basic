class I 
{
	int i;

	void test()
	{
		System.out.println("test:" + this.i);
		this.i = 30;
	}

	public static void main(String[] args) 
	{
		I  i1 = new I();
		i1.i = 200;
		System.out.println(i1.i);
		i1.test();
		System.out.println(i1.i);
	}
}
