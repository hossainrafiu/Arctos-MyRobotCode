package com.arctos6135.training.quiz.robot.actuators;

/**
 * Represents a motor.
 * 
 * <p>
 * <small>Of course, this being a quiz and not an actual robot, the actuators
 * don't actually do anything and just print out stuff.</small>
 * </p>
 */
public class Motor extends Actuator {

    /**
     * Creates a new motor object on the specified port.
     * 
     * @param port The port this motor is on
     */
    public Motor(int port) {
        this.port = port;
    }

    /**
     * Sets the speed of the motor.
     * <p>
     * The speed is a decimal from -1 to 1, -1 being full speed backwards and 1
     * being full speed forwards.
     * </p>
     * 
     * @param speed The speed to set the motor to
     * @throws IllegalArgumentException If the speed is out of range
     */
    public void setSpeed(double speed) {
        if (speed < -1.0 || speed > 1.0) {
            throw new IllegalArgumentException("A speed of " + speed + " is out of range!");
        }
        System.out.println("Speed set to " + speed);
    }
}
