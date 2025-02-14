class B 
{
	B()
	{
		System.out.println("constructor-B");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		
		B b1 = new B();
		System.out.println("----------------------");
		B b2 = new B();
		System.out.println("----------------------");
	}
}
