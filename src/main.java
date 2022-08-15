import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import org.json.JSONObject;
import org.json.JSONArray;
import Package.*;
import Package.Role.*;
import Package.Skills.*;
import Package.Volleyball.*;

public class main {
	
	public static void main(String[] args) {
		
		System.out.println("Volleyball Team Generator");
	
		String currentPath = System.getProperty("user.dir");
		String fileName = "pi";
		String content = readPlayerInformation(String.format("%s\\%s", currentPath, fileName));
			
		ArrayList<Player> players = new ArrayList<>();
		try {
			if (!content.isEmpty()) {
				JSONArray jsonArray = new JSONArray(content);
				
				players = ParseJsonToPlayerList(jsonArray);
			}
		} catch (Exception ex) {
			System.out.println("Parse json error: " + ex.toString() );
		}
		
		if (players != null) {
			System.out.println("Player count: " + players.size());
		}
		
		Team team = new Team();
		team.addPlayer(players);
		
		team.printString();
		
	}
	
	public static String readPlayerInformation(String path) {
		if (path.isEmpty()) return "";
		
		StringBuilder content = new StringBuilder();
		try {
			File file = new File(path);
			if (file.canRead()) {
				Scanner reader = new Scanner(file);
				while (reader.hasNextLine()) {
					content.append(reader.nextLine());
				}
			}
		} catch (FileNotFoundException  ex) {
			System.out.println("open file erroe.");
		}
		return content.toString();
	}
	
	public static ArrayList<Player> ParseJsonToPlayerList(JSONArray jsonArray) {
		ArrayList<Player> players = new ArrayList<>();
		if (jsonArray.length() <= 0) return players;
		try {
			for (int i = 0; i < jsonArray.length(); i ++ ) {
				JSONObject jsonObj = jsonArray.getJSONObject(i);
				
				String name = jsonObj.getString("Name");
				String gender = jsonObj.getString("Gender");
				int genderValue = (gender.equals(Gender.STRING_MALE) ? 1 : 0);
				
				JSONArray positionList = jsonObj.getJSONArray("Volletball_Position");
				int position = 0;
				for (int j = 0; j < positionList.length(); j ++) {
					position |= Position.getValue(positionList.getString(j));
				}
				
				JSONObject skillObj = jsonObj.getJSONObject("Volletball_Data");
				JSONObject serveObj = skillObj.getJSONObject("Serve");
				JSONObject attackObj = skillObj.getJSONObject("Attack");
				JSONObject defenceObj = skillObj.getJSONObject("Defence");
				JSONObject setObj = skillObj.getJSONObject("Set");
				
				Serve serve = new Serve();
				serve.setUnderhandLevel(serveObj.getInt("Underhand"));
				serve.setOverhandLevel(serveObj.getInt("Overhand"));
				
				Attack attack = new Attack();
				attack.setSpikeLevel(attackObj.getInt("Spike"));
				attack.setTipLevel(attackObj.getInt("Tip"));
				
				Defence defence = new Defence();
				defence.setPassLevel(defenceObj.getInt("Pass"));
				
				VolleyballData vData = new VolleyballData(serve, attack, defence, position);
				vData.setPosition(position);
				
				Player player = new Player(name, genderValue, vData);
				player.printString();
				
				players.add(player);
			}
			
		} catch (Exception ex) {
			System.out.println("Parse players json error: " + ex.toString());
		}
		
		return players;
	}
}





