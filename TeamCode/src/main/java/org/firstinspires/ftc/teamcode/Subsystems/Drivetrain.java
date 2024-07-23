package org.firstinspires.ftc.teamcode.Subsystems;

import static com.wolfpackmachina.bettersensors.HardwareMapProvider.hardwareMap;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Drivetrain {
    //Declare Motors
    DcMotor motor;

    public Drivetrain() {
        //Instantiate motors
        motor = hardwareMap.get();
    }

    //Callable drive functions
    public void drive(){

    }
}
