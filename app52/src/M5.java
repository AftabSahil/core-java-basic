class M5 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		C c1 = new C();
		a1 = c1;
		Object o1 = a1;
		Object o2 = c1;
		System.out.println("Hello World!");
	}
}
