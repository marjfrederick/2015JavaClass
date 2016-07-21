/*********************************************************************************
 * Course: CSC 240 Java Programming                                              *
 * Instructor: Carmella Garcia                                                   *
 * Module 5 Assignment 2: Java Applet                                            *
 * Due 08/08/15                                                                  *
 * Author: Marj Frederick                                                        *
 *                                                                               *
 *  This program creates an applet that can run in a browser                     *
 *  The program imports my picture, a short biography and an mp3 file that       *
 *  plays when a button is pressed. When the button is selected a second time,   *
 *  the music stops.                                                             *
 *                                                                               *                                  
 * *******************************************************************************/
package HomeworkApplet;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image; 
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //import event listeners

import javax.swing.JApplet; //import swing components
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

/* <applet code="BioApplet" width=760 height=400>
</applet> */

public class BioApplet extends JApplet implements ActionListener
{
	private Image myPicture;        // photo
	private JPanel cPane = new JPanel();  // center pane
	private JButton btn = new JButton("Music");  // Music button
	private SoundJLayer mySound;  // sound
	private boolean playing = false;  // sound on/off toggle
	
	public boolean isPlaying()
	{
		return playing;
	}

	public void setPlaying(boolean playing)
	{
		this.playing = playing;
	}

	public void init()
	{		
		// Create a grid layout for the bio labels
		GridLayout gLayout = new GridLayout (10, 1, 0, 5); // 10 rows, 1 column, hgap, vgap
		cPane.setLayout(gLayout); 
		Label bio1 = new Label ("Hi, I'm Marj. I grew up in Dubuque, IA.  I am"
				+ " the 8th of 9 kids.  I", Label.LEFT);
		Label bio2 = new Label ("have a twin brother who is older by 6 minutes."
				+ "  No, we are not", Label.LEFT);
		Label bio3 = new Label ("identical!  I met my husband in college.  We"
				+ " moved to Colorado", Label.LEFT);
		Label bio4 = new Label (" over 30 years ago.  We love Colorado!  We"
				+ " have a 20 year old", Label.LEFT);
		Label bio5 = new Label (" son and two dogs.  In the summer, I love to"
				+ "  walk my dogs along", Label.LEFT);
		Label bio6 = new Label (" the canal by our house.  I currently teach"
				+ "  high school math,", Label.LEFT);
		Label bio7 = new Label ("science and robotics classes at Cornerstone"
				+ "  Christian Academy", Label.LEFT);
		Label bio8 = new Label ("in Westminster, CO.  www.ccabulldogs.org",
				Label.LEFT);
		Label bio9 = new Label ("");
		Label bio10 = new Label ("Have an AWESOME Day!!!", Label.LEFT);
		cPane.add(bio1);
		cPane.add(bio2);
		cPane.add(bio3);
		cPane.add(bio4);
		cPane.add(bio5);
		cPane.add(bio6);
		cPane.add(bio7);
		cPane.add(bio8);
		cPane.add(bio9);
		cPane.add(bio10);
		
		// Set the layout for the Applet itself and add nodes
		SpringLayout layout = new SpringLayout();
		this.setLayout(layout); 
		add(cPane, SpringLayout.EAST);
		add(btn, SpringLayout.SOUTH);
		
		// Adjust constraints for the cPane so it is at (320, 50)
		// 320 pixels from the left side and 50 from the top
		layout.putConstraint(SpringLayout.WEST, cPane, 320,
				SpringLayout.WEST, getContentPane());
		layout.putConstraint(SpringLayout.NORTH, cPane, 50, 
				SpringLayout.NORTH, getContentPane());
		
		// Adjust constraints for the button (100, 5) 
		// 100 pixels from the left side and 5 from the bottom
		layout.putConstraint(SpringLayout.WEST, btn, 100,
				SpringLayout.WEST, getContentPane());
		layout.putConstraint(SpringLayout.SOUTH, btn, 5, 
				SpringLayout.SOUTH, getContentPane());		
		
		// add the Event action to the "Music" button
		btn.addActionListener(this);

		// Load the picture
		myPicture = getImage(getCodeBase(), "HomeworkApplet/IMG_9194.jpg");
		
		// Load the sound
		mySound = new SoundJLayer("HomeworkApplet/bensound-acousticbreeze.mp3");
		
		// Resize the layout
		this.resize( new Dimension( 760, 400 ) );

	}
	
	public String getAppletInfo()
	{
		return "Hi...";
	}
	
	public void start() 
	{
		showStatus(getAppletInfo());
	}
	
	public void paint(Graphics g) 
	{	
		// start drawing picture at (20, 30), width = 256 pixels, height = 322
		// which is 0.15 times the original size of the picture (1706 x 2145)
		g.drawImage(myPicture, 20, 30, 256, 322, this);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
	
		// Button has been selected, stop playing the music
		if(source == btn && isPlaying())
		{
			mySound.stopPlayback();
			setPlaying (!isPlaying());
		}
		else  // turn the music on
		{
			mySound.play();	
			setPlaying (!isPlaying());
		}
	}
}
