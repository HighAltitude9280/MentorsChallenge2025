// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.drive;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Robot;
import frc.robot.resources.components.Navx;
import frc.robot.subsystems.Drivetrain;

public class TurnTo extends Command {
  Drivetrain drivetrain;
  Navx navx;
  double actualAngle;
  double target;
  double breakingAngle;
  double difference;

  /** Creates a new TurnTo90. */
  public TurnTo(double target, double breakingAngle) {
    this.target = target;
    this.breakingAngle = breakingAngle;

    drivetrain = Robot.getRobotContainer().getDrivetrain();
    navx = Robot.getRobotContainer().getNavx();
    addRequirements(drivetrain);
    difference = target - 6;

    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    actualAngle = navx.getYaw();
    drivetrain.turnTo(actualAngle, target, breakingAngle, 0.63);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    drivetrain.drive(0, 0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    if (actualAngle > difference) {
      return true;
    }
    return false;
  }
}