// Initilizing of object by using 3 ways
// 2. By method

class Student
{
	int id;
	String name;

	void insertRecord(int i, String n)
	{
		id = i;
		name = n;
	}

	void displayRecord()
	{
		System.out.println(id + " " + name);
	}
}

class StudentByMethod
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		Student s2 = new Student();

		s1.insertRecord(100, "Hit ");

		s2.insertRecord(200, " Man");

		s1.displayRecord();
		s2.displayRecord();
	}
}
