package Package.Role;

import java.util.*;
import java.util.stream.Collectors; 
import Util.Interface.*;

public class Team implements PrintInterface {
	
	private int maxMalePlayers;
	
	private int maxFemalePlayers;
	
	// 隊伍最多人數
	private int maxPlayer;
	
	private ArrayList<Player> malePlayers;
	
	private ArrayList<Player> femalePlayers;	
	
	public Team() {
		this.maxMalePlayers = 3;
		this.maxFemalePlayers = 3;
		this.maxPlayer = this.maxMalePlayers + this.maxFemalePlayers;
		
		this.malePlayers = new ArrayList<>();
		this.femalePlayers = new ArrayList<>();
	}
	
	public void setMaxPlayer(int max) {
		this.maxPlayer = max;
	}
	
	public void addPlayer(ArrayList<Player> players) {
		if (players == null || players.size() <= 0) return;
		for (int i = 0; i < players.size(); i ++) {
			this.addPlayer(players.get(i));
		}
	}
	
	public void addPlayer(Player player) {
		if (player == null) return;
		if (player.getGender().isMale()) {
			this.malePlayers.add(player);
		} else {
			this.femalePlayers.add(player);
		}
	}

	public int getPlayerSize() {
		return this.malePlayers.size() + this.femalePlayers.size();
	}
	
	public boolean isMalePlayersFull() {
		return this.malePlayers.size() >= this.maxMalePlayers;
	}
	
	public boolean isFemalePlayersFull() {
		return this.femalePlayers.size() >= this.maxFemalePlayers;
	}
	
	public boolean isFull() {
		return (this.isFemalePlayersFull() && this.isMalePlayersFull());
	}
	
	public String toString() {
		String str = String.format("Male size: [ %d ] | Female size: [ %d ]", this.malePlayers.size(), this.femalePlayers.size());
		if (this.malePlayers.size() > 0) {
			String maleList = "";
			for (Player player : this.malePlayers) {
				maleList += player.getName() + " ";
			}
			str = String.format("%s\nMale: [ %s ]", str, maleList);
		}
		
		if (this.femalePlayers.size() > 0) {
			String femaleList = "";
			for (Player player : this.femalePlayers) {
				femaleList += player.getName() + " ";
			}
			str = String.format("%s\nFemale: [ %s ]", str, femaleList);
		}
		
		return str;
	}
	
	public void printString() {
		System.out.println(this.toString());
		System.out.println("<><><><><><><><>");
	}
	
	
}