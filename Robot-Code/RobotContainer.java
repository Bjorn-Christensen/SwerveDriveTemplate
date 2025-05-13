package frc.robot;

import java.io.File;

import edu.wpi.first.wpilibj.Filesystem;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.Command;

import frc.robot.subsystems.SwerveSubsystem;

import frc.robot.Constants.DriverConstants;

import swervelib.SwerveInputStream;

public class RobotContainer {

    // Define robot subsystems and commands
    private final SwerveSubsystem swerveSubsystem = new SwerveSubsystem(new File(Filesystem.getDeployDirectory(), "swerve"));

    // Joysticks
    final CommandXboxController driverXbox = new CommandXboxController(0);

    // Converts driver input into a field-relative ChassisSpeeds that is controlled by angular velocity.
    SwerveInputStream driveAngularVelocity = SwerveInputStream.of(swerveSubsystem.getSwerveDrive(),
                                                                  () -> driverXbox.getLeftY() * -1,
                                                                  () -> driverXbox.getLeftX() * -1)
                                                              .withControllerRotationAxis(() -> driverXbox.getRightX() * -1)
                                                              .deadband(DriverConstants.DEADZONE)
                                                              .scaleTranslation(0.8)
                                                              .allianceRelativeControl(true);

    public RobotContainer() {
        configureButtonBindings();
    }

    private void configureButtonBindings() {

        // Drive Controls
        Command driveFieldOrientedAnglularVelocity = swerveSubsystem.driveFieldOriented(driveAngularVelocity);
        swerveSubsystem.setDefaultCommand(driveFieldOrientedAnglularVelocity);

    }

    public void setMotorBrake(boolean brake) {
        swerveSubsystem.setMotorBrake(brake);
    }
}
