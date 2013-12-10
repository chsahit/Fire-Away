/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gamePack;
import acm.graphics.*;
import java.awt.Color;
/**
 *
 * @author admin
 */
public class Menus {
    private GLabel welcome=new GLabel("Fire Away");
    private GLabel author=new GLabel("Developed by Sahit Chintalapudi");
    
    /**
     * creates the title screen
     * @param canva the canvas I'm drawing to
     * @param width screen width
     * @param height screen height
     */
    public void initTitle(Entry canvas,int width,int height){
        welcome.setColor(Color.RED);
        welcome.setFont("Arial-30");
        author.setColor(Color.RED);
        canvas.setBackground(Color.BLACK);
        canvas.add(welcome,width,height);      
        canvas.add(author,width+250,height+200);
    }
    public void initField(){
        //TODO add code for setting images as a background, to be added after game is finished
    }    
}

