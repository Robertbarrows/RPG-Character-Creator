import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
/**
 * This class is the view of the MVC.
 * @author Robert Barrows
 * @version 2/17/2017
 */
public class View implements ActionListener{
	
	public Controller control;
	
	public JFrame menu;
	
	private JButton raceButton ; 
	private ButtonGroup raceGroup;
	private JRadioButton humanOption;
	private JRadioButton elfOption;
	private JRadioButton dwarfOption;
	
	private JButton genderButton;
	private ButtonGroup genderGroup;
	private JRadioButton maleOption;
	private JRadioButton femaleOption;
	
	private JButton classButton;
	private ButtonGroup classGroup;
	private JRadioButton warriorOption;
	private JRadioButton mageOption;
	private JRadioButton theifOption;
	
	private JButton tradeButton;
	
	private JButton statsButton;
	private ButtonGroup statsGroup; 
	private JRadioButton strengthOption;
	private JRadioButton constitutionOption;
	private JRadioButton dexterityOption;
	private JRadioButton intelligenceOption;
	private JRadioButton wisdomOption;
	private JRadioButton charismaOption;
	
	  public View(String title) {
		  menu = new JFrame(title);                    
		  menu.setLayout(new FlowLayout());      
	    
		  raceButton = new JButton("Race"); 
		  classButton = new JButton("Class");
		  statsButton = new JButton("Statistics");
		  genderButton = new JButton("Gender");
		  tradeButton = new JButton("Trades");
		  
		  raceButton.setActionCommand("race");
		  classButton.setActionCommand("class");
		  statsButton.setActionCommand("statistics");
		  genderButton.setActionCommand("gender");
		  tradeButton.setActionCommand("trades");
		  
		  raceButton.addActionListener(this); 
		  classButton.addActionListener(this);
		  statsButton.addActionListener(this);
		  genderButton.addActionListener(this);
		  tradeButton.addActionListener(this);
	    
		  menu.add(raceButton);                     
		  menu.add(classButton);
		  menu.add(statsButton);
		  menu.add(genderButton);
		  menu.add(tradeButton);
		  
		  menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
	  }
		@Override
		public void actionPerformed(ActionEvent ae) {
			switch (ae.getActionCommand()){
				case "race":
					menu.getContentPane().removeAll();
					humanOption = new JRadioButton("Human");
					elfOption = new JRadioButton("Elf");
					dwarfOption = new JRadioButton("Dwarf");
					raceGroup = new ButtonGroup();
					raceGroup.add(humanOption);
					raceGroup.add(elfOption);
					raceGroup.add(dwarfOption);
					menu.add(humanOption);
					menu.add(elfOption);
					menu.add(dwarfOption);
					menu.pack();
					break;
				case "class":
					menu.getContentPane().removeAll();
					warriorOption = new JRadioButton("Warrior");
					mageOption = new JRadioButton("Mage");
					theifOption = new JRadioButton("Theif");
					classGroup = new ButtonGroup();
					classGroup.add(warriorOption);
					classGroup.add(mageOption);
					classGroup.add(theifOption);
					menu.add(warriorOption);
					menu.add(mageOption);
					menu.add(theifOption);
					menu.pack();
					break;
				case "statistics":
					menu.getContentPane().removeAll();
					strengthOption = new JRadioButton("Strength");
					constitutionOption = new JRadioButton("Constitution");
					dexterityOption = new JRadioButton("Dexterity");
					intelligenceOption = new JRadioButton("Intelligence");
					wisdomOption = new JRadioButton("Wisdom");
					charismaOption = new JRadioButton("Charisma");
					statsGroup = new ButtonGroup();
					statsGroup.add(strengthOption);
					statsGroup.add(constitutionOption);
					statsGroup.add(dexterityOption);
					statsGroup.add(intelligenceOption);
					statsGroup.add(wisdomOption);
					statsGroup.add(charismaOption);
					menu.add(strengthOption);
					menu.add(constitutionOption);
					menu.add(dexterityOption);
					menu.add(intelligenceOption);
					menu.add(wisdomOption);
					menu.add(charismaOption);
					menu.pack();
					break;
				case "gender":
					menu.getContentPane().removeAll();
					maleOption = new JRadioButton("Male");
					femaleOption = new JRadioButton("Female");
					genderGroup = new ButtonGroup();
					genderGroup.add(maleOption);
					genderGroup.add(femaleOption);
					menu.add(maleOption);
					menu.add(femaleOption);
					menu.pack();
					break;
				case "trades":
					menu.getContentPane().setBackground(Color.BLACK); // Change the Frame's background color
					break;
				default:
					menu.getContentPane().setBackground(Color.GRAY);
					break;
			}
			menu.repaint();
		}
	public void setVisible(boolean visibility){
		menu.setVisible(visibility);
	}
	public void setSize(int width, int height){
		menu.setSize(width, height);
	}
}
