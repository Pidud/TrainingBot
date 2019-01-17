/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import frc.robot.RobotMap;
import frc.robot.commands.OperateTankDrive;

/**
 * An example subsystem. You can replace me with your own Subsystem.
 */
public class Drivetrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private CANSparkMax frontRight;
  private CANSparkMax backRight;
  private CANSparkMax frontLeft;
  private CANSparkMax backLeft; 
  private MecanumDrive mecanumDrive;
  
  public void init(){
    frontRight = new CANSparkMax(RobotMap.frontRightMotor, MotorType.kBrushless);
    backRight = new CANSparkMax(RobotMap.backRightMotor, MotorType.kBrushless);
    frontLeft = new CANSparkMax(RobotMap.frontLeftMotor, MotorType.kBrushless);
    backLeft = new CANSparkMax(RobotMap.backLeftMotor, MotorType.kBrushless);

    mecanumDrive = new MecanumDrive(frontLeft, backLeft, frontRight, backRight);



  }

  public void setTankDrive(double right, double left){
    frontRight.set(right);
    backRight.set(right);
    frontLeft.set(left);
    backLeft.set(left);

    backRight.follow(frontRight);
    backLeft.follow(frontLeft);
    
  }

  /**
   * @param mecanumDrive the mecanumDrive to set
   */
  public void setMecanumDrive(double ySpeed, double xSpeed, double zRotation, double gyroAngle) {
    mecanumDrive.driveCartesian(ySpeed, xSpeed, zRotation, gyroAngle);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new OperateTankDrive());
  }
}
