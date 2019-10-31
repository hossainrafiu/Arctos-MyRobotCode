package com.arctos6135.training.quiz.robot.sensors;

/**
 * An encoder is a sensor that measures rotation of a shaft, which is then
 * translated into distance.
 * 
 * <p>
 * <small>Of course, this being a quiz and not an actual robot, the sensors
 * don't actually do anything and just return random values.</small>
 * </p>
 */
public class Encoder extends Sensor {

    /**
     * Creates a new encoder object on the specified port.
     * 
     * @param port The port the encoder is connected to
     */
    public Encoder(int port) {
        this.port = port;
    }

    /**
     * Gets the distance travelled, <strong>in inches</strong>.
     * 
     * @return The distance travelled <strong>in inches</strong>
     */
    public double getDistance() {
        return Math.random() * 100000 - 50000;
    }
}
