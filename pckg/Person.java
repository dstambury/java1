//Author: Daniel E. Stambury


package pckg;

public class Person {
	
	//variables
	private String name;
	private char gender;
	private int age;
	private int salary;
	
	public Person(String nm, char gen, int ag, int sal) {
		name = nm;
		gender = gen;
		age = ag;
		salary = sal;
	}//end constructor

	public String getName() {
		return name;
	}//end getName getter
	
	public void setName(String nm) {
		name = nm;
	}//end setName setter
	
	public char getGender() {
		return gender;
	}//end getGender getter
	
	public void setGender(char gen) {
		if (gen == 'M' || gen == 'F' || gen == 'm' || gen == 'f') {
			gender = gen;
		}//end if statement
	}//end setGender setter
	
	public int getAge() {
		return age;
	}//end getAge getter
	
	public void setAge(int ag) {
		if (ag >= 1 && ag <= 120) {
			age = ag;
		}//end if statement
	}//end setAge setter
	
	public int getSalary() {
		return salary;
	}//end getSalary getter
	
	public void setSalary(int sal) {
		if (sal > 0) {
			salary = sal;
		}//end if statement
	}//end setSalary setter
	
	public String toString() {
		String result;
		result = "Name: " + name + "\n" + "Gender: " + gender + "\n" + "Age: " + age + "\n" + "Salary: $" + salary;
		return result;
	}//end toString method
}//end class
