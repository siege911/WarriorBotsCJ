// package org.firstinspires.ftc.teamcode;
// 
// import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
// import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
// import com.qualcomm.robotcore.util.ElapsedTime;
// import com.qualcomm.robotcore.hardware.DcMotor;
// import com.qualcomm.robotcore.hardware.CRServo;
// import com.qualcomm.robotcore.hardware.Servo;
// import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
// import com.qualcomm.robotcore.eventloop.opmode.OpMode;
// import org.firstinspires.ftc.robotcore.external.Telemetry;
// 
// @Autonomous (name = "Auto Right")
// 
// public class AutoRight extends LinearOpMode{
//     
// public final int ARM_START_ANGLE = 0; //Do NOT set this under 0!!!
//    public final int ARM_SAMPLE_INTAKE_ANGLE = 300;
//    public final int ARM_HIGH_BASKET_ANGLE = 2930; //Do NOT set this over 2930!!!
//    public final int ARM_SPECIMEN_INTAKE_ANGLE = 990;
//    public final int ARM_SPECIMEN_PLACE_ANGLE = 1270; 
//    
//    public final double CLAW_OPEN_POSITION = 0.5;
//    public final double CLAW_CLOSE_POSITION = 0.8;
//    
//     
// 
//    
//    
//     // http://192.168.43.1:8080
//     // the robot is to be moved facing the right not facing toward the basket
//     @Override
//     public void runOpMode() {
//         
//         //Arm arm = new Arm(hardwareMap);
//         //Drive drivebase = new Drive(hardwareMap);
//         //Claw claw = new Claw(hardwareMap);
//         //ElapsedTime runtime = new ElapsedTime();
//         MyRobot robot = new MyRobot(hardwareMap);
//         
//         waitForStart();
//         // Execute one-time code here
//         sleep(1000);
//         robot.claw.close();
//         robot.driveBase.moveRelativeByDistance(20, 0, 0.5);
//         robot.driveBase.moveRelativeByDistance(0, -13, 0.5);
//         robot.arm.setToSpecimenDeliverPosition();
//         sleep(1000);
//         robot.wristHinge.setToSpecimenDeliverPosition();
//         robot.extension.setToSpecimenDeliverPosition();
//         sleep(1000);
//         robot.driveBase.moveRelativeByDistance(12, 0, 0.5);
//         robot.claw.open();
//         robot.driveBase.moveRelativeByDistance(-5, 0, 0.5);
//         robot.extension.setToMinPosition();
//         sleep (500);
//         robot.driveBase.moveRelativeByDistance(0, 41, 0.5);
//         robot.driveBase.moveRelativeByDistance(25, 0, 0.5);
//         robot.driveBase.moveRelativeByDistance(0, 12, 0.5);
//         robot.driveBase.moveRelativeByDistance(-40, 0, 0.5);
//         robot.driveBase.moveRelativeByDistance(40, 0, .5);
//         robot.driveBase.moveRelativeByDistance(0, 14, 0.5);
//         robot.driveBase.moveRelativeByDistance(-40, 0, 0.5);
//         robot.driveBase.moveRelativeByDistance(40, 0, 0.5);
//         robot.driveBase.moveRelativeByDistance(0, 15, 0.5);
//         robot.driveBase.moveRelativeByDistance(-45, 0, 0.5);
//         
//          //robot.wristHinge.setPosition(.3);
//          //Please test this code before deleting
//          
//          
//          
//         
//         while(opModeIsActive()) {
//             //telemetry.addData("time", runtime.seconds());
//             telemetry.addData("arm:", robot.arm.getPosition());
//             telemetry.addData("claw:", robot.claw.getPosition());
//             telemetry.addData("extension:", robot.extension.getPosition());
//             telemetry.addData("wristHinge:", robot.wristHinge.getPosition());
//             telemetry.addData("wristRotate:", robot.wristRotate.getPosition());
//             telemetry.update();
//         }
//     }
// }
// 