/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gamePack;

/**
 *
 * @author admin
 */
public interface Projectile {
    //Implemented by all enemy Units i.e BasicUnit, and others to come
   public void moveObj(double d1,double d2,int speed);
      
   public String getType();
      
   public void setSpeed(double d1,double d2,int speed);
   
   public void checkCollision(Entry canvas,Lives lives);
   
}
