import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Birb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Birb extends Animal
{
    int lobstersEaten = 0;
    /**
     * Act - do whatever the Birb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        lookForLobster();
        moveBirb();
        worldEdge();
        turnBirb();
    }
    /**
     * Check if we are on a Crab or not, if we are we eat it otherwise we continue
     * whitout doing anything
     */
    public void lookForLobster(){
        if(canSee(Lobster.class)){
            eat(Lobster.class);
            Greenfoot.playSound("au.wav");
            lobstersEaten++;
        }
        if(lobstersEaten == 3){
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
     public void turnBirb(){
        if(Greenfoot.isKeyDown("left")){
            turn(-4);
        }
        if(Greenfoot.isKeyDown("right")){
            turn(4);
        }

    }
    public void moveBirb(){
        if(Greenfoot.isKeyDown("up")){
            move();
        }
    }
}
