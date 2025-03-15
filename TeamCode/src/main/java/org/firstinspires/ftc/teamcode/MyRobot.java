package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class MyRobot {

    public DriveBase driveBase;
    public Arm arm;
    public Extension extension;
    public Claw claw;
    public WristHinge wristHinge;
    public WristRotate wristRotate;
    public Poses poses;
    public Actions actions;

    public MyRobot(HardwareMap hardwareMap) {
        this.arm = new Arm(hardwareMap);
        this.extension = new Extension(hardwareMap);
        this.claw = new Claw(hardwareMap);
        this.wristHinge = new WristHinge(hardwareMap);
        this.wristRotate = new WristRotate(hardwareMap);
        this.driveBase = new DriveBase(hardwareMap);
        this.poses = new Poses(this);
        this.actions = new Actions(this);
    }

}
