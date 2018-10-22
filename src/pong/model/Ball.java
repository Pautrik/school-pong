package pong.model;

import java.util.Random;

import static pong.model.Pong.GAME_HEIGHT;
import static pong.model.Pong.GAME_WIDTH;

/*
 * A Ball for the Pong game
 * A model class
 */
public class Ball implements IPositionable {

    private static final double WIDTH = 40;
    private static final double HEIGHT = 40;

    private double dX = 0;
    private double dY = 0;
    private double x;
    private double y;

    public Ball(double X) {
        this.dX = 1;
        this.dY = 1;
        this.x = GAME_WIDTH / 2 - WIDTH / 2;
        this.y = GAME_HEIGHT / 2 - HEIGHT / 2;
    }

    public void setDX(double dX) {
        this.dX = dX;
    }

    public void setDY(double dY) {
        this.dY = dY;
    }

    public double getDX() {
        return dX;
    }

    public double getDY() {
        return dY;
    }

    public double getWidth() {
        return WIDTH;
    }

    public double getHeight() {
        return HEIGHT;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setY(double Y) {
        this.y = Y;
    }

    public void setX(double X) {
        this.x = X;
    }
}
