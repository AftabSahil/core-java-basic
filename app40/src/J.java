class J 
{
	int i;
	void test()
	{
		System.out.println("test:" + i);
		i = 400;
	}
	public static void main(String[] args) 
	{
		J obj = new J();
		obj.i = 40;
		obj.test();
		System.out.println("main:" + obj.i);
	}
}
