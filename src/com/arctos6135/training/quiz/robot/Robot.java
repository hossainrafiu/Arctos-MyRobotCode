package com.arctos6135.training.quiz.robot;

/**
 * A hypothetical robot capable of doing cool stuff!
 */
public abstract class Robot {

    /**
     * This method should return the distance the left wheel has travelled,
     * <strong>in centimeters</strong>.
     * 
     * @return The distance the left wheel travelled <strong>in centimeters</strong>
     */
    public abstract double getLeftWheelDistance();

    /**
     * This method should return the distance the right wheel has travelled,
     * <strong>in centimeters</strong>.
     * 
     * @return The distance the right wheel travelled <strong>in
     *         centimeters</strong>
     */
    public abstract double getRightWheelDistance();

    /**
     * This method should return the current heading (direction) of the robot,
     * <strong>in degrees in the range of [0, 360]</strong>.
     * 
     * @return The current heading (direction) of the robot <strong>in degrees in
     *         the range of [0, 360]</strong>
     */
    public abstract double getHeading();

    private String name;

    /**
     * Gets the name of the robot.
     * 
     * @return The name of the robot
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the robot.
     * 
     * @param name The name of the robot
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Makes the robot do something cool.
     * 
     * @throws NameNotSetException If the robot doesn't have a name
     */
    public void doSomethingCool() throws NameNotSetException {
        if (name == null) {
            throw new NameNotSetException("Name is not set!");
        }

        System.out.println(name + " is doing something cool!");
    }

    /**
     * Performs a task.
     * 
     * @param task The task to do
     */
    public void doTask(Task task) {
        try {
            task.doIt(this);
            System.out.println("Task successfully done!");
        } catch (TaskExecutionException e) {
            System.err.println("Oh no, task execution failed!");
            e.printStackTrace();
        }
    }
}
