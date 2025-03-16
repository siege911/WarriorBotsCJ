package org.firstinspires.ftc.teamcode;
public class GamePadB {
    private boolean buttonAPressed = false;
    private boolean buttonBPressed = false;
    private boolean buttonXPressed = false;
    private boolean buttonYPressed = false;
    private boolean buttonUpPressed = false;
    private boolean buttonDownPressed = false;
    private boolean buttonLeftPressed = false;
    private boolean buttonRightPressed = false;
    private boolean rightBumperPressed = false;
    private boolean leftBumperPressed = false;

    private MyRobot robot;
    
    public GamePadB(MyRobot robot) {
        this.robot=robot;
    }

    public void buttonB (boolean pressed) {
        if(pressed){
            if(!buttonBPressed) {
                robot.actions.grabSubmersibleSample();
                buttonBPressed = true;
            }
        } else {
            buttonBPressed = false;
        }
    }
    public void buttonA (boolean pressed) {
        if(pressed){
            if(!buttonAPressed) {
                robot.claw.toggle();
                buttonAPressed = true;
            }
        } else {
            buttonAPressed = false;
        }
    }
    public void buttonY (boolean pressed) {
        if(pressed){
            if(!buttonYPressed) {
                robot.actions.gameEndHang();
                buttonYPressed = true;
            }
        } else {
            buttonYPressed = false;
        }
    }
    public void buttonX (boolean pressed) {
        if(pressed){
            if(!buttonXPressed) {
                //Insert Here
                buttonXPressed = true;
            }
        } else {
            buttonXPressed = false;
        }
    }
    public void buttonUp (boolean pressed) {
        if(pressed){
            if(!buttonUpPressed) {
                robot.poses.specimenDelivery();
                buttonUpPressed = true;
            }
        } else {
            buttonUpPressed = false;
        }
    }
    public void buttonDown (boolean pressed) {
        if(pressed){
            if(!buttonDownPressed) {
                robot.poses.submersibleSampleIntake();
                buttonDownPressed = true;
            }
        } else {
            buttonDownPressed = false;
        }
    }
    public void buttonLeft (boolean pressed) {
        if(pressed){
            if(!buttonLeftPressed) {
                robot.poses.sampleBasketDelivery();
                buttonLeftPressed = true;
            }
        } else {
            buttonLeftPressed = false;
        }
    }
    public void buttonRight (boolean pressed) {
        if(pressed){
            if(!buttonRightPressed) {
                robot.poses.sampleBasketDelivery();
                buttonRightPressed = true;
            }
        } else {
            buttonRightPressed = false;
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
                robot.wristRotate.rotateLeft();
                leftBumperPressed = true;
            }
        } else {
            leftBumperPressed = false;
        }
    }
    public void buttonRBumper (boolean pressed) {
        if(pressed){
            if(!rightBumperPressed) {
                robot.wristRotate.rotateRight();
                rightBumperPressed = true;
            }
        } else {
            rightBumperPressed = false;
        }
    }
    public void joystickLeftY (double speed) {
        if(speed > 0.1 || speed < -0.1) {
            robot.extension.moveByInput(-speed);
        };
    }
    public void joystickRightY (double speed) {
        if(speed > 0.1 || speed < -0.1) {
            robot.arm.moveByInput(-speed);
        };
    }
    public void joystickLeftX (double speed) {
        if(speed > 0.1 || speed < -0.1) {}
    }
    public void joystickRightX (double speed) {
        if(speed > 0.1 || speed < -0.1) {}
    }
    
}