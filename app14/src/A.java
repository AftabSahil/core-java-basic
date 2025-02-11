class A
{
	public static void main(String[] args) 
	{
        System.out.println(120|200);  //bitwise OR
		System.out.println(120&200);  //bitwise AND
        System.out.println(120^200);  //bitwise XOR
	}
}

/*
   120==>01111000
   200==>11001000
   120|200==>11111000==>248


   120==>01111000
   200==>11001000
   120&200==>01001000==>72

   
   120==>01111000
   200==>11001000
   120^200==>10110000==>176
 */