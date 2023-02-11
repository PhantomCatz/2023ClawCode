package frc.robot;


import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;


public class catzClaw 
{

     
    private boolean catzClawOpen = true;
    private boolean catzClawClose = false; 
    public final PneumaticsModuleType PCM_TYPE = PneumaticsModuleType.CTREPCM;
    private static DoubleSolenoid clawExtendSolenoid;
    private final int CLAW_EXTEND_PCM_PORT  = 0; // when the pistion is extended the claw closes 
    private final int CLAW_RETRACT_PCM_PORT = 0; // when the pistion is retracted the claw opens 
 
    
    public catzClaw () 
    {
        clawExtendSolenoid = new DoubleSolenoid(PCM_TYPE, CLAW_EXTEND_PCM_PORT, CLAW_RETRACT_PCM_PORT); 
    
    }
    public void catzClawOpen() // claw closes
    {
        clawExtendSolenoid.set(Value.kForward);
        catzClawClose = false;
    }

    public void catzClawClose() // claw opens
    {
        clawExtendSolenoid.set(Value.kReverse);
        catzClawOpen = true;
    }

    public edu.wpi.first.wpilibj.DoubleSolenoid.Value getClawState()
    {
        return clawExtendSolenoid.get();
    }

}