package Package.Volleyball;

import java.util.*;
import Util.Interface.*;
import Package.Skills.*;

public class VolleyballData implements PrintInterface {
	
	private Position position;
	
	private Serve serve;
	
	private Attack attack;
	
	private Defence defence;
	
	private Setting setting;
	
	public VolleyballData(Serve serve, Attack attack, Defence defence, Setting setting, Position position) {
		this.serve = serve;
		this.attack = attack;
		this.defence = defence;
		this.position = position;
		this.setting = setting;
	}
	
	public VolleyballData(Serve serve, Attack attack, Defence defence, Setting setting, int position) {
		this(serve, attack, defence, setting, new Position(position));
	}
	
	public VolleyballData() {
		this(new Serve(), new Attack(), new Defence(), new Setting(), new Position(Position.POSITION_VALUE_UNDEFINED));
	}
	
	public void setPosition(int position) {
		this.position = new Position(position);
	}
	
	public void setPosition(Position position) {
		this.position = position;
	}
	
	public Position getPosition() {
		return this.position;
	}
	
	public Serve getServe() {
		return this.serve;
	}
	
	public Attack getAttack() {
		return this.attack;
	}
	
	public Defence getDefence() {
		return this.defence;
	}
	
	public Setting getSetting() {
		return this.setting;
	}
	
	
	public String toString() {
		String str = String.format("Serve score: [ %d ] | Attack score: [ %d ] | Defence score: [ %d ] | Setting score: [ %d ]",
			this.serve.getScore(),
			this.attack.getScore(),
			this.defence.getScore(),
			this.setting.getScore());
		return str;
	}
	
	public void printString() {
		System.out.println(this.toString());
	}
	
}
