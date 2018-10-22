package pong.model;

import static pong.model.Pong.GAME_HEIGHT;

/*
 * A Paddle for the Pong game
 * A model class
 *
 */
public class Paddle implements IPositionable {

    public static final double PADDLE_WIDTH = 10;
    public static final double PADDLE_HEIGHT = 60;
    public static final double PADDLE_SPEED = 5;

    private double X;
    private double Y;
    public static final double speed = 1;

    public Paddle(double X) {
        this.X = X;
    }

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    public void setY(double Y) {
        this.Y = Y;
    }

    public double getWidth() {
        return PADDLE_WIDTH;
    }

    public double getHeight() {
        return PADDLE_HEIGHT;
    }

    public double getSpeed() {
        return PADDLE_SPEED;
    }
}
