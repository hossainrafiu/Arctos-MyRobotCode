package com.arctos6135.training.quiz.robot;

/**
 * This exception is thrown to indicate that the robot's name was not set.
 */
public class NameNotSetException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 5305964759950943326L;

    /**
     * Creates a new exception.
     */
    public NameNotSetException() {
    }

    /**
     * Creates a new exception with a message.
     * @param message The message
     */
    public NameNotSetException(String message) {
        super(message);
    }

    /**
     * Creates a new exception with a cause.
     * @param cause The cause
     */
    public NameNotSetException(Throwable cause) {
        super(cause);
    }

    /**
     * Creates a new exception with a message and a cause.
     * @param message The message
     * @param cause The cause
     */
    public NameNotSetException(String message, Throwable cause) {
        super(message, cause);
    }
}
