class N
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;
		if(i = 10)		//here i = 10 is not a result of boolean.	 
		{
			
			System.out.println("if block:" + i);	
		}
		
		System.out.println("main end :" + i);			
	}
}
