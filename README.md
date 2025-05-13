# SwerveDriveTemplate

---

## Main Files

### `Main.java`
This is the starting point of the robot program. It tells the system to begin running our robot code by calling the `Robot` class. You don’t need to change anything in here, just know that it kicks everything off.

---

### `Robot.java`
This file controls the robot's overall behavior. It runs different parts of the robot code depending on the mode (like disabled, autonomous, or teleop/manual control). Similarly to Main.java we will not have to write much code here.

---

### `RobotContainer.java`
This is the first file we will really focus on, it does a number of things for us such as:
- Creating "Subsystem" objects
- Binding controller buttons to robot commands
- Enabling a default command to allow the robot to drive around

---

### `Constants.java`
This file stores important variables we use in other files, like how fast the robot can go or how sensitive the joystick is. Keeping these values in one place makes them easy to update later without digging through the whole codebase.

---

### `SwerveSubsystem.java`
This file will be the most difficult to understand at first. Each subsystem on the robot (swerve drive, elevator, climber, intake) will have its own ****Subsystem.java file. Within these files we tell the code which motors we are working with and what we want the subsystem to be able to do. For example, the ClimberSubsytem.java file will have a two functions: 
- Move up
- Move Down

---
