class A 
{
	public static void main(String[] args) 
	{
		int i=90;
		String s1=Integer.toBinaryString(i);
		System.out.println(i);
		System.out.println(s1);
	}
}
/* 
 	90 /2    ==>   45  + r0
	45 /2    ==>   22  + r1
	22 /2    ==>   11  + r0
	11 /2    ==>   5   + r1
	5  /2    ==>   2   + r1
	2  /2    ==>   0   + r0
	1  /2    ==>   1   + r1
	------------------------
						1011010
						1011010
*/

