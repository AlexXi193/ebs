package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;
import static org.firstinspires.ftc.teamcode.Utilities.OpModeUtils.multTelemetry;

@TeleOp(name="Iterative TeleOp", group="Iterative Opmode")
public class IterativeTeleOp extends OpMode {

    //Declare Subsystems

    //Timer
    ElapsedTime runtime = new ElapsedTime();

    @Override
    public void init() {
        //Set timer to 0
        runtime.reset();
        //Code that runs when you hit init
    }

    @Override
    public void start(){
        //Code that runs when you hit start
        System.out.println("Program started!");
    }

    @Override
    public void loop() {
        //Code that *LOOPS* after you hit start
        System.out.println("");
    }

    @Override
    public void stop(){
        //Code that runs when you hit stop
        System.out.println("Program Finished.");

        multTelemetry.addData("Runtime", runtime);
        multTelemetry.update();

    }

}
