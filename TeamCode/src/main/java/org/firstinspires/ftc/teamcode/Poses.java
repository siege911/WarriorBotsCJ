package org.firstinspires.ftc.teamcode;


public class Poses {

    private MyRobot robot;
    public enum CurrentPose {NONE, SUBMERSIBLE_SAMPLE_INTAKE, SAMPLE_BASKET_DELIVERY, SPECIMEN_DELIVERY, SPECIMEN_INTAKE};
    public CurrentPose currentPose = CurrentPose.NONE;


    public Poses(MyRobot robot) {
        this.robot=robot;
    }
    public void submersibleSampleIntake() {
        currentPose = CurrentPose.SUBMERSIBLE_SAMPLE_INTAKE;
        robot.armAttachment.extension.setToSampleSubmersibleIntakePosition();
        robot.armAttachment.wristHinge.setToSampleSubmersIntakePosition();
        robot.armAttachment.claw.open();
        robot.armAttachment.arm.setToSampleSubmersibleIntakePostion();
    }

    public void sampleBasketDelivery() {
        currentPose = CurrentPose.SAMPLE_BASKET_DELIVERY;
        robot.armAttachment.extension.setToHighBasketPosition();
        robot.armAttachment.wristHinge.setToSampleHighBasketDeliveryPosition();
        robot.armAttachment.wristRotate.setToCenterPosition();
        robot.armAttachment.arm.setToHighBasketPosition();
    }

    public void specimenDelivery() {
        currentPose = CurrentPose.SPECIMEN_DELIVERY;
        robot.armAttachment.arm.setToSpecimenDeliverPosition();
        robot.armAttachment.extension.setToSpecimenDeliverPosition();
        robot.armAttachment.wristHinge.setToSpecimenDeliverPosition();
        robot.armAttachment.wristRotate.setToCenterPosition();
        robot.armAttachment.claw.close();
    }

    public void specimenIntake() {
        currentPose = CurrentPose.SPECIMEN_INTAKE;
        robot.armAttachment.extension.setToSpecimenIntakePosition();
        robot.armAttachment.wristHinge.setToSpecimenIntakePosition();
        robot.armAttachment.wristRotate.setToCenterPosition();
        robot.armAttachment.claw.open();
        robot.armAttachment.arm.setToSpecimenIntakePosition();
    }
    // todo: write your code here
}
