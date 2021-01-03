import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.Font;
/**
 * The JFrameTest class creates the application window,
 * menu bar, File menu, the Quit File menu item and the Help File menu item. It then adds
 * the menu items to the File menu and the File menu to the
 * menubar. It also ensures that the window will close if the user
 * clicks the 'x' button.
 *
 *
 * @author Sophia Nguyen & Hannah Kim
 * @version 1 01.28.15
 */
public class JFrameTest3 extends JFrame implements ActionListener{
    /**
     * The class constructor passes a String title when it creates
     * the superclass object. It then creates the application window,
     * menu bar, File menu, the Quit File menu item and the Help File menu item. It then adds
     * the menu item to the File menu and the File menu to the
     * menubar. It sets the size of the Frame to 400x400, and
     * ensures it will be visible.  It also ensures that the
     * window will close if the user clicks the 'x' button.
     * <p>
     * <b>Local variables: </b>
     * <p>
     * <b>helpItem </b> This creates an instance of the JMenuItem class called "Help".
     * <p>
     * <b>quitItem </b> This creates an instance of the JMenuItem class called "Quit".
     * <p>
     * <b>fileMenu </b> This creates an instance of the JMenu class called "File".
     * <p>
     * <b>myMenus </b> This creates an instance of the JMenuBar class.
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

    public void actionPerformed (ActionEvent ae){
        if (ae.getActionCommand().equals("Quit")){
            dispose ();
        }
        else {
            helpDialog(ae);
        }
    }

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
        
            myDialog2.setSize(100, 200);
            myDialog2.setResizable(false);
            myDialog2.setLayout(new FlowLayout());
            
            JButton closeButton2 = new JButton ("Close");
            closeButton.addActionListener (new ActionListener()
            {
              public void actionPerformed (ActionEvent e)
              {
                aboutDialog.dispose();
              }
            });
            
            myDialog2.add (aboutValue);
            myDialog2.add(closeButton2);
            myDialog2.setLocationRelativeTo(this);
            myDialog2.setVisible(true);
        }
        }
    }
