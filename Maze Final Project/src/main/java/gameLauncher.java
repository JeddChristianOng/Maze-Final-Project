import Menu.gameMenuGUI;
import Menu.userDialog;

public class gameLauncher {
    public static void main(String[] args){
        userDialog uD = new userDialog();
        uD.setUserNameDialog();
        gameMenuGUI gMGUI = new gameMenuGUI();
        gMGUI.displaygameMenuGUI();
    }}
