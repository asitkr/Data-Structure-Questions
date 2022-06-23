class Employee
{
	int salary = 200000;
}

class EmployeeInheritance extends Employee
{
	int bonus = 10000;
	public static void main(String[] args) 
	{
		EmployeeInheritance EI = new EmployeeInheritance();
		System.out.println("Programmer Salary is: " + EI.salary);
		System.out.println("Programmer Bonus is: " + EI.bonus);
	}
}
