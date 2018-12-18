/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
//import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

/**
 * Add your docs here.
 */
public class Hand extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public WPI_TalonSRX w;
  public WPI_TalonSRX r;
  public WPI_TalonSRX l;

  public Hand(){
    w = new WPI_TalonSRX(RobotMap.wristMotor);
    r = new WPI_TalonSRX(RobotMap.rightPickupMotor);
    l = new WPI_TalonSRX(RobotMap.leftPickupMotor);
  }

  public void MoveWrist(double y){
    w.set(y*0.2);
  }

  public void MoveWheels(double z){
    r.set(z*0.2);
    l.set(z*-0.2);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
