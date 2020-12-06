package Menu;
import javax.swing.*;
import javax.swing.JFrame;


public class gameMenuGUI extends gameMenuInteraction{
    ImageIcon background = new ImageIcon("bitwallpaper.png");
    ImageIcon title = new ImageIcon("mazegametitle.png");
    private JButton instructionButton, easyButton, mediumButton, hardButton, scoreButton, exitButton; //testButton;           //buttons
    private JPanel gameMenuGUIPanel;
    private final JLabel label = new JLabel(background), titleLabel = new JLabel(title);
    private JFrame frame;

    public gameMenuGUI(){ //BUTTONS THAT HAVE ACTIONS LISTENERS
        instructionButton.setBounds(280, 125, 150, 25);
        easyButton.setBounds(280, 150, 150, 25);
        mediumButton.setBounds(280, 175, 150, 25);
        hardButton.setBounds(280, 200, 150, 25);
        scoreButton.setBounds(280, 225, 150, 25);
        exitButton.setBounds(280, 250, 150, 25);
        titleLabel.setBounds(110,-40,500,200);

        instructionButton.addActionListener(e -> setGameMode("INSTRUCTIONS"));      //buttons with action listener
        easyButton.addActionListener(e -> setGameMode("EASY"));                   //when button is pressed
        mediumButton.addActionListener(e -> setGameMode("MEDIUM"));               //it passes a String value
        hardButton.addActionListener(e -> setGameMode("HARD"));                   //of the Game Mode
        scoreButton.addActionListener(e -> setGameMode("VIEWSCORES"));
        exitButton.addActionListener(e -> setGameMode("EXIT"));

        label.add(titleLabel);
        label.add(instructionButton);
        label.add(easyButton);
        label.add(mediumButton);
        label.add(hardButton);
        label.add(scoreButton);
        label.add(exitButton);
    }

    public void displaygameMenuGUI(){
        label.setSize(650, 450);//frame is created
        frame = new JFrame("Menu");
        frame.setResizable(false);
        frame.setContentPane(new gameMenuGUI().gameMenuGUIPanel);
        frame.add(label);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null); //PLACES FRAME IN THE CENTER OF THE SCREEN
        frame.setVisible(true);
        frame.setSize(650, 450);}
}



