package Package.Skills;

import java.util.*;

public class Serve extends VolleyballSkill {
	
	// 低手發球
	private Skill underhand;
	
	// 上手發球
	private Skill overhand;
		
	// 旋球
	// private Skill topspin;

	// 跳躍發球
	// private Skill jumpFloat;

	// 跳發
	// private Skill jumpServe;
	
	public Serve() {
		super();
		this.underhand = new Skill("Underhand");
		
		this.overhand = new Skill("OverHand");
		
		this.skills = new ArrayList<>();
		skills.add(underhand);
		skills.add(overhand);
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