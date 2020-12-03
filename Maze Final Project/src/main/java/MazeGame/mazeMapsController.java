package MazeGame;
import javax.swing.*;


public class mazeMapsController extends JFrame{
      public mazeMapsController(){
          mazeMapGenerator maps = new mazeMapGenerator();
          add(maps);
          setTitle("MAZE GAME");
          setVisible(true);
          setResizable(false);
          setSize(maps.jframeWidth, maps.jframeHeight);
          setDefaultCloseOperation(DISPOSE_ON_CLOSE);}}






