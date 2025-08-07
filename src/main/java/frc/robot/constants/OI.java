// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.constants;

import frc.robot.commands.intake.IntakeIn;
import frc.robot.commands.intake.IntakeOut;
import frc.robot.commands.intake.StopIntake;
import frc.robot.commands.kicker.KickerIn;
import frc.robot.commands.kicker.KickerOut;
import frc.robot.commands.shooter.ShooterIn;
import frc.robot.commands.shooter.ShooterOn;
import frc.robot.commands.shooter.StopShooter;
import frc.robot.resources.joysticks.HighAltitudeJoystick;
import frc.robot.resources.joysticks.HighAltitudeJoystick.AxisType;
import frc.robot.resources.joysticks.HighAltitudeJoystick.ButtonType;
import frc.robot.resources.joysticks.HighAltitudeJoystick.JoystickType;

/** Add your docs here. */
public class OI {
    public static OI instance;

    private HighAltitudeJoystick pilot;
    private HighAltitudeJoystick copilot;

    public void ConfigureButtonBindings() {

        ////////////////////////// PILOT //////////////////////////

        switch (HighAltitudeConstants.CURRENT_PILOT) {

            case RichiFic:
                pilot = new HighAltitudeJoystick(0, JoystickType.XBOX);

                pilot.setAxisDeadzone(AxisType.LEFT_X, 0.15);
                pilot.setAxisDeadzone(AxisType.RIGHT_X, 0.15);

                pilot.whileTrue(ButtonType.RB, new KickerOut());
                pilot.whileTrue(ButtonType.LB, new KickerIn());

                break;

            default:
                break;

        }
        switch (HighAltitudeConstants.CURRENT_COPILOT) {
            case CopilotProgramming:
                copilot = new HighAltitudeJoystick(1, JoystickType.XBOX);

                copilot.onTrue(ButtonType.A, new ShooterOn());
                copilot.whileTrue(ButtonType.B, new StopShooter());
                copilot.whileTrue(ButtonType.Y, new ShooterIn());

                copilot.onTrue(ButtonType.LB, new IntakeIn());
                copilot.whileTrue(ButtonType.RB, new IntakeOut());

                copilot.whileTrue(ButtonType.POV_S, new KickerIn());
                copilot.whileTrue(ButtonType.POV_N, new KickerOut());

                copilot.whileTrue(ButtonType.X, new StopIntake());
                break;

            default:
                break;

        }

    }

    public static OI getInstance() {
        if (instance == null) {
            instance = new OI();
        }
        return instance;
    }

    public HighAltitudeJoystick getPilot() {
        switch (HighAltitudeConstants.CURRENT_PILOT) {

            case DefaultUser:
                return pilot;

            case Joakin:
                return pilot;

            case JoakinButChambing:
                return pilot;

            default:
                return pilot;
        }
    }

    public HighAltitudeJoystick getCopilot() {
        switch (HighAltitudeConstants.CURRENT_COPILOT) {

            case DefaultUser:
                return copilot;

            case Joakin:
                return copilot;

            case CopilotProgramming:
                return copilot;

            default:
                return copilot;
        }
    }

    public double getDefaultSpeed() {
        return pilot.getAxis(AxisType.LEFT_Y);
    }

    public double getDefaultTurn() {
        return pilot.getAxis(AxisType.RIGHT_X);
    }

    public double getFicSpeed() {
        return pilot.getTriggers();
    }

    public double getFicTurnSlow() {
        return pilot.getAxis(AxisType.LEFT_X) * HighAltitudeConstants.DRIVETRAIN_FIC_SLOW_TURN;
    }

    public double getFicTurnFast() {
        return pilot.getAxis(AxisType.RIGHT_X);
    }
}
