import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bee extends Actor
{
    private int offsetX = 5;
    private int offsetY = 5;
    private static int nextOffset = 2;
    private int counterAddObject;
    
    public Bee(){
        offsetY = -nextOffset;
        offsetY = -nextOffset;
        nextOffset += 5;
    }
    
    public void act()
    {
        int x = getX();
        int y = getY();
        setLocation(x + offsetX, y + offsetY);
        if(isAtEdge()){
            offsetY *= -1;
        }
        if(getX() >= 575 || getX() <= 0){
            offsetX *= -1;
        }
    }
}
