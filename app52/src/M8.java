class M8

{
	public static void main(String[] args) 
	{
		A a1 = new D();
		A b1 = new D();
/*
		C c1 = a1;
		C c2 = b1;
		D d1 = a1;
		D d2 = b1;
*/

		C c1 = (C) a1;
		C c2 = (C) b1;
		D d1 = (D) a1;
		D d2 = (D) b1;
		System.out.println("Hello World!");
	}
}
