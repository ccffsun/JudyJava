package ood.remoteControlProject;

public class Main {   //SimpleRemoteControl test
   public static void main (String[] args) {
       SimpleRemoteControl remote = new SimpleRemoteControl(); // new a simpleRemoteControl
       Light light = new Light();  //new a light
       LightOnCommand lightOnCommand = new LightOnCommand(light); //new a lightOnCommand
       LightOffCommand lightOffCommand = new LightOffCommand(light);

       remote.setCommand(lightOnCommand); // make the lightOnCommand as one function of the remote control.
       remote.buttonPressed();  // press the light on button
       remote.undoButterPressed(); // press the undo button

       RemoteControl remoteControl = new RemoteControl();
       CeilingFan ceilingFan = new CeilingFan();
       CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
       CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

       remoteControl.setCommand(1,lightOnCommand,lightOffCommand);
       remoteControl.setCommand(2,ceilingFanOnCommand,ceilingFanOffCommand);

       System.out.println(remoteControl);

       remoteControl.onButtonPushed(1);
       remoteControl.offButtonPushed(1);
       remoteControl.onButtonPushed(2);
       remoteControl.offButtonPushed(2);

       remoteControl.undoButtonPushed(); //undo button make the light on again.

   }
}
