//Example of static method
class Student
{
	int roll;
	String name;
	static String college = "BHU";

	static void change() {
		college = "IIM";
	}

	Student(int r, String n){
		roll = r;
		name = n;
	}

	void display(){
		System.out.println(roll + " " + name + " " + college);
	}
}
class StaticMethods
{
	public static void main(String[] args) 
	{
		Student.change();

		Student s1 = new Student(100, "Hu");
		Student s2 = new Student(101, "Yi");
		Student s3 = new Student(102, "Tp");
		Student s4 = new Student(103, "Wo");

		s1.display();
		s2.display();
		s3.display();
		s4.display();
	}
}
