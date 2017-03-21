import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Wall here.
 * Amanda Schepp
 * Mr.Hardman
 * Assignment #2
 * March 20th
 */
public class Wall extends Actor
{
    /**
     * wall is the constructor for the wall class
     * @param no parameters
     * @return nothing is returned
     */
    public Wall()
    {
        GreenfootImage wallImage = new GreenfootImage(40,40);

        wallImage.setColor(Color.BLACK);
        wallImage.fillRect(0,0,40,40);

        setImage(wallImage);
    }

    /**
     * Act - do whatever the Wall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * @param no parameters
     * @return nothing is returned
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
