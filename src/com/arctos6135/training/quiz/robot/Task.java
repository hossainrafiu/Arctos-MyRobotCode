package com.arctos6135.training.quiz.robot;

/**
 * A task that a {@link Robot} can do.
 */
@FunctionalInterface
public interface Task {

    /**
     * Does the task.
     * 
     * @param robot The robot that is doing the task
     */
    public void doIt(Robot robot);
}
