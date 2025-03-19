package org.firstinspires.ftc.teamcode;

public class Constants {
    public HighBasketSampleDelivery highBasketSampleDelivery;
    public WallSpecimenIntake wallSpecimenIntake;
    public GroundSpecimenIntake groundSpecimenIntake;
    public SubmersibleSampleHover submersibleSampleHover;
    public SubmersibleSampleIntake submersibleSampleIntake;
    public HighBarSpecimenDelivery highBarSpecimenDelivery;
    public Constants() {
        this.highBasketSampleDelivery = new HighBasketSampleDelivery();
        this.wallSpecimenIntake = new WallSpecimenIntake();
        this.groundSpecimenIntake = new GroundSpecimenIntake();
        this.submersibleSampleHover = new SubmersibleSampleHover();
        this.submersibleSampleIntake = new SubmersibleSampleIntake();
        this.highBarSpecimenDelivery = new HighBarSpecimenDelivery();
    }

    public static class HighBasketSampleDelivery {
        public final int arm = 2250;
        public final int extension = 3600;
        public final double wristHinge = 0.7;
    }

    public static class WallSpecimenIntake {
        public final int arm = 450;
        public final int extension = 0;
        public final double wristHinge = 0.6;
    }

    public static class GroundSpecimenIntake {
        public final int arm = 325;
        public final int extension = 0;
        public final double wristHinge = 0.2;
    }

    public static class SubmersibleSampleHover {
        public final int arm = 600;
        public final int extension = 3500;
        public final double wristHinge = 0.25;
    }

    public static class SubmersibleSampleIntake {
        public final int arm = 480;
        public final int extension = 3600;
        public final double wristHinge = 0.25;
    }

    public static class HighBarSpecimenDelivery {
        public final int arm = 1125;
        public final int extension = 2000;
        public final double wristHinge = 0.7;
    }
}
