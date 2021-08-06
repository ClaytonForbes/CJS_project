/**
 * Program Name:C_J_S_Person.java
 * Purpose: 
 * Date: Aug. 5, 2021
 */

import java.util.*;
import java.awt.Color;
import java.awt.color.*;

public class C_J_S_Person
{
    //variables
    private boolean isAlive;
    private boolean isInfected;
    private int immunityStatus;
    private Color color;
    private int xCoordinate;
    private int yCoordinate;
    private int xIncrementValue;
    private int yIncrementValue;
    private int cycleCounter;
    
    //methods
    public void move() {
        
    }
    
    public void checkCollision() {
        
    }
    
    //constructor
    public C_J_S_Person(boolean isAlive, boolean isInfected, int immunityStatus, Color color, int xCoordinate, int yCoordinate, int xIncrementValue, int yIncrementValue, int cycleCounter) {
        this.isAlive = isAlive;
        this.isInfected = isInfected;
        this.immunityStatus = immunityStatus;
        this.color = color;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.xIncrementValue = xIncrementValue;
        this.yIncrementValue = yIncrementValue;
        this.cycleCounter = cycleCounter;
        
    }
    
    
    //getters and setters
    public boolean getisAlive() 
    {
        return this.isAlive;
    }
    public boolean setisAlive()
    {
        return this.isAlive;
    }
    //isInfected
    public boolean getisInfected() 
    {
        return this.isInfected;
    }
    public boolean setisInfetcted()
    {
        return this.isInfected;
    }
    //getimmunityStatus
    public int getimmunityStatus() 
    {
        return this.immunityStatus;
    }
    public int setimmunityStatus()
    {
        return this.immunityStatus;
    }
    //Color
    public Color getcolor() 
    {
        return this.color;
    }
    public Color setcolot()
    {
        return this.color;
    }
    //xCoordinate & yCoordinate
    public int getxCoordinate()
    {
        return this.xCoordinate;
    }
    public int setxCoordinate()
    {
        return this.xCoordinate;
    }
    public int getyCoordinate()
    {
        return this.yCoordinate;
    }
    public int setyCoordinate()
    {
        return this.yCoordinate;
    }
    //xIncrement & yIncrment
    public int getxIncrementValue()
    {
        return this.xIncrementValue;
    }
    public int setxIncrementValue()
    {
        return this.xIncrementValue;
    }
    public int getyIncrementValue()
    {
        return this.yIncrementValue;
    }
    public int setyIncrementValue()
    {
        return this.yIncrementValue;
    }
    //cycleConuter
    public int getcycleCounter() 
    {
        return this.cycleCounter;
    }
    public int setcycleCounter;
    
    
}
//end class
