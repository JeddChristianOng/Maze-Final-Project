package Menu;
import javax.swing.*;

public class userDialog extends Player {
    ImageIcon icon = new ImageIcon("userlogin.jpg");
    ImageIcon background = new ImageIcon("bitwallpaper.png");
    protected String username;

    public void setUserNameDialog(){
        inputtedName(username = (String) JOptionPane.showInputDialog(null, "Enter a username",
                "User Dialog", JOptionPane.INFORMATION_MESSAGE, icon, null, ""));}
}
