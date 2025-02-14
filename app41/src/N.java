class N 
{
	N()
	{
		System.out.println("N()");
	}
	N(int i)
	{           this ();
	            System.out.println("M()");
	}
	public static void main(String[] args) 
	{
		N n1 = new N();
		System.out.println("---------------------------");
		N n2 = new N (90);
	}
}
