package org.firstinspires.ftc.teamcode;
public class GamePadB {

    private boolean rightBumperPressed = false;
    private boolean leftBumperPressed = false;

    private MyRobot robot;
    
    public GamePadB(MyRobot robot) {
        this.robot=robot;
    }

    public void buttonB (boolean pressed) {
        if(pressed) {
            robot.armAttachment.claw.open();
        }
    }
    public void buttonA (boolean pressed) {
        if(pressed){
            robot.armAttachment.extension.setPosition(500);
        }
    }
    public void buttonY (boolean pressed) {
        if(pressed){
            robot.armAttachment.wristHinge.setToSampleHighBasketDeliveryPosition();
        }
    }
    public void buttonX (boolean pressed) {
        if(pressed){
            robot.armAttachment.claw.close();
        }
    }
    public void buttonUp (boolean pressed) {
        if(pressed) {
            robot.poses.specimenDelivery();
        }
        
        
    }
    public void buttonDown (boolean pressed) {
        if(pressed){
            robot.poses.submersibleSampleIntake();
        }
    }
    public void buttonLeft (boolean pressed) {
        if(pressed){
            robot.poses.sampleBasketDelivery();
        }
    }
    public void buttonRight (boolean pressed) {
        if(pressed){
            robot.poses.specimenIntake();
        }
    }
    public void buttonLTrigger(double speed) {
        if(speed > 0.1 || speed < -0.1) {}
    }
    public void buttonRTrigger (double speed) {
        if(speed > 0.1 || speed < -0.1) {}
    }
    public void buttonLBumper (boolean pressed) {
        if(pressed){
            if(!leftBumperPressed) {
                robot.armAttachment.wristRotate.rotateLeft();
                leftBumperPressed = true;
            }
        } else {
            leftBumperPressed = false;
        }
    }
    public void buttonRBumper (boolean pressed) {
        if(pressed){
            if(!rightBumperPressed) {
                robot.armAttachment.wristRotate.rotateRight();
                rightBumperPressed = true;
            }
        } else {
            rightBumperPressed = false;
        }
    }
    public void joystickLeftY (double speed) {
        robot.armAttachment.extension.moveByInput(-speed);
    }
    public void joystickRightY (double speed) {
        robot.armAttachment.arm.moveByInput(-speed);
    }
    public void joystickLeftX (double speed) {
        if(speed > 0.1 || speed < -0.1) {}
    }
    public void joystickRightX (double speed) {
        if(speed > 0.1 || speed < -0.1) {}
    }
    
}