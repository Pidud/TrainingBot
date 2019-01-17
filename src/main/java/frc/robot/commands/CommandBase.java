/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;
import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
/**
 * An example command.  You can replace me with your own command.
 */
public abstract class CommandBase extends Command {
  public static OI oi;
  public static final Drivetrain drivetrain = new Drivetrain();

  public CommandBase() {
  
  }

  // Called just before this Command runs the first time
  public static void init() {
     OI oi = new OI();
     
  }
}
