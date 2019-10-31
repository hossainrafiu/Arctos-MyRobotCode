package com.arctos6135.training.quiz.robot;
import com.arctos6135.training.quiz.robot.sensors.*;
import com.arctos6135.training.quiz.robot.actuators.*;

public enum State{
    ENABLED, DISABLED, UNKNOWN;
}

public class MainRobot extends Robot{

    Encoder leftWheel = new Encoder(2);
    Encoder rightWheel = new Encoder(3);
    Gyroscope gyro = new Gyroscope(4);
    Motor leftMotor = new Motor(0);
    Motor rightMotor = new Motor(1);
    private State state = State.UNKNOWN;

    @Override
    public double getLeftWheelDistance(){
        return leftWheel.getDistance()/2.54;
    }

    @Override
    public double getRightWheelDistance(){
        return rightWheel.getDistance()/2.54;
    }

    @Override
    public double getHeading(){
        double heading = gyro.getHeading();
        while (heading < 0){
            heading += 360;
        }
        while (heading > 360){
            headidng -= 360;
        }
        return heading;
    }

    public State readState(){
        return state;
    }

    public void writeState(State state){
        this.state = state;
    }

}