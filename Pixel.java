public class Pixel
{
    private int red;
    private int green;
    private int blue;
    
    public Pixel(int red, int green, int blue)
    {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    
    public int getRed()
    {
        return red;
    }
    
    public int getGreen()
    {
        return green;
    }
    
    public int getBlue()
    {
        return blue;
    }
    
    public void setRed(int redAmount)
    {
        red = redAmount;
    }
    
    public void setGreen(int greenAmount)
    {
        green = greenAmount;
    }
    
    public void setBlue(int blueAmount)
    {
        blue = blueAmount;
    }
    
    public String toString()
    {
        String s = "[Red: " + red + ", Green: " + green + ", Blue:" + blue + "]";
        return s;
    }
}