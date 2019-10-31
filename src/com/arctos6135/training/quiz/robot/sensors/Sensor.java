package com.arctos6135.training.quiz.robot.sensors;

/**
 * This is the base class for all sensors.
 * 
 * <p>
 * <small>Of course, this being a quiz and not an actual robot, the sensors
 * don't actually do anything and just return random values.</small>
 * </p>
 */
public abstract class Sensor {

    /**
     * The port this sensor is on.
     */
    protected int port;

    /**
     * Gets the port this sensor is on.
     * 
     * @return The port this sensor is on
     */
    public int getPort() {
        return port;
    }
}
