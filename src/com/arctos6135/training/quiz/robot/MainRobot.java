package com.arctos6135.training.quiz.robot;

import com.arctos6135.training.quiz.robot.sensors.*;
import com.arctos6135.training.quiz.robot.actuators.*;

public class MainRobot extends Robot{

    // Defining the various devices on the robot and which port they are connected to
    public Encoder leftWheel = new Encoder(2);
    public Encoder rightWheel = new Encoder(3);
    public Gyroscope gyro = new Gyroscope(4);
    public Motor leftMotor = new Motor(0);
    public Motor rightMotor = new Motor(1);
    private State state = State.UNKNOWN;

    public MainRobot(){
    }

    public MainRobot(String name){
        setName(name);
    }

    public MainRobot(String name, State state){
        writeState(state);
        setName(name);
    }

    // Getting the distance the left wheel has travelled using the leftWheel encoder
    @Override
    public double getLeftWheelDistance(){
        return leftWheel.getDistance()/2.54;
    }

    // Getting the distance the right wheel has travelled using the rightWheel encoder
    @Override
    public double getRightWheelDistance(){
        return rightWheel.getDistance()/2.54;
    }

    // Getting the heading of the robot using the gyroscope and getting a value between 0 and 360
    @Override
    public double getHeading(){
        return gyro.getHeading()%360;
    }

    // Returns the state of the Robot
    public State readState(){
        return state;
    }

    // Sets the State of the Robot
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