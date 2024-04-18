import processing.core.PApplet;

import java.util.Arrays;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 800;
    public static final int HEIGHT = 500;
    private static final int DIAMETER = 10;
    int circle1 = 0;
    int circle2 = 0;
    int circle3 = 0;
    int circle4 = 0;
    int numCircles = 4;
    int[] circlePositions = {0, 0, 0, 0};

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    public void draw_initial() {
        ellipse(circle1, ((float) HEIGHT /5), DIAMETER, DIAMETER);
        circle1 += 1;

        ellipse(circle2, 2*((float) HEIGHT /5) , DIAMETER, DIAMETER);
        circle2 += 2;

        ellipse(circle3, 3*((float) HEIGHT /5), DIAMETER, DIAMETER);
        circle3 += 3;

        ellipse(circle4, 4*((float) HEIGHT /5), DIAMETER, DIAMETER);
        circle4 += 4;
    }

    @Override
    public void draw() {
        for (int i = 0; i < numCircles; i++) {
            ellipse(circlePositions[i], (i + 1) * ((float) HEIGHT / 5), DIAMETER, DIAMETER);
            circlePositions[i] += (i + 1);
        }
    }


    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);

    }
}
