import java.awt.*;
import java.applet.Applet;

import javax.swing.JApplet;
public class MixedApplet extends JApplet
{
  /* This example demonstrates nesting of containers inside other containers.
  Each container can have its own Layout Manager. Thus, we can achieve finer
  degress of control over component placement.  The applet is the main container
  and will use a BorderLayout.  It will use three Panels at North, Center, and
  South.  The Center panel itself will contain 2 other panels inside of it.
  */
  
  /* Note how all components are declared as class instance variables. Each method
  in this class can have access to them.  Do not redeclare such a component inside
  of init().
  */
  	
  Panel nPanel, sPanel, cPanel, tcPanel, bcPanel;
  Button one, two, three, four, five, six;
  Label bottom, lbl1, lbl2, lbl3;
  
  public void init()
  {
    nPanel = new Panel();              // north panel will hold three button
    nPanel.setBackground(Color.blue);  // give it color so you can see it
    one    = new Button("One");
    two    = new Button("Two");
    three  = new Button("Three");
/* Here is a bad idea. If you declared here, inside of init,
   Button three = new Button ("Three"); the class instance Button three would be
   "lost". It would LOOK like you had a button three on the applet, but it would
   not generate any action events.
*/
    // setLayout for North Panel and add the buttons
    nPanel.setLayout (new FlowLayout(FlowLayout.CENTER));
    nPanel.add(one);
    nPanel.add(two);
    nPanel.add(three);
    
    sPanel = new Panel();       // south Panel will just hold one Label
    sPanel.setBackground(Color.yellow);  // give it color so you can see it
    bottom = new Label("This is South");
    //set Layout and add Label
    sPanel.setLayout (new FlowLayout(FlowLayout.CENTER));
    sPanel.add (bottom);
    
    cPanel  = new Panel();     // center panel holds two other panels
    tcPanel = new Panel();     // top panel on center panel holds three labels
    tcPanel.setBackground(Color.gray);  // give it color so you can see it
    bcPanel = new Panel();     // bottom panel on center panel hold three buttons
    bcPanel.setBackground(Color.green);  // give it color so you can see it
    
    lbl1 = new Label("One");   // the labels
    lbl2 = new Label("Two");
    lbl3 = new Label("Three");
    
    four = new Button("Four"); // the buttons
    five = new Button("Five");
    six = new Button("Six");
    
    //set Layout for top center Panel and add labels
    tcPanel.setLayout (new GridLayout(1, 3, 5, 5));  // 1 row, 3 columns, 5 pixel gap
    tcPanel.add(lbl1);
    tcPanel.add(lbl2);
    tcPanel.add(lbl3);
    
    //set Layout for bottom center panel and add buttons
    bcPanel.setLayout (new GridLayout(3, 1, 5, 5));  // 3 rows, 1 col, 5 pixel gap
    bcPanel.add(four);
    bcPanel.add(five);
    bcPanel.add(six);
    
    //add two center panels (top and bottom) to the center panel
    cPanel.setLayout(new GridLayout(2, 1));  // 2 rows, 1 col, no gaps
    cPanel.add(tcPanel);
    cPanel.add(bcPanel);
    
    //set Layout for the Applet itself and add the panels
    this.setLayout (new BorderLayout());
    add(nPanel, BorderLayout.NORTH);
    add(sPanel, BorderLayout.SOUTH);
    add(cPanel, BorderLayout.CENTER);
  }
}
