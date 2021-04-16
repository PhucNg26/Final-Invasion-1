// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class SplashScreen here.
 * @author (your name) @version (a version number or a date)
 */
public class SplashScreen extends World
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Constructor for objects of class SplashScreen.
     */
    public SplashScreen()
    {
        super(800, 800, 1);
        showText("Vanier College", 200, 500);
        /* Create a new world with 600x400 cells with a cell size of 1x1 pixels.*/
    }

    /**
     * 
     */
    public void showTextWithBigPurpleFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(100);
        bg.setFont(font);
        bg.setColor(Color.WHITE);
        bg.drawString("Vanier College", 200, 500);
    }
}
