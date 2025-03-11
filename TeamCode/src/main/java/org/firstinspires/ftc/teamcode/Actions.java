package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.util.ElapsedTime;

public class Actions {
    private MyRobot robot;
    private boolean isActionActive = false;
    private ElapsedTime elapsedTime;
    private double timeout;

    public Actions(MyRobot robot) {
        this.robot = robot;
        elapsedTime = new ElapsedTime();
    }

    private void setActionTimeout(double startTime) {
        timeout = startTime;
        elapsedTime.reset();
    }

    private boolean isActionTimeout() {
        if(elapsedTime.time() > timeout) {
            isActionActive = false;
            return true;
        } else {
            return false;
        }
    }

    public void grabSubmersibleSample() {
        if(robot.poses.currentPose == Poses.CurrentPose.SUBMERSIBLE_SAMPLE_INTAKE) {
            if(!isActionActive) {
                isActionActive = true;
                setActionTimeout(2000);
                robot.armAttachment.claw.open();
                robot.armAttachment.arm.setToSampleSubmersibleIntakeGrabPostion();
                while (!robot.armAttachment.arm.getIsAtTarget() && !isActionTimeout()) {
                    //just wait until we reach the target or we timeout
                }
            }
            if(!isActionActive) {
                robot.armAttachment.claw.close();
                robot.armAttachment.arm.setToSampleSubmersibleIntakePostion();
                while(!robot.armAttachment.arm.getIsAtTarget() && !isActionTimeout()) {
                    //just wait until we reach the target or we timeout
                }
            }
            isActionActive = false;
        }
    }

}
