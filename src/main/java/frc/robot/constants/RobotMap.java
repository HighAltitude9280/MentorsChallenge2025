// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.constants;

import frc.robot.resources.components.speedController.HighAltitudeMotor.TypeOfMotor;

/** Add your docs here. */
public class RobotMap {

        //////////////////////// DRIVE TRAIN ////////////////////////

        public static final int[] DRIVETRAIN_LEFT_MOTOR_PORTS = { 11, 12 };
        public static final int[] DRIVETRAIN_LEFT_INVERTED_MOTORS_PORTS = {};
        public static final TypeOfMotor[] DRIVETRAIN_RIGHT_MOTOR_TYPES = { TypeOfMotor.TALON_SRX,
                        TypeOfMotor.TALON_SRX };

        public static final int[] DRIVETRAIN_RIGHT_MOTOR_PORTS = { 13, 14 };
        public static final TypeOfMotor[] DRIVETRAIN_LEFT_MOTOR_TYPES = { TypeOfMotor.TALON_SRX,
                        TypeOfMotor.TALON_SRX };
        public static final int[] DRIVETRAIN_RIGHT_INVERTED_MOTORS_PORTS = {};

        //////////////////////// INTAKE ////////////////////////

        public static final int[] INTAKE_MOTOR_PORTS = { 21 };
        public static final int[] INTAKE_INVERTED_MOTORS_PORTS = {};
        public static final TypeOfMotor[] INTAKE_MOTOR_TYPES = { TypeOfMotor.SPARK_MAX_BRUSHED };

        //////////////////////// SHOOTER ////////////////////////

        public static final int[] SHOOTER_MOTOR_PORTS = { 31 };
        public static final int[] SHOOTER_INVERTED_MOTORS_PORTS = {};
        public static final TypeOfMotor[] SHOOTER_MOTOR_TYPES = { TypeOfMotor.SPARK_MAX_BRUSHED };

        //////////////////////// KICKER ////////////////////////

        public static final int[] KICKER_MOTOR_PORTS = { 41 };
        public static final int[] KICKER_INVERTED_MOTORS_PORTS = {};
        public static final TypeOfMotor[] KICKER_MOTOR_TYPES = { TypeOfMotor.SPARK_MAX_BRUSHED };
}
