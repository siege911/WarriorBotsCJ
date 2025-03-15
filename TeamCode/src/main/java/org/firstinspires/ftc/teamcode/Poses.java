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
        robot.extension.setToSampleSubmersibleIntakePosition();
        robot.wristHinge.setToSampleSubmersIntakePosition();
        robot.claw.open();
        robot.arm.setToSampleSubmersibleIntakePostion();
    }

    public void sampleBasketDelivery() {
        currentPose = CurrentPose.SAMPLE_BASKET_DELIVERY;
        robot.extension.setToHighBasketPosition();
        robot.wristHinge.setToSampleHighBasketDeliveryPosition();
        robot.wristRotate.setToCenterPosition();
        robot.arm.setToHighBasketPosition();
    }

    public void specimenDelivery() {
        currentPose = CurrentPose.SPECIMEN_DELIVERY;
        robot.arm.setToSpecimenDeliverPosition();
        robot.extension.setToSpecimenDeliverPosition();
        robot.wristHinge.setToSpecimenDeliverPosition();
        robot.wristRotate.setToCenterPosition();
        robot.claw.close();
    }

    public void specimenIntake() {
        currentPose = CurrentPose.SPECIMEN_INTAKE;
        robot.extension.setToSpecimenIntakePosition();
        robot.wristHinge.setToSpecimenIntakePosition();
        robot.wristRotate.setToCenterPosition();
        robot.claw.open();
        robot.arm.setToSpecimenIntakePosition();
    }
    // todo: write your code here
}
