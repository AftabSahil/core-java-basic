class M4 
{
	public static void main(String[] args) 
	{
		A a1 = new B();
		A a1 = new C();
		A a1 = new D();	//	A a3 = (A) new (D)
		B b1 = new C();
		B b1 = new D();
		C c1 = new D();
		Object o1 = new Object();
		Object o2 = new A();
		Object o3 = new B();	//	Object o3 = (object) new B();
		Object o4 = new C();
		Object o5 = new D();
		System.out.println("Hello World!");
	}
}
