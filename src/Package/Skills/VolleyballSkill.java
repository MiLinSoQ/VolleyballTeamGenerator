package Package.Skills;

import java.util.*;

public class VolleyballSkill extends Skill {
	
	protected ArrayList<Skill> skills;
	
	protected int score;
	
	public void VolleyballSkill() {
		this.score = 0;
		this.skills = new ArrayList<>();
		this.skills.clear();
	}
	
	public ArrayList<Skill> getSkills() {
		return this.skills;
	}
	
	public int getScore() {
		this.countScore();
		return this.score;
	}
	
	private void countScore() {
		this.score = 0;
		
		if (this.skills.isEmpty()) return;
		for (int i = 0; i < this.skills.size(); i ++) {
			this.score += this.skills.get(i).getLevel();
		}
		this.score /= this.skills.size();
	}
}
