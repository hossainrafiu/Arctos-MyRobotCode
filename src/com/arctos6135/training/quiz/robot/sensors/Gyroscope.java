package com.arctos6135.training.quiz.robot.sensors;

/**
 * A gyroscope is a sensor that measures rotation.
 * 
 * <p>
 * <small>Of course, this being a quiz and not an actual robot, the sensors
 * don't actually do anything and just return random values.</small>
 * </p>
 */
public class Gyroscope extends Sensor {

    /**
     * Creates a new gyroscope object on the specified port.
     * 
     * @param port The port the gyroscope is on
     */
    public Gyroscope(int port) {
        this.port = port;
    }

    /**
     * Gets the continuous heading (direction) of the robot, <strong>in
     * degrees</strong>.
     * 
     * <p>
     * Note that this is a continuous angle. I.e. turning past 360 degrees will not
     * result in the angle returned wrapping back to 0 degrees, but will yield an
     * angle greater than 360 instead. The same goes for angles less than 0 degrees.
     * </p>
     * 
     * @return The continuous heading of the robot <strong>in degrees</strong>
     */
    public double getHeading() {
        return Math.random() * 100000 - 50000;
    }
}
