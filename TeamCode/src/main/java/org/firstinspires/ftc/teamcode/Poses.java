package org.firstinspires.ftc.teamcode;


public class Poses {

    //Constants inside the pose class
    public final int armHighBasket = 2250;
    public final int extensionHighBasket = 3600;
    public final double wristHingeHighBasket = 0.7;



    private MyRobot robot;
    public enum CurrentPose {NONE, SUBMERSIBLE_SAMPLE_INTAKE, SAMPLE_BASKET_DELIVERY, SPECIMEN_DELIVERY, SPECIMEN_INTAKE};
    public CurrentPose currentPose = CurrentPose.NONE;

    private Constants constants;


    public Poses(MyRobot robot) {
        this.robot=robot;
        this.constants = new Constants();
    }

    public void testHighBasketSampleOuttake() {
        currentPose = CurrentPose.SAMPLE_BASKET_DELIVERY;


        //Constants in the motor class
        robot.claw.close();
        robot.extension.setToHighBasketPosition();
        robot.wristHinge.setToSampleHighBasketDeliveryPosition();
        robot.wristRotate.setToCenterPosition();
        robot.arm.setToHighBasketPosition();



        //Constants inside the pose function
        final int arm = 2250;
        final int extension = 3600;
        final double wristHinge = 0.7;

        robot.claw.close();
        robot.extension.setPosition(extension);
        robot.wristHinge.setPosition(wristHinge);
        robot.wristRotate.setToCenterPosition();
        robot.arm.setPosition(arm);



        //Constants inside the pose class
        robot.claw.close();
        robot.extension.setPosition(extensionHighBasket);
        robot.wristHinge.setPosition(wristHingeHighBasket);
        robot.wristRotate.setToCenterPosition();
        robot.arm.setPosition(armHighBasket);




        //Constants in a separate dedicated class
        robot.claw.close();
        robot.extension.setPosition(constants.highBasketSampleDelivery.extension);
        robot.wristHinge.setPosition(constants.highBasketSampleDelivery.wristHinge);
        robot.wristRotate.setToCenterPosition();
        robot.arm.setPosition(constants.highBasketSampleDelivery.arm);
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
