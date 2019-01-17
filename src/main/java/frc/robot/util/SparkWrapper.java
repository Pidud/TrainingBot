/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.util;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.SpeedController;

/**
 * Add your docs here.
 */
public class SparkWrapper implements SpeedController {

    private CANSparkMax motorController;

    @Override
    public void pidWrite(double output) {

    }

    @Override
    public void set(double speed) {
        motorController.set(speed);
    }

    @Override
    public double get() {
        return motorController.get();
    }

    @Override
    public void setInverted(boolean isInverted) {

    }

    @Override
    public boolean getInverted() {
        return false;
    }

    @Override
    public void disable() {

    }

    @Override
    public void stopMotor() {

    }

}
