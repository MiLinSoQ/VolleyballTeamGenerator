package Package.Role;

import Util.Interface.*;

public class Person implements PrintInterface {
	
	protected String name;
	
	protected Gender gender;
	
	public Person(String name, int gender) {
		this.name = name;
		this.gender = new Gender(gender);
	}
	
	public Person() { }
	
	public String getName() { return this.name; }
	
	public Gender getGender() { return this.gender; }
	
	public String toString() {
		return String.format("Name: [ %s ] | Gender: [ %s ]", this.name, gender.caption);
	}
	
	public void printString() {
		System.out.println(this.toString());
		System.out.println("<><><><><><><><>");
	}
}
