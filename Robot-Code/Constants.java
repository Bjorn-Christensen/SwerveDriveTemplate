package frc.robot;

import edu.wpi.first.math.util.Units;

public final class Constants {

    // Drivetrain Constants
    public static final class DrivetrainConstants {
        public static final double MAX_SPEED = Units.feetToMeters(15.5); // Theoretically: ~19.2-19.8, Real: 15-17
        public static final double WHEEL_LOCK_TIME = 10; // Hold time on motor brakes when disabled (seconds)
    }

    // Drive Joystick Constants
    public static class DriverConstants {
        // Deadzones (Deadband)
        public static final double DEADZONE = 0.2;
    }
}
