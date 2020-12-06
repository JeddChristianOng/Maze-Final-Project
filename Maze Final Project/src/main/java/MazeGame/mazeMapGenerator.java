package MazeGame;

import PlayMaze.MapSelector;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Rectangle2D;
import java.util.EventListener;

class mazeMapGenerator extends JPanel implements ActionListener, EventListener, KeyListener{
    final Color RED = Color.RED, BLACK = Color.BLACK, WHITE = Color.WHITE, GRAY = Color.GRAY;
    int[][] MAP = MapSelector.selectedMAP;
    double x = 100, y =100, velx = 0, vely = 0;
    protected int jframeHeight = MAP.length * 80, jframeWidth = MAP[0].length * 80;
    Timer tm = new Timer(1, this);
    Graphics2D g1, g2;
    Shape circle;
    Rectangle rect;

    public mazeMapGenerator(){                              //THIS IS A CONTROLLER METHOD; SHOULD MOVE IT.
        tm.start();                                         //IMPORTANT; LISTEN TO FRAME IF THERE IS ANY KEY ACTION MADE; 1 SECOND DELAY FOR IT TO LISTEN AGAIN.
        addKeyListener(this);                            //REFERS EITHER TO THE FRAME OR POLYGON THAT IS MADE
        setFocusable(true);                                //IMPORTANT; HELPS REFRESH POSITION OF PLAYER OBJ.
        setFocusTraversalKeysEnabled(false);}

    public void paintComponent(Graphics g){
        g1 = (Graphics2D) g; g2 = (Graphics2D) g;
        for(int row = 0; row < MAP.length; row++){
            for(int col = 0; col < MAP[0].length; col++){
                switch(MAP[row][col]){
                    case 1 -> g1.setColor(BLACK);
                    case 2 -> g1.setColor(GRAY);
                    case 3 -> g1.setColor(RED);
                    case 0 -> g1.setColor(WHITE);
                }g1.fill(rect=new Rectangle(80 * col, 80 * row, 80, 80));}}  //SETS THE COLOR OF RECT AND DRAWS IT
        g2.setColor(Color.BLUE);
        g2.fill(circle = new Rectangle2D.Double(x, y, 40, 40));
    } //THIS IS THE PLAYER OBJECT THAT IS DISPLAYED.

    public void actionPerformed(ActionEvent e){ //METHOD IS ACCESSED WHEN A KEY IS PRESSED
        System.out.println("x: "+ x + " y: " + y);
        if(x < 0){ velx = 0; x = 0;}
        else if(x > jframeWidth-50){  velx = 0; x = jframeWidth - 50;}
        else if(y < 0){ vely = 0; y = 0;}
        else if(y > jframeHeight - 55){ vely = 0; y = jframeHeight-55;}
        x +=velx; y += vely; repaint();}

    public void keyPressed(KeyEvent e){ //CALLS MOVEMENT DEPENDING ON KEYEVENT E
        switch(e.getKeyCode()){
            case KeyEvent.VK_UP, KeyEvent.VK_W -> up();
            case KeyEvent.VK_S, KeyEvent.VK_DOWN -> down();
            case KeyEvent.VK_A, KeyEvent.VK_LEFT -> left();
            case KeyEvent.VK_D, KeyEvent.VK_RIGHT -> right();}}

    public void keyTyped (KeyEvent e){}
    public void keyReleased (KeyEvent e){ velx = 0; vely = 0;} // POSITION OF PLAY REMAINS IF KEY IS RELEASED
    private void up(){ vely = -1;velx = 0;}
    private void down(){ vely = 1;velx = 0;}
    private void left(){ velx = -1; vely = 0;}
    private void right(){ velx = 1; vely = 0;}

    void checkMazeConditions(){
        //check current position
        //if player object color touches the color of the wall
        //reset to the start position
        //time will still continue
    }
}
