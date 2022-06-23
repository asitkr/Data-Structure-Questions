// Initilizing of object by using 3 ways
// 1. By refrence variable
// 2. By method
// 3. By constructor


// 1. By refrence variable
class Student
{
	int id;
	String name; 
}

class StudentRefer
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.id = 1001;
		s1.name = "Sohaa";
		System.out.println(s1.id + " " + s1.name);
	}
}
