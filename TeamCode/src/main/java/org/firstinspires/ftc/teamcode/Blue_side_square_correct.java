package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
@Autonomous (name = "left")
public class Blue_side_square_correct extends LinearOpMode {
    DcMotor frontRight;
    DcMotor frontLeft;
    DcMotor backRight;
    DcMotor backLeft;


    @Override
    public void runOpMode() throws InterruptedException {
        frontRight = hardwareMap.dcMotor.get("frontRight");
        frontLeft = hardwareMap.dcMotor.get("frontLeft");
        backRight = hardwareMap.dcMotor.get("backRight");
        backLeft = hardwareMap.dcMotor.get("backLeft");

        waitForStart();
        frontRight.setPower(.25);
        frontLeft.setPower(-.25);
        backRight.setPower(.25);
        backLeft.setPower(-.25);
        sleep(1100);

        frontRight.setPower(0);
        frontLeft.setPower(0);
        backRight.setPower(0);
        backLeft.setPower(0);
        sleep(1000);
        //turn left
        frontRight.setPower(.27);
        frontLeft.setPower(.27);
        backRight.setPower(.27);
        backLeft.setPower(.27);
        sleep(1000);

        frontRight.setPower(0);
        frontLeft.setPower(0);
        backRight.setPower(0);
        backLeft.setPower(0);
        sleep(1000);
        // going backwards
        frontRight.setPower(-.25);
        frontLeft.setPower(.25);
        backRight.setPower(-.25);
        backLeft.setPower(.25);
        sleep(1600);

        frontRight.setPower(0);
        frontLeft.setPower(0);
        backRight.setPower(0);
        backLeft.setPower(0);
        stop();


    }
}

