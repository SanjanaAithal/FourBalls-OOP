import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class FourBallMovement extends PApplet {


    public static final int DIAMETER = 20;
    public static final int index = 5;
    private static SketchWindow window;
    private List<Ball> ballList = new ArrayList<>();

    public static void main(String[] args) {
        window = new SketchWindow(680, 840);
        PApplet.main("FourBallMovement", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(window.width, window.height);
    }

    @Override
    public void setup() {
        for(int i=1;i<=4;i++){
            ballList.add(new Ball(0, (int) (window.height*i/ index), DIAMETER,i));
        }
    }

    @Override
    public void draw() {
        drawCircle(ballList);
    }

    private void drawCircle(List<Ball> ballsList) {
        for(Ball ball : ballsList) {
            ellipse(ball.getMoveX(), ball.getMoveY(), ball.getDiameter(), ball.getDiameter());
            ball.increaseSpeed();
        }
    }
}
