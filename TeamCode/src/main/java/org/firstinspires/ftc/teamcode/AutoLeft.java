package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous (name = "Auto Left")

public class AutoLeft extends LinearOpMode{
    
public final int ARM_START_ANGLE = 0; //Do NOT set this under 0!!!
    public final int ARM_SAMPLE_INTAKE_ANGLE = 300;
    public final int ARM_HIGH_BASKET_ANGLE = 2930; //Do NOT set this over 2930!!!
    public final int ARM_SPECIMEN_INTAKE_ANGLE = 990;
    public final int ARM_SPECIMEN_PLACE_ANGLE = 1270; 
    
    public final double CLAW_OPEN_POSITION = 0.5;
    public final double CLAW_CLOSE_POSITION = 0.8;
    
    

    
    
    // http://192.168.43.1:8080
    // the robot is to be moved facing the right not facing toward the basket
    @Override
    public void runOpMode() {

        MyRobot robot = new MyRobot(hardwareMap);
        
        waitForStart();
        //Execute one-time code here
        robot.claw.close();
        robot.wristRotate.setToStartPosition();
        robot.driveBase.moveRelativeByDistance(5, 0, 0.5);
        robot.driveBase.moveRelativeByDistance(0, -28, 0.5);
        robot.driveBase.turnToHeading(35, 0.5);
        robot.arm.setToHighBasketPosition();
        robot.extension.setToHighBasketPosition();
        robot.wristHinge.setToMinPosition();
        sleep(1000);
        // Place first sample in bucket
        robot.wristHinge.setToSampleHighBasketDeliveryPosition();
        sleep(1000);
        robot.claw.open();
        sleep(500);
        robot.wristHinge.setToSampleIntakePosition();
        sleep(500);
        robot.extension.setToMinPosition();
        sleep(250);
        //Retrieve 2nd sample
        robot.arm.setToSampleIntakePosition();
        robot.driveBase.turnToHeading(-6.5, 0.5);
        robot.driveBase.moveRelativeByDistance(14, 0, 0.5);
        robot.driveBase.moveRelativeByDistance(0, 13, 0.5);
        robot.driveBase.moveRelativeByDistance(9, 0, 0.5);
        robot.driveBase.moveRelativeByDistance(0, 5, 0.25);
        robot.driveBase.moveRelativeByDistance(0, -5, 0.25);
        robot.driveBase.moveRelativeByDistance(-1, 0, 0.5);
        robot.arm.setToSampleIntakeHoverPosition();
        robot.claw.close();
        sleep(500);
        //Place 2nd Sample in bucket
        robot.driveBase.moveRelativeByDistance(-19, 0, 0.5);
        robot.driveBase.moveRelativeByDistance(0, -16, 0.5);
        robot.driveBase.turnToHeading(35, 0.5);
        robot.driveBase.moveRelativeByDistance(-7, 0, 0.5);
        robot.arm.setToHighBasketPosition();
        robot.extension.setToHighBasketPosition();
        robot.wristHinge.setToMinPosition();
        sleep(1000);
        robot.wristHinge.setToSampleHighBasketDeliveryPosition();
        sleep(1000);
        robot.claw.open();
        sleep(500);
        robot.wristHinge.setToSampleIntakePosition();
        sleep(500);
        robot.extension.setToMinPosition();
        sleep(250);
        //retrieve 3rd sample
         robot.arm.setToSampleIntakePosition();
        robot.driveBase.turnToHeading(-6.5, 0.5);
        robot.driveBase.moveRelativeByDistance(23, 0, 0.5);
        robot.driveBase.moveRelativeByDistance(0, 9, 0.25);
        robot.driveBase.moveRelativeByDistance(0, -4.5, 0.25);
        robot.driveBase.moveRelativeByDistance(-1, 0, 0.5);
        robot.arm.setToSampleIntakeHoverPosition();
        robot.claw.close();
        sleep(500);
        //deliver 3rd sample into hgh basket
        robot.driveBase.moveRelativeByDistance(-23, 0, 0.5);
        robot.driveBase.moveRelativeByDistance(0, -8, 0.5);
        robot.driveBase.turnToHeading(35, 0.5);
        robot.arm.setToHighBasketPosition();
        robot.extension.setToHighBasketPosition();
        robot.wristHinge.setToMinPosition();
        sleep(1000);
        robot.wristHinge.setToSampleHighBasketDeliveryPosition();
        sleep(1000);
        robot.claw.open();
        sleep(500);
        robot.wristHinge.setToSampleIntakePosition();
        sleep(500);
        robot.extension.setToMinPosition();
        sleep(250);
        robot.driveBase.turnToHeading(-6.5, 0.5);
        robot.arm.setToMinPosition();
        // robot.arm.setToSpecimenIntakePosition();
        // robot.wristHinge.setToSpecimenIntakePosition();
        //robot.driveBase.turnToHeading(160,1);
        //sleep(500);
        //robot.driveBase.turnToHeading(-20,1);
        // robot.arm.setToSpecimenDeliverPosition();
        // robot.claw.close();
        // robot.wristHinge.setPosition(.7);
        // robot.extension.setToSpecimenDeliverPosition();
        // sleep(5000);
        // robot.extension.setToMinPosition();
    
        // // //  arm.setPoseIndex(3);
        // // //  arm.rotateArm(0);
        // //claw.wrist1(false, true);
        // // this is where to start when you uncomment
        // robot.arm.setToSpecimenDeliverPosition();
        // //robot.wristHinge.setToSpecimenDeliverPosition();
        // robot.driveBase.moveRelativeByDistance(0, -13, 0.5);
        // robot.driveBase.moveRelativeByDistance(35, 0, 0.5);
        //  sleep (500);
        // robot.driveBase.moveRelativeByDistance(-5, 0, 0.5);
        // robot.driveBase.moveRelativeByDistance(0, 41, 0.5);
        // robot.driveBase.moveRelativeByDistance(25, 0, 0.5);
        // robot.driveBase.moveRelativeByDistance(0, 12, 0.5);
        // robot.driveBase.moveRelativeByDistance(-40, 0, 0.5);
        // robot.driveBase.moveRelativeByDistance(40, 0, .5);
        // robot.driveBase.moveRelativeByDistance(0, 14, 0.5);
        // robot.driveBase.moveRelativeByDistance(-40, 0, 0.5);
        // robot.driveBase.moveRelativeByDistance(40, 0, 0.5);
        // robot.driveBase.moveRelativeByDistance(0, 15, 0.5);
        // robot.driveBase.moveRelativeByDistance(-45, 0, 0.5);
        
         //robot.wristHinge.setPosition(.3);
         //Please test this code before deleting
         
         
         
        
         while(opModeIsActive()) {
            //telemetry.addData("time", runtime.seconds());
            telemetry.addData("arm:", robot.arm.getPosition());
            telemetry.addData("claw:", robot.claw.getPosition());
            telemetry.addData("extension:", robot.extension.getPosition());
            telemetry.addData("wristHinge:", robot.wristHinge.getPosition());
            telemetry.addData("wristRotate:", robot.wristRotate.getPosition());
            telemetry.addData("heading:", robot.driveBase.getHeading());
            telemetry.update();
          }
    }
}
// 