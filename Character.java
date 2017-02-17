import java.util.ArrayList;
/**
 * This class holds the character statistics.
 * @author Robert Barrows
 * @version 2/11/2017
 */
public class Character {
	public final String FILE_NAME = "Character.txt";
	public final String FILE_DELIMITER = ",";
	
	private int id;
	private Stats stats;
	private String gender;
	private String characterClass;
	private String race;
	private ArrayList<String> abilities;
	private ArrayList<String> trades;
	
	public Character(int identifier){
		id = identifier;
		stats = new Stats();
		gender = "";
		characterClass = "";
		race = "";
		abilities = new ArrayList<String>();
		trades = new ArrayList<String>();
	}
	
	public Stats getStats() {
		return stats;
	}

	public void setStats(Stats stats) {
		this.stats = stats;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCharacterClass() {
		return characterClass;
	}

	public void setCharacterClass(String characterClass) {
		this.characterClass = characterClass;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public ArrayList<String> getAbilities() {
		return abilities;
	}

	public void setAbilities(ArrayList<String> abilities) {
		this.abilities = abilities;
	}

	public ArrayList<String> getTrades() {
		return trades;
	}

	public void setTrades(ArrayList<String> trades) {
		this.trades = trades;
	}

	public String toString(){
		return ""; // TODO: Change to correct string of data in a human readable format
	}
	
	public void save(){
		String fileData = id + FILE_DELIMITER + characterClass + FILE_DELIMITER + race + FILE_DELIMITER
				+ gender + FILE_DELIMITER + stats + FILE_DELIMITER + abilities + FILE_DELIMITER + trades;
		Save.file(FILE_NAME, fileData);
	}
}
