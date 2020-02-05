/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  /**
   * Creates a new DriveTrain.
   */
  // Initializing Motor vars...
   PWMVictorSPX leftMotor1 = new PWMVictorSPX(2);
   PWMVictorSPX leftMotor2 = new PWMVictorSPX(3);
   PWMVictorSPX rightMotor1 = new PWMVictorSPX(4);
   PWMVictorSPX rightMotor2 = new PWMVictorSPX(5);

  // Grouping the motors...
   SpeedControllerGroup mRight = new SpeedControllerGroup(leftMotor1, leftMotor2);
   SpeedControllerGroup mLeft = new SpeedControllerGroup(rightMotor1, rightMotor2);

  // Arcade Drive...
   DifferentialDrive mRobotDrive = new DifferentialDrive(mLeft, mRight);


  public DriveTrain() {
  }

  public void arcadeDrive(double speed, double rotation){
    mRobotDrive.arcadeDrive(speed, rotation, true);
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
