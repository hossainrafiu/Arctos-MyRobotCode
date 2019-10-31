package com.arctos6135.training.quiz.robot;

/**
 * This exception is thrown by the {@link Task#doIt(Robot)} method to indicate that
 * the task has failed.
 */
public class TaskExecutionException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 6326571580386933355L;

    /**
     * Creates a new exception.
     */
    public TaskExecutionException() {
    }

    /**
     * Creates a new exception with a message.
     * 
     * @param message The message
     */
    public TaskExecutionException(String message) {
        super(message);
    }

    /**
     * Creates a new exception with a cause.
     * 
     * @param cause The cause
     */
    public TaskExecutionException(Throwable cause) {
        super(cause);
    }

    /**
     * Creates a new exception with a message and a cause.
     * 
     * @param message The message
     * @param cause   The cause
     */
    public TaskExecutionException(String message, Throwable cause) {
        super(message, cause);
    }
}
