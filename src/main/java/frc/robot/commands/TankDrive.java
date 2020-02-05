/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.DriveTrain;

public class TankDrive extends CommandBase {
  /**
   * Creates a new TankDrive.
   */

   public DriveTrain mDriveTrain = new DriveTrain();

   // Setting up speeds...
   double ySpeed;// = Constants.drivingSpeed * mStick.getY();
   double xRotation;// = Constants.drivingSpeed * mStick.getX();
   

  public TankDrive(double speed, double rotation, DriveTrain mDriveTrain) {
    // Use addRequirements() here to declare subsystem dependencies.
    ySpeed = speed;
    xRotation = rotation;
    addRequirements(mDriveTrain);
  }

  // Called when the command is initially scheduled.
  // @Override
  // public void initialize() {
  // }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    mDriveTrain.arcadeDrive(ySpeed, xRotation);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    mDriveTrain.arcadeDrive(0, 0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
