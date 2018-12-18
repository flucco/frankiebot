/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

//import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

//import edu.wpi.first.wpilibj.ADXRS450_Gyro;
//import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
//import edu.wpi.first.wpilibj.Timer;
//import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private DifferentialDrive drive;

	private SpeedControllerGroup r;
	private SpeedControllerGroup l;

	public WPI_TalonSRX r0, r1, l0, l1;

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
  public DriveTrain() {

		this.r0 = new WPI_TalonSRX(RobotMap.rightDriveMotor1);
		this.r1 = new WPI_TalonSRX(RobotMap.rightDriveMotor2);
		this.l0 = new WPI_TalonSRX(RobotMap.leftDriveMotor1);
    this.l1 = new WPI_TalonSRX(RobotMap.leftDriveMotor2);
    
		this.r = new SpeedControllerGroup(r0, r1);
		this.l = new SpeedControllerGroup(l0, l1);

		this.r.setInverted(false);
		this.l.setInverted(false);

		this.drive = new DifferentialDrive(l, r);

		this.drive.setSafetyEnabled(false);

  }
  public void arcadeDrive(double y,double z) {
    drive.arcadeDrive(y,z);
  }
 

}
