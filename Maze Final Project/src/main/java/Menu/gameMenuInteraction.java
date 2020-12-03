package Menu;

import MazeGame.mazeMapsController;
import PlayMaze.MapSelector;
public class gameMenuInteraction extends gameMenuLogic{
    private String gameMode;
    void setGameMode(String gm){ this.gameMode = gm; buttonUserInteraction();}
    void buttonUserInteraction() {
        switch (gameMode) {
            case "INSTRUCTIONS" -> instructionAction();
            case "EASY" -> easyModeAction();
            case "MEDIUM" -> mediumModeAction();
            case "HARD" -> hardModeAction();
            case "VIEWSCORES" -> viewScoreAction();
            case "EXIT" -> exitGameAction();
            default -> System.out.println("No Button User Interaction");
            }}}

abstract class gameMenuLogic extends MapSelector{
    void instructionAction() {new Display_Files("INSTRUCTIONS");}
    void easyModeAction() { setMAP("EASY"); new mazeMapsController();}
    void mediumModeAction() {setMAP("MEDIUM");new mazeMapsController();}
    void hardModeAction() {setMAP("HARD");new mazeMapsController();}
    void viewScoreAction() {new Display_Files("DATA");}
    void exitGameAction() {System.out.println("EXITING GAME"); System.exit(0);}
}









