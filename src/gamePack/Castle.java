/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gamePack;
import acm.graphics.GLine;
import acm.graphics.GRect;
import java.awt.Color;
/**
 *
 * @author admin
 */
public class Castle extends GRect{
    //the castle the gamer is trying to protect, my var namess aren't great
    int fence;
    int appWidth;
    public Castle(int point,int width,int height){
        super(0,point,width,height);
        setFilled(true);
        setFillColor(Color.WHITE);
        fence=point;
        appWidth=width;
    }
     public GLine createPerimeter(){
         GLine fenceLine=new GLine(0,fence-50,appWidth,fence-50);
         fenceLine.setColor(Color.WHITE);         
         return fenceLine;
     }
}
