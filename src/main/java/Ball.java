import processing.core.PApplet;

public class Ball {
    private int speed;
    private int moveX;
    private int moveY;
    private int diameter;

    public Ball(int moveX, int moveY, int diameter,int speed) {
        this.moveX = moveX;
        this.moveY = moveY;
        this.diameter = diameter;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMoveX() {
        return moveX;
    }

    public int getMoveY() {
        return moveY;
    }

    public int getDiameter() {
        return diameter;
    }

    public void increaseSpeed(){
        moveX +=speed;
    }
}
