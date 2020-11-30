
import menuInteractions.*;

public class gameLauncher {
    public static void main(String[] args){
        //Player user = new Player();
        userDialog uD = new userDialog(); //Takes user input then assigns as player.
        uD.setUserNameDialog();
        gameMenuGUI gMGUI = new gameMenuGUI();
        gMGUI.displaygameMenuGUI();
    }

    public static void run(){}
}
