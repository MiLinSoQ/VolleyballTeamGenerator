package Package;

import java.util.*;
import Package.Role.*;
import Package.Volleyball.*;

public class TeamGenerator {
	
	public static void generator(List<Player> players, int teams) {
		
		if (players.isEmpty()) return;
		
		for (int i = 0; i < players.size(); i ++) {
			Player player = players.get(i);
			
			player.printString();
		}
	}
}