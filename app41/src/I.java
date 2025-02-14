class person 
{
	String name;
	int age;
	person(String name,int age)
	{
		this .name = name;
		this.age = age;
	}
}
class I
{
     
	public static void main(String[] args) 
	{
		person p1 = new person("murali", 33);
		person p2 = new person("swathi", 23);
		person p3 = new person("suresh", 35);
		System.out.println(p1.name + " ," + p1.age);
		System.out.println(p2.name + " ," + p2.age);
		System.out.println(p3.name + " ," + p3.age);
	
	}
}
