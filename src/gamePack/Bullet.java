/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gamePack;
import acm.graphics.GObject;
import acm.graphics.GOval;
import java.awt.Color;
/**
 *
 * @author admin
 */
public class Bullet extends GOval implements Runnable{
    Entry canvas;
    public Bullet(int size,Entry mainClass){
        super(size,size);
        setFilled(true);
        setFillColor(Color.RED);
        canvas=mainClass;
    }

    @Override
    public void run() {
        while(this.getY()>-30){
            move(0,-10);
            pause(20);
            checkCollision(canvas);
        }
    }
    public void checkCollision(Entry canvas){
        double xPos=getX();
        double yPos=getY();
        GObject object=canvas.getElementAt(xPos, yPos);
        try{
            String objectString=object.toString();
            if(objectString.contains("BasicUnit")){
                canvas.remove(object);
            }                            
        }
        catch(Exception e){}
    }
}
