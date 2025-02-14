class	O 
{
	static int i ;
	public static void main(String[] args) 
	{
		System.out.println(i);			//    i = global
		int i = 10 ;
		System.out.println(i);			// i = local >>>
		System.out.println(i);
		i = 300 ;
		System.out.println(i);
		System.out.println(i);
		System.out.println(i);
	}
}
