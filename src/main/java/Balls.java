import processing.core.PApplet;

public class Balls extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int RADIUS = 10;

    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;

    public static void main(String[] args) {
        PApplet.main("Balls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        ellipse(a,HEIGHT/5, RADIUS,RADIUS);
        ellipse(b,2*HEIGHT/5,RADIUS,RADIUS);
        ellipse(c,3*HEIGHT/5,RADIUS,RADIUS);
        ellipse(d,4*HEIGHT/5,RADIUS,RADIUS);

        a = a+1;
        b = b+2;
        c = c+3;
        d = d+4;
    }
}