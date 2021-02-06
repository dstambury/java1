/*
 * Author: Daniel E. Stambury
 * Date Written: 10/9/2020
 * Assignment: Classes and UML's
 * Description: Created 3 different classes. The first one contains the main method.
 * The second one is called Name and creates a name object given first, middle, and last name.
 * The third class creates a person with a name, gender, age, and salary.
 */


package pckg;

public class ClassesAssignment {
	
	public static void main(String[] args) {
		
		//Name constructors
		Name name1 = new Name("Daniel", "E.", "Stambury");
		Name name2 = new Name("Vicente", " ", "Vazquez");
		Name name3 = new Name("Alex", "M.", "Troconis");
		
		//Person constructors		
		Person person1 = new Person(name1.toString(), 'M', 28, 60000);
		Person person2 = new Person(name2.toString(), 'M', 32, 80000);
		Person person3 = new Person(name3.toString(), 'F', 60, 70000);
		
		//testing Person setters
		person1.setAge(30);
		person2.setSalary(65000);
		person3.setGender('M');
		
		//output
		System.out.println(person1);
		System.out.println();
		System.out.println(person2);
		System.out.println();
		System.out.println(person3);


	}//end main
	
	
	

}
