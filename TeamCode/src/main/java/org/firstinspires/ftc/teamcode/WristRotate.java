package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class WristRotate {

    private final double MIN_POSITION = 0;
    private final double MAX_POSITION = 1;

    public final double FULL_LEFT = 0.2;  //CW means "Clockwise"
    public final double HALF_LEFT = 0.35;
    public final double CENTER = 0.5;
    public final double HALF_RIGHT = 0.65;
    public final double FULL_RIGHT = 0.8; //CCW means "Counter-Clockwise"
    private int positionIndex = 2;
    private double[] positions = {FULL_LEFT, HALF_LEFT, CENTER, HALF_RIGHT, FULL_RIGHT};
    private Servo servo;

    public WristRotate(HardwareMap hardwareMap){
        this.servo = hardwareMap.get(Servo.class, "wrist2");
        setPosition(positions[2]);
    }

    private void setPosition(double position){

        if(position == FULL_LEFT) {
            positionIndex = 0;
        } else if (position == HALF_LEFT) {
            positionIndex = 1;
        } else if (position == CENTER) {
            positionIndex = 2;
        } else if (position == HALF_RIGHT) {
            positionIndex = 3;
        } else if (position == FULL_RIGHT) {
            positionIndex = 4;
        } else {
            positionIndex = 2;
        }

        if (position < MIN_POSITION) {
            servo.setPosition(MIN_POSITION);
        } else if (position > MAX_POSITION) {
            servo.setPosition(MAX_POSITION);
        } else {
            servo.setPosition(position);
        }
    }

    public double getPosition() {
        return this.servo.getPosition();
    }
  
    public void setToMaxPosition() {
        setPosition(MAX_POSITION);
    }
    
    public void setToMinPosition() {
        setPosition(MIN_POSITION);
    }
    public void setToStartPosition() {
        setPosition(CENTER);
    }

    public void setToFullLeftPosition() {
        setPosition(FULL_LEFT);
        positionIndex = 0;
    }
    public void setToHalfLeftPosition() {
        setPosition(HALF_LEFT);
        positionIndex = 1;
    }
    public void setToCenterPosition() {

        setPosition(CENTER);
        positionIndex = 2;
    }
    public void setToHalfRightPosition() {
        setPosition(HALF_RIGHT);
        positionIndex = 3;
    }
    public void setToFullRightPosition() {

        setPosition(FULL_RIGHT);
        positionIndex = 4;
    }
    public void rotateRight() {
        if(positionIndex < 4) {
            positionIndex++;
            setPosition(positions[positionIndex]);
        }
    }

    public void rotateLeft() {
        if(positionIndex > 0) {
            positionIndex--;
            setPosition(positions[positionIndex]);
        }
    }
}

