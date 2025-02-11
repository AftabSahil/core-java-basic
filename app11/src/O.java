class O 
{
	public static void main(String[] args) 
	{
		int i =1 ;
		int j = i++ +	i	+	i++	+	i	+	i++	+	i	+	i++	+	i +	i++	+	i ;
		// 1	+	2	+	2	+	3	+	3	+	4	+	4	+	5	+	5	+	6 = 35
		System.out.println(i);
		System.out.println(j);
	}
}


/*
output:
6
35

*/