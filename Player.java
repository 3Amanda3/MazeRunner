import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private final int NORTH = 270;
    private final int EAST = 0;
    private final int SOUTH = 90;
    private final int WEST = 180;

    /**
     * player is the constructor class for the player class
     * @param no parameters
     * @return nothing is returned
     */
    public Player()
    {
        GreenfootImage playImage = new GreenfootImage(40,40);

        playImage.setColor(Color.RED);
        playImage.fillRect(0,0,40,40);

        setImage(playImage);   
        setRotation(EAST);
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

        if(wallOnLeft() == true)
        {
            if(canMoveForward() == true)
            {
                move(1);
            }

            else
            {
                setRotation( getRotation() + 90);    
            }
        }
        else
        {
            setRotation( getRotation() - 90);

            if( canMoveForward() == true)
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
            getWorld().showText("YOU LOST!", getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
    }

    /**
     * WallOnLeft will check to see if there is a wall on the left side of the player
     * @param there are no parameters
     * @return wallLeft is returned
     */
    private boolean wallOnLeft()
    {
        int xOffset = 0;
        int yOffset = 0;

        boolean wallLeft = false;

        if( getRotation() == NORTH )
        {
            xOffset = -1;

        }
        else if(getRotation() == SOUTH)
        {
            xOffset = 1;

        }
        else if(getRotation() == EAST)
        {
            yOffset = -1;

        }
        else 
        {
            yOffset = 1;

        }

        if( getOneObjectAtOffset(xOffset,yOffset,Wall.class) != null )
        {
            wallLeft = true;
        }

        return wallLeft; 
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
