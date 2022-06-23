//super is used to refer immediate parent class instance variable

class Animal
{
	String color = "White";
}

class Dog extends Animal
{
	String color = "Black";

	void showColor()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}

class SuperInstanceVariable
{
	public static void main(String[] args) 
	{
		Dog d = new Dog();
		d.showColor();
	}
}
