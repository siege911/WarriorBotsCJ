package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;

public class ArmAttachment {
    public Arm arm;
    public Extension extension;
    public Claw claw;
    public WristHinge wristHinge;
    public WristRotate wristRotate;
    public ArmAttachment(HardwareMap hardwareMap) {
        arm = new Arm(hardwareMap);
        extension = new Extension(hardwareMap);
        claw = new Claw(hardwareMap);
        wristHinge = new WristHinge(hardwareMap);
        wristRotate = new WristRotate(hardwareMap);
    }


}
