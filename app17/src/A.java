class A 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(true)
		{
			System.out.println(1);
			if(true)				
			{
				System.out.println(2);		//nested blocks,outer blocks, inner blocks
			}

		System.out.println("3");
		}
		System.out.println("main end");
	}
}
