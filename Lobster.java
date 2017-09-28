import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Animal
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        lookForCrab();
        move();
        worldEdge();
        randTurn();
    }
    /**
     * Check if we are on a Crab or not, if we are we eat it otherwise we continue
     * whitout doing anything
     */
    public void lookForCrab(){
        if(canSee(Crab.class)){
            eat(Crab.class);
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
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
        if( Greenfoot.getRandomNumber(20) == 1 ){
            turn(Greenfoot.getRandomNumber(180));
        }
    }   
}
