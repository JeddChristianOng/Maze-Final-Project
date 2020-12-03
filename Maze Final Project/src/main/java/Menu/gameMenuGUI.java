package Menu;
import javax.swing.*;
import javax.swing.JFrame;

public class gameMenuGUI extends gameMenuInteraction{
    private JButton instructionButton, easyButton, mediumButton, hardButton, scoreButton, exitButton;           //buttons
    private JPanel gameMenuGUIPanel;
    private JLabel label = new JLabel();

    public gameMenuGUI(){ //BUTTONS THAT HAVE ACTIONS LISTENERS
        //label.setIcon(new ImageIcon("bitwallpaper.png"));
        //gameMenuGUIPanel.add(label);
        instructionButton.addActionListener(e -> setGameMode("INSTRUCTIONS"));      //buttons with action listener
        easyButton.addActionListener(e -> setGameMode("EASY"));                   //when button is pressed
        mediumButton.addActionListener(e -> setGameMode("MEDIUM"));               //it passes a String value
        hardButton.addActionListener(e -> setGameMode("HARD"));                   //of the Game Mode
        scoreButton.addActionListener(e -> setGameMode("VIEWSCORES"));
        exitButton.addActionListener(e -> setGameMode("EXIT"));}

    public void displaygameMenuGUI(){                                                    //frame is created
        JFrame frame = new JFrame("Game Menu");
        //frame.add(label);
        frame.setResizable(true);
        frame.setContentPane(new Menu.gameMenuGUI().gameMenuGUIPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null); //PLACES FRAME IN THE CENTER OF THE SCREEN
        frame.setVisible(true);
        frame.setSize(200, 192);}
}
