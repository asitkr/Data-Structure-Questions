/* It is called constructor because it constructs the values at the time of object creation.
It is not necessary to write a constructor for a class.*/

// There are two types of constructors in Java: no-arg constructor, and parameterized constructor.

/*Rules for creating Java constructor
	There are two rules defined for the constructor.

	Constructor name must be the same as its class name
	A Constructor must have no explicit return type
	A Java constructor cannot be abstract, static, final, and synchronized */

// Creating Default Constructor
class Bike
{
	Bike() {
		System.out.println("Default Constructor is Created");
	}

	public static void main(String[] args) 
	{
		Bike b1 = new Bike();
	}
}
