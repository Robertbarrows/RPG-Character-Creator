import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
/**
 * This class is used to create the user interface for creating a character.
 * @author Robert Barrows
 * @version 2/19/2017
 */
public class CharacterCreation implements ActionListener{
	
	private JFrame menu;
	
	private JButton createCharacter;
	
	private JPanel raceSelection;
	private ButtonGroup raceGroup;
	private JRadioButton humanOption;
	private JRadioButton elfOption;
	private JRadioButton dwarfOption;

	private JPanel genderSelection;
	private ButtonGroup genderGroup;
	private JRadioButton maleOption;
	private JRadioButton femaleOption;

	private JPanel classSelection;
	private ButtonGroup classGroup;
	private JRadioButton warriorOption;
	private JRadioButton mageOption;
	private JRadioButton theifOption;
	
	private JPanel statsSelection;
	private ButtonGroup statsGroup; 
	private JRadioButton strengthOption;
	private JRadioButton constitutionOption;
	private JRadioButton dexterityOption;
	private JRadioButton intelligenceOption;
	private JRadioButton wisdomOption;
	private JRadioButton charismaOption;
	
	  public CharacterCreation(String title) {
		  menu = new JFrame(title); 
		  menu.setSize(350, 250);
		  menu.setVisible(true);
		  menu.setResizable(false);
		  statsSelection = new JPanel();
		  statsSelection.setLayout(new GridLayout(0,1));
		  classSelection = new JPanel();
		  classSelection.setLayout(new GridLayout(0,1));
		  raceSelection = new JPanel();
		  raceSelection.setLayout(new GridLayout(0,1));
		  genderSelection = new JPanel();
		  genderSelection.setLayout(new GridLayout(0,1));
		  menu.setLayout(new FlowLayout());   
		  
		  createCharacter = new JButton("Create");
		  createCharacter.setActionCommand("create character");
		  createCharacter.addActionListener(this);
		  
		  maleOption = new JRadioButton("Male");
		  femaleOption = new JRadioButton("Female");
		  
		  humanOption = new JRadioButton("Human");
		  elfOption = new JRadioButton("Elf");
		  dwarfOption = new JRadioButton("Dwarf");
		  
		  warriorOption = new JRadioButton("Warrior");
		  mageOption = new JRadioButton("Mage");
		  theifOption = new JRadioButton("Theif");
		  
		  strengthOption = new JRadioButton("Strength");
		  constitutionOption = new JRadioButton("Constitution");
		  dexterityOption = new JRadioButton("Dexterity");
		  intelligenceOption = new JRadioButton("Intelligence");
		  wisdomOption = new JRadioButton("Wisdom");
		  charismaOption = new JRadioButton("Charisma");
		  
		  genderGroup = new ButtonGroup();
		  genderGroup.add(maleOption);
		  genderGroup.add(femaleOption);
		  
		  classGroup = new ButtonGroup();
		  classGroup.add(warriorOption);
		  classGroup.add(mageOption);
		  classGroup.add(theifOption);
		  
		  raceGroup = new ButtonGroup();
		  raceGroup.add(humanOption);
		  raceGroup.add(elfOption);
		  raceGroup.add(dwarfOption);
		  
		  statsGroup = new ButtonGroup();
		  statsGroup.add(strengthOption);
		  statsGroup.add(constitutionOption);
		  statsGroup.add(dexterityOption);
		  statsGroup.add(intelligenceOption);
		  statsGroup.add(wisdomOption);
		  statsGroup.add(charismaOption);
		  
		  raceSelection.add(humanOption);
		  raceSelection.add(elfOption);
		  raceSelection.add(dwarfOption);
		  
		  classSelection.add(warriorOption);
		  classSelection.add(mageOption);
		  classSelection.add(theifOption);
		  
		  statsSelection.add(strengthOption);
		  statsSelection.add(constitutionOption);
		  statsSelection.add(dexterityOption);
		  statsSelection.add(intelligenceOption);
		  statsSelection.add(wisdomOption);
		  statsSelection.add(charismaOption);
		  
		  genderSelection.add(maleOption);
		  genderSelection.add(femaleOption);
		  
		  menu.add(genderSelection);
		  menu.add(raceSelection);
		  menu.add(classSelection);
		  menu.add(statsSelection);
		  menu.add(createCharacter);
		  
		  menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
	  }
		@Override
	  public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand().equals("create character")){
		  if(raceGroup.getSelection()!= null){
			  if(classGroup.getSelection() != null){
				  if(genderGroup.getSelection() != null){
					  System.out.println("All the required radio buttons are selected!");
				  }else{
					  System.err.println("The Gender of your character has not been selected");
				  }
			  }else{
				  System.err.println("The Class of your character has not been selected");
			  }
		  }else{
			  System.err.println("The Race of your character has not been selected");
		  }
		}
	  }
}
