class M 
{
	int i;

	public static void main(String[] args) 
	{
		M m1  = new M();
		System.out.println(m1.i);
		m1.i = 20;
		System.out.println(m1.i);
		m1.i = 30;
		System.out.println(m1.i);
		M m2  = new M();
		System.out.println(m2.i);
		m1.i = 5;
		System.out.println(m1.i);
		System.out.println(m2.i);
	}
}
