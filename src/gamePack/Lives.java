/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gamePack;

/**
 *
 * @author admin
 */
public class Lives {
    private int lives=3;
    public void incrementLives(int newLives){
        lives=lives+newLives;                
    }
    public int getLives(){
        return lives;
    }
    public boolean dead(){
        if(lives==0){
            return true;
        }else{
            return false;
        }
    }
}
