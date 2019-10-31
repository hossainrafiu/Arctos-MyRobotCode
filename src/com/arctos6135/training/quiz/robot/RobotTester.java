package com.arctos6135.training.quiz.robot;

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
        
        // Calling the static doSomething function from above
        doSomething(robot1);

        // Changing robot1's state to ENABLED
        robot1.writeState(State.ENABLED);
        
        // Here, we override the doIt method from the Task interface
        robot1.doTask(robot -> 
            {
                
                if(robot.readState() == State.ENABLED)
                {
                    robot.leftMotor.setSpeed(1.0);
                    robot.rightMotor.setSpeed(-1.0);
                }
                else if(robot.readState() == State.UNKNOWN)
                {
                    throw new TaskExecutionException("The State of the Robot is UNKNONW!");
                }

            }
        );
    }
}