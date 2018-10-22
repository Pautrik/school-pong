package pong.model;


import pong.event.Event;
import pong.event.EventService;

import java.util.ArrayList;
import java.util.List;

/*
 * Logic for the Pong Game
 * Model class representing the "whole" game
 * Nothing visual here
 *
 */
public class Pong {

    public static final double GAME_WIDTH = 600;
    public static final double GAME_HEIGHT = 400;
    public static final double BALL_SPEED_FACTOR = 1.02;
    public static final long HALF_SEC = 500_000_000;
    public static final double RIGHT_PADDLE_X = GAME_WIDTH - 50;
    public static final double LEFT_PADDLE_X = 50;

    private int pointsLeft;
    private int pointsRight;

    private List<IPositionable> drawables;

    private Paddle leftPaddle;
    private Paddle rightPaddle;
    private Ball ball;

    // --------	 Game Logic -------------

    private long timeForLastHit;		 // To avoid multiple collisions

    public Pong(Paddle leftPaddle, Paddle rightPaddle, Ball ball) {
        this.drawables = new ArrayList<IPositionable>();

        pointsLeft = 0;
        pointsRight = 0;

        this.leftPaddle = leftPaddle;
        this.rightPaddle = rightPaddle;
        this.ball = ball;

        this.drawables.add(leftPaddle);
        this.drawables.add(rightPaddle);
        this.drawables.add(ball);
    }

    public void update(long now) {

    }

    // --- Used by GUI	------------------------

    public List<IPositionable> getDrawables() {
        return this.drawables;
    }

    public int getPointsLeft() {
        return this.pointsLeft;
    }

    public int getPointsRight() {
        return this.pointsRight;
    }

    public Paddle getLeftPaddle() {
        return this.leftPaddle;
    }

    public Paddle getRightPaddle() {
        return this.rightPaddle;
    }
}
