import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.Font;
/**
 * <p>
 * The JFrameTest class creates the program frame, menu bar, menus, and menu items. 
 * It displays Help and About messages, and closes it when the user clicks on the close button. 
 * <p>
 * @author Sophia Nguyen & Hannah Kim
 * @version 1 01.28.15
 */
public class JFrameTest3 extends JFrame implements ActionListener{
    /**
     * The class constructor calls the superclass constructor. 
     * It creates and adds the app window, menu bar, File menu, the quit menu item, and the help menu item. 
     * It sets the size of the Frame to 400x400 pixels, and allows it to be visible. 
     * The user can exit the dialogs if they click the close button. 
     * The user can exit the program by clicking the 'x' button. 
     * <p>
     * <b>Variables: </b>
     * <p>
     * <b>helpItem </b> This creates an instance of a JMenuItem named "Help".
     * <p>
     * <b>quitItem </b> This creates an instance of a JMenuItem named "Quit".
     * <p>
     * <b>fileMenu </b> This creates an instance of a JMenu named "File".
     * <p>
     * <b>myMenus </b> This creates an instance of a JMenuBar.
     */
    public JFrameTest3() {
        super ("JFrame Test");
        
         TextTest t = new TextTest();
         add(t);
        /** */
        JMenuItem quitItem = new JMenuItem ("Quit");

        JMenu fileMenu = new JMenu ("File");

        JMenuItem helpItem = new JMenuItem ("Help");

        JMenu helpMenu = new JMenu ("Help");

        JMenuItem aboutItem = new JMenuItem ("About");

        fileMenu.add (helpItem);

        fileMenu.add (quitItem);

        helpMenu.add (aboutItem);

        JMenuBar myMenus = new JMenuBar ();

        helpItem.addActionListener (this);

        quitItem.addActionListener (this);

        aboutItem.addActionListener (this);

        myMenus.add (fileMenu);

        myMenus.add (helpMenu);

        setJMenuBar (myMenus);

        setSize (400, 400);
        setVisible (true);

        setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);  }

    /* 
     * The actionPerformed method closes the program if the user chose to quit 
     * and calls helpDialog if the user chose something else. 
     * @param ae stores an ActionEvent object from the user input 
     */ 
    public void actionPerformed (ActionEvent ae){
        if (ae.getActionCommand().equals("Quit")){
            dispose ();
        }
        else {
            helpDialog(ae);
        }
    }
    
    /*
     * The helpDialog method displays Help dialog and text if the user clicked the Help button.
     * It displays About Us dialog and text if the user clicked the About button. 
     * It allows the user to click the close button to close the dialogs. 
     * @param ae stores an ActionEvent object from the user input 
     */ 
    private void helpDialog (ActionEvent ae) {
        if (ae.getActionCommand().equals("Help")){
        JDialog myDialog = new JDialog(this, "Help Me");
        JLabel helpText;
        helpText = new JLabel ("Help Me!");
        helpText.setFont (new Font ("Serif",Font.PLAIN,16));  
        
        myDialog.setSize(100, 100);
        myDialog.setResizable(false);
        myDialog.setLayout(new FlowLayout());
        
        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                myDialog.dispose();
            }
        });
        myDialog.add(helpText);
        myDialog.add(closeButton);
        myDialog.setLocationRelativeTo(this);
        myDialog.setVisible(true);
    }
        if (ae.getActionCommand().equals("About")) {
            JDialog myDialog2 = new JDialog(this, "About Us");
            
            JLabel aboutText;
            aboutText = new JLabel ("Sophia - likes fried chicken and Hannah - plays competitive golf");
            aboutText.setFont (new Font ("Serif",Font.PLAIN,16));  
        
            myDialog2.setSize(500, 200);
            myDialog2.setResizable(false);
            myDialog2.setLayout(new FlowLayout());
            
            JButton closeButton2 = new JButton ("Close");
            closeButton2.addActionListener (new ActionListener()
            {
              public void actionPerformed (ActionEvent e)
              {
                myDialog2.dispose();
              }
            });
            
            myDialog2.add (aboutText);
            myDialog2.add(closeButton2);
            myDialog2.setLocationRelativeTo(this);
            myDialog2.setVisible(true);
        }
        }
    }
