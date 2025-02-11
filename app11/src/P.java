class P 
{
	public static void main(String[] args) 
	{
		int i = 1 ;
		int j = i++		+	i	+	i++	+ i	+
				  i++		+	i	+	i++	+	i++	+
				  i++		+	i++	+	i--		+	i++	+	i	+
				  ++i		+	i++	+	--i		+	i++	+	--i		+
				  ++i		+	--i		+	i	+	i++	+	++i +	i;
		/* 1 + 2 + 2 + 3+ 
			3 + 4 + 4 + 5 +
			6 + 7 +  8 + 7 + 8 +
			9 + 9 + 9 + 9 + 9 +
			10 + 9 + 9 + 9 + 11 + 11  =  164 
		 */
		System.out.println(i);   // i = 11
		System.out.println(j);  // j = 164
	}
}


/*
output :
11
164

*/