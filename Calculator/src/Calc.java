import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;



public class Calc {
    int boardWidth = 360; //window
    int boardHeight = 540; //window

    Color customLightPink = new Color(235,176,205);
    Color customLightBlue = new Color(159,224,245);
    Color customLightPurple = new Color(178,160,221);
    Color customFrost = new Color(116,140,195);

    JFrame frame = new JFrame("Calculator"); //window
    JLabel displayLabel = new JLabel(); //display
    JPanel displayPanel = new JPanel(); //panel for display



    Calc(){
         frame.setVisible(true); //make frame visible
         frame.setSize(boardWidth, boardHeight); //set size of frame
         frame.setLocationRelativeTo(null); //center frame on screen
         frame.setResizable(false); //make frame not resizable
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit program when window is closed
         frame.setLayout(new BorderLayout()); //set layout manager
          
         displayLabel.setBackground(customFrost); //set background color of display
         displayLabel.setForeground(Color.WHITE); //set text color of display
         displayLabel.setFont(new Font("Arial", Font.PLAIN, 80)); //set font
         displayLabel.setHorizontalAlignment(JLabel.RIGHT); //align text to the bottom
         displayLabel.setText("0"); //set initial text
         displayLabel.setOpaque (true);

            displayPanel.setLayout(new BorderLayout()); //set layout manager    
            displayPanel.add(displayLabel);
            frame.add(displayPanel);
    }

}
