class A
{
	A()
	{
		super();
		System.out.println("A()");
	}
}

class G extends A 
{
	G()
	{
		super();
		System.out.println("G()");
	}
	public static void main(String[] args) 
	{
		G g1 = new G();
		System.out.println("done");
	}
}
