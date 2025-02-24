class L 
{
	static int i;

	L()
	{
		i++;
	}

	L(int arg)
	{
		i++;
	}

	L(int a, int b)
	{
		i++;
	}

	public static void main(String[] args) 
	{
		L obj1 = new L();
		L obj2 = new L(12);
		L obj3 = new L();
		L obj4 = new L();
		L obj5 = new L(2, 3);
		System.out.println(i);
	}
}
