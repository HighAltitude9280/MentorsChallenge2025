// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.constants.RobotMap;
import frc.robot.resources.components.speedController.HighAltitudeMotorGroup;

public class Intake extends SubsystemBase {
  /** Creates a new Intake. */
  HighAltitudeMotorGroup intakeMotors;

  public Intake() {
    intakeMotors = new HighAltitudeMotorGroup(RobotMap.INTAKE_MOTOR_PORTS, RobotMap.INTAKE_INVERTED_MOTORS_PORTS,
        RobotMap.INTAKE_MOTOR_TYPES);

  }

  public void set(double speed) {
    intakeMotors.setAll(speed);
  }

  public void stopIntake() {
    intakeMotors.setAll(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
