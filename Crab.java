import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Animal
{
    int wormsEaten = 0;
    public void act()
    {
        lookForWorm();
        moveCrab();
        worldEdge();
        TurnCrab();
    }
    /**
     * Check if we are on a worm or not, if we are we eat it otherwise we continue
     * whitout doing anything
     */
    public void lookForWorm(){
        if(canSee(Worm.class)){
            eat(Worm.class);
            Greenfoot.playSound("slurp.wav");
            wormsEaten++;
        }
        if(wormsEaten == 6){
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
    /**
     * If q is down turn left 4 degrees
     * If e is down turn right 4 degrees
     */
    public void TurnCrab(){
        if(Greenfoot.isKeyDown("q")){
            turn(-4);
        }
        if(Greenfoot.isKeyDown("e")){
            turn(4);
        }

    }
    public void moveCrab(){
        if(Greenfoot.isKeyDown("w")){
            move();
        }
    }
}


