/**
 * This class holds the numerical statistics of a character.
 * @author Robert Barrows
 * @version 2/19/2017
 */
public class Stats {
	private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;
	
	public Stats(){
		strength = -1;
		dexterity = -1;
		constitution = -1;
		intelligence = -1;
		wisdom = -1;
		charisma = -1;
		
	}
	
	public int getConstitution() {
		return constitution;
	}

	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getWisdom() {
		return wisdom;
	}

	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}

	public int getCharisma() {
		return charisma;
	}

	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	public int getDexterity() {
		return dexterity;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}
	
	public String toString(){
		return ""; //TODO: Change to correct string of data to write to file
	}
}
