class M2 
{
	public static void main(String[] args) 
	{
		A a1 = null;
		B b1 = null;	//	null is a keyword
		C c1 = new C();
		D d1 = null, d2 = new D(), d3;
		d3 = d1;
		d2 = d1;
		a1 = new A();
		A a2 = a1, a3 = a1, a4 = null;
		a3 = a1;
		a2 = a1;
		B b2 = b1;
		C c2 = new C();
		System.out.println("Hello World!");
	}
}
