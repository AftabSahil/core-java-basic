class H 
{
	int i;

	void test()
	{
		System.out.println("test:" + this.i);
		this.i = 30;
	}
	
	public static void main(String[] args) 
	{
		H h1 = new H();
		h1.i = 200;
		System.out.println(h1.i);
		h1.test();
		System.out.println(h1.i);
	}
}
