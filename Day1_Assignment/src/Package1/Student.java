 package Package1;

public class Student 
{
	
	int roll_no;
	int age;
	public void display1()
	{
		System.out.println("Welcome to all of you.");
	}
	
	public void display2()
	{
		System.out.println("Automation is very easy.");
	}
	
	public static void main(String[] args) 
	{
		Student std=new Student();
		std.display1();
		std.display2();
		
		std.roll_no=234;
		std.age=12;
		System.out.println(std.roll_no);
		System.out.println(std.age);
		
	}

}
