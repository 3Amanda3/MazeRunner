import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class MazeWalker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeWalker extends Actor
{
    private final int NORTH = 270;
    private final int EAST = 0;
    private final int SOUTH = 90;
    private final int WEST = 180;

    /**
     * mazeWalker is the constructor for mazeWalker class
     * @param no parameters
     * @return nothing is returned
     */
    public MazeWalker()
    {
        GreenfootImage playImage = new GreenfootImage(40,40);

        playImage.setColor(Color.GREEN);
        playImage.fillRect(0,0,40,40);

        setImage(playImage);
    }

    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * @param no parameters
     * @return nothing is returned
     */
    public void act() 
    {
        checkWin();

        if( Greenfoot.isKeyDown("down"))
        {
            setRotation(SOUTH);
        }         
        if(Greenfoot.isKeyDown("up"))
        {
            setRotation(NORTH);
        }
        if( Greenfoot.isKeyDown("left"))
        {
            setRotation(WEST);
        }
        if( Greenfoot.isKeyDown("right"))
        {
            setRotation(EAST);
        }

        if( canMoveForward() == true)
        {
            if( Greenfoot.isKeyDown("down"))
            {
                move(1);
            }         
            if(Greenfoot.isKeyDown("up"))
            {
                move(1);
            }
            if( Greenfoot.isKeyDown("left"))
            {
                move(1);
            }
            if( Greenfoot.isKeyDown("right"))
            {
                move(1);
            }
        }
    } 

    /**
     * CheckWin will check if the player is touching the winning space
     * @param there are no parameters
     * @return nothing is returned
     */
    private void checkWin()
    {        
        if(getOneIntersectingObject(WinSpace.class) != null)
        {
            getWorld().showText("YOU HAVE WON!", getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
    }

    /**
     * canMoveForward will check if the player can move forward
     * @param there are no parameters
     * @return will return moveForward
     */
    private boolean canMoveForward()
    {   
        int xOffset = 0;
        int yOffset = 0;

        boolean moveForward = false;

        if( getRotation() == NORTH )
        {
            yOffset = -1;           
        }
        else if(getRotation() == SOUTH)
        {
            yOffset = 1;            
        }
        else if(getRotation() == EAST)
        {
            xOffset = 1;            
        }
        else 
        {
            xOffset = -1;            
        }

        if( getOneObjectAtOffset(xOffset,yOffset,Wall.class) == null )
        {
            moveForward = true;         
        }

        return moveForward;
    }
}