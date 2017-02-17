/**
 * This class holds the numerical statistics of a character.
 * @author Robert Barrows
 * @version 2/11/2017
 */
public class Stats {
	private int strength;
	private int magic;
	private int dexterity;
	
	public Stats(){
		strength = -1;
		magic = -1;
		dexterity = -1;
	}
	
	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getMagic() {
		return magic;
	}

	public void setMagic(int magic) {
		this.magic = magic;
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
