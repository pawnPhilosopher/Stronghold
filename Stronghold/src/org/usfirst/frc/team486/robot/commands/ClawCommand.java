package org.usfirst.frc.team486.robot.commands;

import org.usfirst.frc.team486.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ClawCommand extends Command {

	boolean state;
	
    public ClawCommand(boolean state) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.claw);
    	this.state = state;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.claw.set(state);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.claw.set(state);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
