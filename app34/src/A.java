class		A 
{
	public static void main(String[] args) 
	{
		int i= 1 ;
		int j = test(i++ + i);
		System.out.println(i);
		System.out.println(j);
	}
	static int test (int i)
	{
		System.out.println("test:"  + i);
		return i++ ;
	}
}


//CA