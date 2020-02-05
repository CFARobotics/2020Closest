/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    // Motors
    public static final int leftMotor1Channel = 2;
    public static final int leftMotor2Channel = 3;
    public static final int rightMotor1Channel = 4;
    public static final int rightMotor2Channel = 5; // all the driving motors...

    // Joysticks
    public static final int joystickPort = 0; // the UBS input...
    public static final int leftStickInput = 0;  //check button values in drive station usb section
    //public static final int rightStickInput = 1;
    
    // Button
    public static final int ButtonX = 3;  //Buttons confirmed
    public static final int ButtonY = 4;
    public static final int ButtonA = 1;
    public static final int ButtonB = 2;
    public static final int ButtonBack = 7;
    public static final int RightBumper = 6;
    public static final int LeftBumper = 5;
    
    // Drivivng Speed
    public static final double drivingSpeed = 0.75;
    public static final double fullSpeed = 1.0;
}
