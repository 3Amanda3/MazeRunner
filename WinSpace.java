import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class WinSpace here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinSpace extends Actor
{
    /**
     * winSpace is the constructor for the winSpace class
     * @param no parameters
     * @return nothing is returned
     */
    public WinSpace()
    {
        GreenfootImage winImage = new GreenfootImage(40,40);

        winImage.setColor(Color.YELLOW);
        winImage.fillRect(0,0,40,40);

        setImage(winImage);
    }

    /**
     * Act - do whatever the WinSpace wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * @param no parameters
     * @return nothing is returned
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
