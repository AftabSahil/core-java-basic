class W
{
	public static void main(String[] args) 
	{
		int i;
		for(i = 1, System.out.println("init:" + i);
			test (i);
		System.out.println("before changes:" + i), i++, System.out.println("after changes:" + i))
		{
			System.out.println("loop body:" + i);
		}
		System.out.println("end");
	}
	static boolean test (int i)
	{
		boolean b1 = (i <= 5);
		System.out.println("boolean result for i =" + i + ":" + b1);
		return b1;
	}
}

