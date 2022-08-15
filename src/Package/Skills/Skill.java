package Package.Skills;

import Util.Interface.*;

public class Skill implements PrintInterface {
	
	public static final int minLevel = 1;
	
	public static final int maxLevel = 5;
	
	private String name;
	
	private int level;
	
	public Skill(String name, int level) {
		setName(name);
		setLevel(level);
	}
	
	public Skill(String name) {
		this(name, 0);
	}
		
	public Skill() { }
	
	public void setName(String name) {
		if (name == null) return;
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setLevel(int level) {
		if (level < minLevel || level > maxLevel) {
			return;
		}
		this.level = level;
	}
	
	public int getLevel() {
		return this.level;
	}
	
	public String toString() {
		return String.format("Name: [ %s ]\nLevel: [ %d ]", this.name, this.level);
	}
	
	public void printString() {
		
		System.out.println(this.toString());
		System.out.println("<><><><><><><><>");
	}
	
}