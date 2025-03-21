package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;


public class Arm {
    private DcMotor motor;

    //private Telemetry telemetry;

    private int MIN_POSITION = 0;
    private int MAX_POSITION = 2930;
    public final int START = 0; //Do NOT set this under 0!!!
    public final int SAMPLE_INTAKE_ANGLE_FIELD = 325;
    public final int HIGH_BASKET_ANGLE = 2250;
    public final int SPECIMEN_INTAKE_ANGLE = 450;
    public final int SPECIMEN_DELIVER_ANGLE = 1125;
    public final int ASCENT_ANGLE = 0; //Ascent not possible yet
    public final int SAMPLE_SUBMERSIBLE_INTAKE = 650;
    public final int SAMPLE_SUBMERSIBLE_GRAB_INTAKE = 480;
    public final int SAMPLE_INTAKE_HOVER = 275;
    private int HANG_START = 2930;
    private int HANG_END = 2500;

    private boolean isMoving = false;
    private int targetPosition = -1000;
    private static int positionOffset = 10;

    public Arm(HardwareMap hardwareMap){
        this.motor = hardwareMap.get(DcMotor.class, "rotaryArm");
        this.motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        this.motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        this.motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }

    public int getPosition() {
        return this.motor.getCurrentPosition();
    }

    public int getTargetPosition() {
        return targetPosition;
    }

    //Provide feedback on whether we get to our target from a "setPosition" command
    public boolean getIsAtTarget() {
        if (targetPosition != -1000) {
            if (getPosition() > targetPosition - positionOffset || getPosition() < targetPosition + positionOffset) {
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    public void moveByInput(double power){
        if(power > 0.1 && getPosition() < MAX_POSITION) {
            this.motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
            motor.setPower(power);
            isMoving = true;
            targetPosition = -1000;
        }
        else if(power < -0.1 && getPosition() > MIN_POSITION) {
            this.motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
            motor.setPower(power * 0.7);
            isMoving = true;
            targetPosition = -1000;
        }
        else if (isMoving) {
            setPosition(getPosition());
            isMoving = false;
        }

    }

    public void setPosition(int position) {
        if (position < MIN_POSITION) {
            motor.setTargetPosition(MIN_POSITION);
        } else if (position > MAX_POSITION) {
            motor.setTargetPosition(MAX_POSITION);
        } else {
            motor.setTargetPosition(position);
        }
        motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motor.setPower(1);
    }
    
    public void setToStartPosition() {
        setPosition(START);
    }
    
    public void setToMinPosition() {
        setPosition(MIN_POSITION);
    }
    public void setToMaxPosition() {
        setPosition(MAX_POSITION);
    }
    public void setToSampleIntakePosition() {
        setPosition(SAMPLE_INTAKE_ANGLE_FIELD);
    }
    public void setToHighBasketPosition() {
        setPosition(HIGH_BASKET_ANGLE);
    }
    public void setToSpecimenIntakePosition() {
        setPosition(SPECIMEN_INTAKE_ANGLE);
    }
    public void setToSpecimenDeliverPosition() {
        setPosition(SPECIMEN_DELIVER_ANGLE);
    }
    public void setToSampleSubmersibleIntakePostion() {
        setPosition(SAMPLE_SUBMERSIBLE_INTAKE);
    }
    public void setToSampleSubmersibleIntakeGrabPostion() {
        setPosition(SAMPLE_SUBMERSIBLE_GRAB_INTAKE);
    }
    public void setToHangStart() {
        setPosition(HANG_START);
    }
    public void setToHangEnd() {
        setPosition(HANG_END);
    }
    public void setToSampleIntakeHoverPosition() {
        setPosition(SAMPLE_INTAKE_HOVER);
    }
}