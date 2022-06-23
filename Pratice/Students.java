// Example of default constructor that displays the default values
class Students 
{
	int id;
	String name;

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) 
	{
		Students s1 = new Students();
		Students s2 = new Students();

		s1.display();
		s2.display();
	}
}
