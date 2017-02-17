/**
 * This program is to take in the rules set forth by the user to randomly generate character's statistics:
 * Class, Gender, Strength/Magic/Dexterity points, extra abilities or trades.  This will also save
 * it to a file which is readable/printable for a dungeon master
 * @author Robert Barrows
 * @version 2/11/2017
 */
public class Controller {
	public static void main(String[] args) {
		View frm = new View("Character Selection");

	    frm.setSize( 500, 500 );     
	    frm.setVisible( true );  
	}
}
