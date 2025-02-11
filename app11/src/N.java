class  N
{
	public static void main(String[] args) 
	{
		int i = 5 ;
		System.out.println(i++		+	i	+	i++	+		i	+	i++	+	i	+	i++	+	i);
		//System.out.println(5		+	6	+	6	+		7	+	7	+	8	+	8	+	9); Total = 56
		System.out.println(i); // i = 9
		System.out.println(i--		+	i	+	i++	+		i	+	i--	+	i	+	i++	+	i);
	  //System.out.println(9	+	8	+	8	+	9	+	9	+	8	+	8	+ 9);  total = 68
		System.out.println(i); // i= 9
	}
}

/*
output:
56
9
68
9

*/