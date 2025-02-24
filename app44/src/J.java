class A
{
	A(int i, int j)
	{
		System.out.println("A(int, int)");
	}
}
class J extends A 
{
	J(int i, int j)
	{
		System.out.println("J(int,int)");
	}
	public static void main(String[] args) 
	{
		J j1 = new J(10, 20);
		System.out.println("done");
	}
}
