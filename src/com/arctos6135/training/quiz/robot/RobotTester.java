package com.arctos6135.training.quiz.robot;

import com.arctos6135.training.quiz.robot.*;
import com.arctos6135.training.quiz.robot.MainRobot;
import com.arctos6135.training.quiz.robot.TaskExecutionException;

public class RobotTester{
    
    public static void doSomething(Robot robot){
        try{
            robot.doSomethingCool();
        }
        catch(NameNotSetException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        MainRobot robot1 = new MainRobot();
        doSomething(robot1);
        if (robot1.readState() == State.ENABLED){
            robot1.doTask(robot -> System.out.println("helloworld"));
        }
        else if (robot1.readState() == State.UNKNOWN){
            throw new TaskExecutionException("The State of the Robot is UNKNOWN!");
        }
    }
}