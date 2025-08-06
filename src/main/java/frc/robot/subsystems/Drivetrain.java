// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Robot;
import frc.robot.constants.HighAltitudeConstants;
import frc.robot.constants.RobotMap;
import frc.robot.resources.components.speedController.HighAltitudeMotorGroup;
import frc.robot.resources.math.Math;

public class Drivetrain extends SubsystemBase {

  public static HighAltitudeMotorGroup leftMotors, rightMotors;
  private final PIDController turnController;

  public Drivetrain() {

    leftMotors = new HighAltitudeMotorGroup(RobotMap.DRIVETRAIN_LEFT_MOTOR_PORTS,
        RobotMap.DRIVETRAIN_LEFT_INVERTED_MOTORS_PORTS, RobotMap.DRIVETRAIN_LEFT_MOTOR_TYPES);

    rightMotors = new HighAltitudeMotorGroup(RobotMap.DRIVETRAIN_RIGHT_MOTOR_PORTS,
        RobotMap.DRIVETRAIN_RIGHT_INVERTED_MOTORS_PORTS, RobotMap.DRIVETRAIN_RIGHT_MOTOR_TYPES);

    turnController = new PIDController(HighAltitudeConstants.DRIVETRAIN_TURN_KP,
        HighAltitudeConstants.DRIVETRAIN_TURN_KI, HighAltitudeConstants.DRIVETRAIN_TURN_KD);
  }

  public void drive(double speed, double turn) {

    double leftPower = speed + turn;
    double rightPower = speed - turn;

    leftMotors.setAll(leftPower);
    rightMotors.setAll(rightPower);
  }

  public void turnTo(double actualAngle, double target, double breakingAngle, double maxPower) {
    double error = target - actualAngle;
    double power = (1 / breakingAngle) * error;
    double turnPower = (Math.clamp(power, -1, 1)) * maxPower;

    drive(0, turnPower);
  }

  public void snapToAngle(double targetAngle, double breakingAngle, double maxPower) {
    double actualAngle = Robot.getRobotContainer().getNavx().getYaw();
    double turnPower = turnController.calculate(actualAngle, targetAngle);
    drive(0, turnPower);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}