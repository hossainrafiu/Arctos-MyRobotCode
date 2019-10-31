# Final Quiz for Java

Congratulations on making it through Java training!
You have now hopefully learned all you need to write a robot program. 
To assess your understanding of the topics mentioned and to consolidate your learning, we have created a final Java quiz/exercise.

In order to make this exercise as realistic as possible to prepare you for working on the robot in the future, we have provided you with a set of fake API classes for a hypothetical robot, in the packages `com.arctos6135.training.quiz.robot`, `com.arctos6135.training.quiz.robot.sensors` and `com.arctos6135.training.quiz.robot.actuators`.
Each class and method is documented in code with Javadoc comments, and you will also be provided with the generated Javadoc webpages in a zip.

Note that because you have not yet learned how to use jar libraries, you should first download this repository as a zip, unzip it, and then open it in Visual Studio code and do all the work directly in the project to get the full benefits of IntelliSense.

You will need to demonstrate your knowledge of Java concepts and the ability to make use of API classes with the help of documentation to complete this quiz.
Of course, just like real life, it will be open-book; you can use any resource you want. 

Your mission, should you choose to accept it, is to:
### 1. Implement the `com.arctos6135.training.quiz.robot.Robot` class.

Your implementation can have any name you want (although you should pretend that this is the actual robot code, so try to give it a good name).
It should be located in the package `com.arctos6135.training.quiz.robot`.

This would mean providing an implementation to `getLeftWheelDistance()`, `getRightWheelDistance()` and `getHeading()`.
You can use the `com.arctos6135.training.quiz.robot.sensors.Encoder` class to obtain distance readings, and the `com.arctos6135.training.quiz.robot.sensors.Gyroscope` class to obtain heading (direction) readings.
The encoders for the left and right wheels are on ports 2 and 3, respectively, and the gyroscope is on port 4.

But there's a catch!
`Encoder` returns distances in inches, but `getLeftWheelDistance()` and `getRightWheelDistance()` should return centimeters (2.54cm = 1in).
`Gyroscope` returns a continuous angle; that is, it can be greater than 360 or less than 0, but `getHeading()` should return angles only in the range [0, 360].

Your implementation should also have two motors, one for the left side of the robot and one for the right. 
(Use the `com.arctos6135.training.quiz.robot.actuators.Motor` class to create a motor.)
These two motors should be on ports 0 and 1, respectively. 

Your implementation should also have a "state" variable.
You should define an enum for this (possible values are enabled, disabled and unknown).
This state variable should be encapsulated, and it should also be possible to read and write to this state from outside the class.

### 2. Make the robot "do something cool".

Having now done the hard part, the next two parts are relatively easier:

Create a class in the `com.arctos6135.training.quiz.robot` package that has a main method.
In this class, create a function that can take in **any robot** and calls `com.arctos6135.training.quiz.robot.Robot.doSomethingCool()` on that robot.
Note that `doSomethingCool()` will throw an exception if the name of the robot is not set.

Call this function that you just created with an instance of your robot implementation.

### 3. Make a robot do a task.

Finally, make the robot "do a task" by using the `com.arctos6135.training.quiz.robot.Robot.doTask()` method.
Use a lambda.

In the task, you should check the "state" variable of the robot, and:
* If the robot is enabled, then set the speed of the left and right motors to something.
* If the robot is disabled, do nothing.
* If the robot state is unknown, throw a `TaskExecutionException` with a helpful message.

---

Good luck!
If you have any questions, please do not hesitate to contact me.

Note: Code readability will be a factor.
This means writing comments when necessary, following the correct naming conventions, etc.
