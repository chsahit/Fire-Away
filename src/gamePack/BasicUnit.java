/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gamePack;
import acm.graphics.GObject;
import acm.graphics.GRect;
import java.awt.Color;
/**
 *
 * @author admin
 */
public class BasicUnit extends GRect implements Projectile,Runnable{
    //the basic enemy unit
    double d1Obj;
    double d2Obj;
    int speedObj;
    Entry canvas;    
    @Override
    //when the thread is kicked off theses are the executed comanfs
    public void run() {
        while(true){
            moveObj(d1Obj,d2Obj,speedObj);                 
        }
    }
    //constructor
    public BasicUnit(double p3,double d1,double d2,int time,Entry program){
        super(p3,p3);
        setSpeed(d1,d2,time);
        this.setFilled(true);
        this.setFillColor(Color.YELLOW);
        canvas=program;
    }
    
    //animates the object
    @Override
    public void moveObj(double d1,double d2,int speed){
        this.move(d1, d2);
        pause(speed);
    }

  
    
    @Override
    public String getType() {
        return "BasicRect";
    }

    /**
     * takes speed from constructor so it can be passed to the moveObj method
     * @param d1 horizontal offset
     * @param d2 vertical offset
     * @param speed pause time
     */
    @Override
    public void setSpeed(double d1, double d2, int speed) {
        d1Obj=d1;
        d2Obj=d2;
        speedObj=speed;
    }

    @Override
    public void checkCollision(Entry canvas,Lives lives){
        double xPos=getX();
        double yPos=getY();
        GObject object=canvas.getElementAt(xPos,yPos);
        try{
            String objString=object.toString();
            if(objString.contains("Castle")){
                //lives.incrementLives(-1);
            }            
        }
        catch(Exception e){}
        
    }

          
}
