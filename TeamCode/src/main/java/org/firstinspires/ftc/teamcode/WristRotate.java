package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class WristRotate {

    private final double MIN_POSITION = 0;
    private final double MAX_POSITION = 1;
    private final double START = 0.0;
    private final double CENTER_POSITION = 0.5;
    private final double MAX_CW_POSITION = 0.2;  //CW means "Clockwise"
    private final double MAX_CCW_POSITION = 0.8; //CCW means "Counter-Clockwise"
    private int positionIndex = 2;
    private double[] positions = {MAX_CW_POSITION, 0.35, CENTER_POSITION, 0.65, MAX_CCW_POSITION};
    private Servo servo;

    public WristRotate(HardwareMap hardwareMap){
        this.servo = hardwareMap.get(Servo.class, "wrist2");
        setPosition(positions[2]);
    }

    public void setPosition(double position){

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
        setPosition(START);
    }
    public void setToCenterPosition() {

        setPosition(CENTER_POSITION);
        positionIndex = 2;
    }
    public void setToCWPosition() {

        setPosition(MAX_CW_POSITION);
        positionIndex = 0;
    }
    public void setToCCWPosition() {

        setPosition(MAX_CCW_POSITION);
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

