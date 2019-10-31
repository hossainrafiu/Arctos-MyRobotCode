package com.arctos6135.training.quiz.robot.actuators;

/**
 * This is the base class for all actuators.
 * 
 * <p>
 * <small>Of course, this being a quiz and not an actual robot, the actuators
 * don't actually do anything and just print out stuff.</small>
 * </p>
 */
public abstract class Actuator {

    /**
     * The port this actuator is on.
     */
    protected int port;

    /**
     * Gets the port this actuator is on.
     * 
     * @return The port this actuator is on
     */
    public int getPort() {
        return port;
    }
}
