package com.arctos6135.training.quiz.robot;

import com.arctos6135.training.quiz.robot.sensors.*;
import com.arctos6135.training.quiz.robot.actuators.*;

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
        return gyro.getHeading()%360;
    }

    public State readState(){
        return state;
    }

    public void writeState(State state){
        this.state = state;
    }
    
    /**
     * Performs a task.
     * 
     * @param task The task to do
     */
    public void doTask(Task task) {
        try {
            task.doIt(this);
            System.out.println("Task successfully done!");
        } catch (TaskExecutionException e) {
            System.err.println("Oh no, task execution failed!");
            e.printStackTrace();
        }
    }

}