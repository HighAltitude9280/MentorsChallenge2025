// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.constants;

import frc.robot.resources.Human_Drivers.HumanDrivers;

/** Add your docs here. */
public class HighAltitudeConstants {

        //////////////////////// DRIVERS ////////////////////////

        public static final HumanDrivers CURRENT_PILOT = HumanDrivers.RichiFic;
        public static final HumanDrivers CURRENT_COPILOT = HumanDrivers.CopilotProgramming;

        //////////////////////// DRIVETRAIN ////////////////////////
        /// Falta poner valores

        public static final double DRIVETRAIN_TURN_KP = 0;
        public static final double DRIVETRAIN_TURN_KI = 0;
        public static final double DRIVETRAIN_TURN_KD = 0;

        public static final double DRIVETRAIN_TURN_OFFSET = 10;

        public static final double DRIVETRAIN_FIC_SLOW_TURN = 0.5;

        //////////////////////// INTAKE ////////////////////////
        /// Valores posibles

        public static final double INTAKE_IN_SPEED = 0.4;
        public static final double INTAKE_OUT_SPEED = -0.4;

        //////////////////////// KICKER ////////////////////////
        /// Valores posibles

        public static final double KICKER_IN_SPEED = 0.3;
        public static final double KICKER_OUT_SPEED = -0.3;

        //////////////////////// SHOOTER ////////////////////////
        /// Valores posibles

        public static final double SHOOTER_IN_SPEED = 0.8;
        public static final double SHOOTER_OUT_SPEED = -0.3;

}