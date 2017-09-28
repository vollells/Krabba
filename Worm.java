import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Worm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Worm extends Animal
{
    /**
     * Act - do whatever the Worm wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        worldEdge();
        randTurn();
        if(Greenfoot.getRandomNumber(3) == 1){
            move();
        }
    }
    /**
     * If at world edge turn 17 degrees
     */
    public void worldEdge(){
        if ( atWorldEdge() ){
                turn(17);
            }
    }
    public void randTurn(){
        if( Greenfoot.getRandomNumber(40) == 1 ){
            turn(Greenfoot.getRandomNumber(180));
        }
    } 
}
