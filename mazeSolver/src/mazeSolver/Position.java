package mazeSolver;

public class Position {

    private int x;
    private int y;

    /**
     * Constructor for the Poisition class
     * sets the values default to zero, zero
     */
    public Position(){
        this.x = 0;
        this.y = 0;
    }

    /**
     * Sets the value of the current position's x-coordinate.
     * @param x value of x-coordinate
     */
    public void setx(int x){
        this.x = x;
    }

    /**
     * Sets the value of the current position's y-coordinate.
     * @param y value of y-coordinate
     */
    public void sety(int y){
        this.y = y;
    }

    /**
     * Returns the x-coordinate value of this position.
     * @return int the x-coordinate of this position
     */
    public int getx(){
        return x;
    }

    /**
     * Returns the y-coordinate value of this position.
     * @return int the y-coordinate of this position
     */
    public int gety(){
        return y;
    }
}
