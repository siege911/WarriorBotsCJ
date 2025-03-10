package org.firstinspires.ftc.teamcode;


public class Poses {

    private MyRobot robot;

    public Poses(MyRobot robot) {
        this.robot=robot;
    }
    public void submersibleSampleIntake() {
        robot.armAttachment.extension.setToSampleSubmersibleIntakePosition();
        robot.armAttachment.wristHinge.setToSampleSubmersIntakePosition();
        robot.armAttachment.claw.open();
        robot.armAttachment.arm.setToSampleSubmersibleIntakePostion();
    }

    public void sampleBasketDelivery() {
        robot.armAttachment.extension.setToHighBasketPosition();
        robot.armAttachment.wristHinge.setToSampleHighBasketDeliveryPosition();
        robot.armAttachment.arm.setToHighBasketPosition();
    }

    public void specimenDelivery() {
        robot.armAttachment.arm.setToSpecimenDeliverPosition();
        robot.armAttachment.extension.setToSpecimenDeliverPosition();
        robot.armAttachment.wristHinge.setToSpecimenDeliverPosition();
        robot.armAttachment.claw.close();
    }

    public void specimenIntake() {
        robot.armAttachment.extension.setToSpecimenIntakePosition();
        robot.armAttachment.wristHinge.setToSpecimenIntakePosition();
        robot.armAttachment.claw.open();
        robot.armAttachment.arm.setToSpecimenIntakePosition();
    }
    // todo: write your code here
}
