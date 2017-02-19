/**
 * This program is to take in the rules set forth by the user to randomly generate character's statistics:
 * Class, Gender, Strength/Magic/Dexterity points, extra abilities or trades.  This will also save
 * it to a file which is readable/printable for a dungeon master
 * @author Robert Barrows
 * @version 2/19/2017
 */
public class Controller {
	public static void main(String[] args) {
		CharacterCreation frm = new CharacterCreation("Character Selection");
		Controller control = new Controller();
		Character createdCharacter = new Character(1);
		Stats stats = new Stats();
	    
	   // createdCharacter.setCharacterClass();
	   // createdCharacter.setGender();
	   // createdCharacter.setRace();
	   // stats.setStrength();
	   // stats.setMagic();
	   // stats.setDexterity();
	}
	public Controller(){
		
	}
}
