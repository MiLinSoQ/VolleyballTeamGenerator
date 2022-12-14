package Package.Role;

import Package.Volleyball.*;

public class Player extends Person {

	private VolleyballData vData;
	
	public Player(String name, int gender, VolleyballData data) {
		super(name, gender);
		this.vData = data;
	}
	
	public VolleyballData getVolleyData() { 
		return this.vData;
	}
	
	public double getVolleyAverage() {
		return this.vData.getAverage();
	}
	
	public Player(String name, int gender) {
		this(name, gender, null);
	}
	
	public String toString() {
		String str = super.toString();
		
		if (this.vData != null) {
			
			if (this.vData.getPosition() != null) {
				str = String.format("%s | Position: [ %s ]", str, this.vData.getPosition().toString());
			}
			
			str = String.format("%s\n[ %s ]", str, vData.toString());
		}
		
		return str;
	}
	
}