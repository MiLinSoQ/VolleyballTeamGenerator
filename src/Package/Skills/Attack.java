package Package.Skills;

import java.util.*;

public class Attack extends VolleyballSkill {
	
	// 扣球
	private Skill spike;

	// 吊球
	private Skill tip;
	
	// 打手出界，俗稱的 touch out
	// private Skill wipe;
	
	// 後排攻擊
	// private Skill backcourt;
	
	public Attack() {
		super();
		this.spike = new Skill("Spike");
		
		this.tip = new Skill("Tip");
	
		this.skills = new ArrayList<>();
		this.skills.add(this.spike);
		this.skills.add(this.tip);
	}
	
	public void setShot(Skill spike) {
		this.spike = spike;
	}
	
	public void setTip(Skill tip) {
		this.tip = tip;
	}
	
	public Skill getSpike() { return this.spike; }
	
	public Skill getTip() { return this.tip; }
	
	public void setSpikeLevel(int level) {
		if (this.spike == null) return;
		this.spike.setLevel(level);
	}
	
	public void setTipLevel(int level) {
		if (this.tip == null) return;
		this.tip.setLevel(level);
	}
}