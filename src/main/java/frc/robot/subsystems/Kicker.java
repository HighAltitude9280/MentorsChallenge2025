// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.constants.RobotMap;
import frc.robot.resources.components.speedController.HighAltitudeMotorGroup;

public class Kicker extends SubsystemBase {
  /** Creates a new Intake. */
  HighAltitudeMotorGroup kickerMotors;

  public Kicker() {
    kickerMotors = new HighAltitudeMotorGroup(RobotMap.KICKER_MOTOR_PORTS, RobotMap.KICKER_INVERTED_MOTORS_PORTS,
        RobotMap.KICKER_MOTOR_TYPES);

  }

  public void set(double speed) {
    kickerMotors.setAll(speed);
  }

  public void stopKicker() {
    kickerMotors.setAll(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
