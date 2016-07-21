/*<applet code=HelloSwing.class width=200 height=200>
</applet>
 */

import java.applet.AudioClip;
import java.awt.*; //Needed for basic Applet functions
import java.awt.event.*; //import event listeners
import javax.swing.JApplet; //import swing applet interface
import javax.swing.*; //import swing components

public class HelloSwing extends JApplet implements ActionListener
{
	private JLabel label1 = new JLabel("Hello Java Swing World");
	private JPanel pane1 = new JPanel();
	private JButton but1 = new JButton("ON");
	private JButton but2 = new JButton ("OFF");
	AudioClip mySound;
	java.awt.Image myPicture;
	
	//initialize the applet
	public void init()
	{ 
		getContentPane().add(label1, BorderLayout.NORTH);
		pane1.setLayout(new GridLayout(1,2));
		pane1.add(but1);
		pane1.add(but2);
		getContentPane().add(pane1, BorderLayout.SOUTH);
		but1.addActionListener(this);
		but2.addActionListener(this);
/*		
		// Add audio
		mySound = getAudioClip(getDocumentBase(), 
			"http://www.wavsource.com/snds_2015-07-19_1628654123857389"
			+ "/tv/bullwinkle/peabody_here.wav");
		
		// Add a picture
		myPicture = getImage(getCodeBase(), 
		  "http://www.gettyimages.ca/gi-resources/images/"
		  + "Homepage/Category-Creative/UK/UK_Creative_462809583.jpg");
		  */
	}
	
	public void actionPerformed(ActionEvent event) 
	{
		Object source = event.getSource();
		if(source == but1)
			label1.setVisible(true);
		else //if source == but2
			label1.setVisible(false);
	}
/*	
	public void start()
	{
		mySound.play(); // Causes the sound to play once
		showStatus(getAppletInfo() );
	}
	
	public void paint(Graphics g)
	{
		g.drawImage(myPicture, 20, 20, this);
	}
	*/
}
