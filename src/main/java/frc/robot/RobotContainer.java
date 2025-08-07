// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.commands.drive.FicDrive;
import frc.robot.constants.OI;
import frc.robot.resources.components.Navx;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Kicker;
import frc.robot.subsystems.Shooter;

public class RobotContainer {

  private Navx navx;
  private Drivetrain drivetrain;
  private Intake intake;
  private Kicker kicker;
  private Shooter shooter;

  public RobotContainer() {
    navx = new Navx();
    drivetrain = new Drivetrain();
    intake = new Intake();
    kicker = new Kicker();
    shooter = new Shooter();
  }

  public Navx getNavx() {
    return navx;
  }

  public Drivetrain getDrivetrain() {
    return drivetrain;
  }

  public Intake getIntake() {
    return intake;
  }

  public Kicker getKicker() {
    return kicker;
  }

  public Shooter getShooter() {
    return shooter;
  }

  public void configureButtonBindings() {

    OI.getInstance().ConfigureButtonBindings();
    drivetrain.setDefaultCommand(new FicDrive());
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
