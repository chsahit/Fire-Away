package gamePack;
import acm.program.GraphicsProgram;
import java.awt.event.MouseEvent;
import java.util.Random;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Entry extends GraphicsProgram{

    /**
     * @param args the command line arguments
     */        
    Menus menuInit=new Menus();    
    Random randomizer=new Random();
    Lives life=new Lives();
    //jumps to init() method
    public static void main(String[] args) {
        // TODO code application logic here     
        new Entry().start();        
    }
    @Override
    //Title Screen and MouseListeners added, jumps to run() method
    public void init(){        
        menuInit.initTitle(this, 300,200);
        waitForClick();
        addMouseListeners();
    }
    @Override
    //code logic
    public void run(){
        removeAll();   
        Castle castle=new Castle(Constants.PERIMETER_POINT,Constants.APPLICATION_WIDTH,Constants.PERIMETER_HEIGHT);
        add(castle);
        add(castle.createPerimeter());
        while(true){
            int spawnpoint=randomizer.nextInt(Constants.APPLICATION_WIDTH-Constants.BASIC_UNIT_SIZE);
            BasicUnit enemy=new BasicUnit(Constants.BASIC_UNIT_SIZE,0,Constants.BU_DOWNMOV,Constants.BU_PAUSE_TIME,this);
            add(enemy,spawnpoint,0);
            Thread enemyThread=new Thread(enemy);
            enemyThread.start();   
            pause(Constants.PAUSE_TIME);
        }
    }
    /**
     * creates a new bullet on click
     * @param e the MouseEvent Object which corresponds to the press
     */
    public void mousePressed(MouseEvent e){
        if(e.getY()>390){
            double locX=e.getX();
            double locY=e.getY();       
            Bullet bullet=new Bullet(Constants.BULLET_SIZE,this);
            add(bullet,locX,locY);
            Thread bulletThread=new Thread(bullet);
            bulletThread.start();
        }      
    }
}
