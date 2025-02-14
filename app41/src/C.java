class C 
{
	C()
	{
		System.out.println("C():" + this);
	}
	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println("main:" + c1);
	}
}
