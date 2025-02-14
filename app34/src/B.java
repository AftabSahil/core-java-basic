class		B
{
	public static void main(String[] args) 
	{
		int i= 1 ;
		int j = test(i++ + i++ + i);
		//         test(1   +    2   + 3);
		System.out.println("from main");
		System.out.println(i);		 // 3
		System.out.println(j);		// 13
	}
	static int test (int i)
	{
		System.out.println("test:"  + i);		//	6
		return i++  + i;										// 13
	}
}


//CA