// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.constants.RobotMap;
import frc.robot.resources.components.speedController.HighAltitudeMotorGroup;

public class Shooter extends SubsystemBase {
  /** Creates a new Intake. */
  HighAltitudeMotorGroup shooterMotors;

  public Shooter() {
    shooterMotors = new HighAltitudeMotorGroup(RobotMap.SHOOTER_MOTOR_PORTS, RobotMap.SHOOTER_INVERTED_MOTORS_PORTS,
        RobotMap.SHOOTER_MOTOR_TYPES);

  }

  public void set(double speed) {
    shooterMotors.setAll(speed);
  }

  public void stopShooter() {
    shooterMotors.setAll(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
