package Package.Skills;

import java.util.*;

public class Defence extends VolleyballSkill {
	
	private Skill pass;
	
	public Defence() {
		super();
		this.pass = new Skill("Pass");
		
		this.skills = new ArrayList<>();
		this.skills.add(pass);
	}
	
	public void setPass(Skill pass) {
		this.pass = pass;
	}
	
	
	public Skill getPass() { return this.pass; }
	
	
	public void setPassLevel(int level) {
		if (this.pass == null) return;
		this.pass.setLevel(level);
	}
	
}