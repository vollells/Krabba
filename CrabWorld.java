import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        spawnStuff();
    }
    public void spawnStuff(){
        addObject( new Crab(), 150, 100 );
        addObject( new Birb(), 450, 450 );
        for(int i = 1; i <7 ; i++){
        	addObject( new Worm(), (10 + Greenfoot.getRandomNumber(540)), 
        	(10 + Greenfoot.getRandomNumber(540)));
        }
        for(int i = 1; i <4 ; i++){
        	addObject( new Lobster(), ( 10 + Greenfoot.getRandomNumber(540)), 
        	(10 + Greenfoot.getRandomNumber(540)));
        }
    }
}