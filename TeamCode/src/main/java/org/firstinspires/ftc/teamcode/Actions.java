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
                robot.claw.open();
                robot.arm.setPosition(robot.constants.submersibleSampleIntake.arm);
                //robot.arm.setToSampleSubmersibleIntakeGrabPostion();
                while (!robot.arm.getIsAtTarget()) {
                    //just wait until we reach the target or we timeout
                }
                robot.claw.close();
                robot.arm.setPosition(robot.constants.submersibleSampleHover.arm);
                robot.arm.setToSampleSubmersibleIntakePostion();
                while(!robot.arm.getIsAtTarget()) {
                    //just wait until we reach the target or we timeout
                }
            }
            isActionActive = false;
        }
    }

    public void gameEndHang() {
        if(!isActionActive) {
            isActionActive = true;
            setActionTimeout(5000);
            robot.arm.setToHangStart();
            robot.extension.setToHangStart();
            while(!robot.arm.getIsAtTarget() && !robot.extension.getIsAtTarget() && !isActionTimeout()) {
                //just wait until we reach the target or we timeout
            }
            robot.arm.setToHangEnd();
            robot.extension.setToHangEnd();
            while(!robot.arm.getIsAtTarget() && !robot.extension.getIsAtTarget() && !isActionTimeout()) {
                //just wait until we reach the target or we timeout
            }
            isActionActive = false;
        }
    }

}
