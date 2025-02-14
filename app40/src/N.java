class  N
{
	int giri;
		void setGiri(int giri)
	{
       this.giri = giri;
	}
	public static void main(String[] args) 
	{
		N n1 = new N();
		System.out.println(n1.giri);
		n1.setGiri(90);
		System.out.println(n1.giri);
	}
}
