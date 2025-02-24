class J 
{
	int a;

	J()
	{
		a = 12;
	}

	J(int a)
	{
		this.a = a;
	}

	public static void main(String[] args) 
	{
		J j1 = new J();
		System.out.println(j1.a);

		J j2 = new J();
		System.out.println(j2.a);

		J j3 = new J(10);
		System.out.println(j3.a);

		J j4 = new J(20);
		System.out.println(j4.a);

	}
}







