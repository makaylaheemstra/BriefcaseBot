/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class BriefcaseBot extends IterativeRobot {
    private Joystick _driveController;
    
    private Talon frontLeftMotor;
    private Talon frontRightMotor;
    private Talon backLeftMotor;
    private Talon backRightMotor;
            
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
        
        frontLeftMotor = new Talon(Addresses.frontLeftMotor);
        frontRightMotor = new Talon(Addresses.frontRightMotor);
        backLeftMotor = new Talon(Addresses.backLeftMotor);
        backRightMotor = new Talon(Addresses.backRightMotor);

    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
