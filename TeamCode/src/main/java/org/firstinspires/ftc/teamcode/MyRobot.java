package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.IMU;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class MyRobot {
    public ArmAttachment armAttachment;
    public DriveBase drive;
    public Poses poses;
    public Actions actions;

    public MyRobot(HardwareMap hardwareMap) {
        this.armAttachment = new ArmAttachment(hardwareMap);
        this.drive = new DriveBase(hardwareMap);
        this.poses = new Poses(this);
        this.actions = new Actions(this);
    }

}
