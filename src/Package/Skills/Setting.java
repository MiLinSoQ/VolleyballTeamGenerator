package Package.Skills;

import java.util.*;

public class Setting extends VolleyballSkill {
	
	private Skill overhand;
	
	private Skill underhand;
	
	public Setting() {
		
		this.overhand = new Skill("Overhand");
		
		this.underhand = new Skill("Underhand");
		
		this.skills = new ArrayList<>();
		this.skills.add(this.overhand);
		this.skills.add(this.underhand);
	}
	
	public void setUnderhandLevel(int level) {
		if (this.underhand == null) return;
		this.underhand.setLevel(level);
	}
	
	public void setOverhandLevel(int level) {
		if (this.overhand == null) return;
		this.overhand.setLevel(level);
	}
	
	
}